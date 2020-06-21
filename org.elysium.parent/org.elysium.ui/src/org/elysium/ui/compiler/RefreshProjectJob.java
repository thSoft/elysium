package org.elysium.ui.compiler;

import static org.eclipse.core.resources.IResource.DEPTH_ZERO;
import static org.elysium.ui.markers.MarkerTypes.OUTDATED;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.outdated.OutdatedDecorator;

class RefreshProjectJob extends Job {

	private OutdatedDecorator outdatedDecorator = OutdatedDecorator.getInstance();
	private boolean markContainers;
	private boolean postCompilationRefresh;

	public RefreshProjectJob(boolean markContainers, boolean postCompilationRefresh) {
		super("refresh projects");
		this.markContainers=markContainers;
		this.postCompilationRefresh=postCompilationRefresh;
	}

	private Set<IProject> projects=new HashSet<>();
	private Set<IFile> files=new HashSet<>();
	private List<CompilerJob> jobs=new ArrayList<>();

	public void addFile(LilyPondFilesToCompile data) {
		projects.add(data.getMainFile().getProject());
		if(postCompilationRefresh) {
			files.addAll(data.getAllIncludedFiles());
		}else {
			files.addAll(data.getChangedFiles());
		}
	}

	public void waitFor(CompilerJob compilerJob) {
		jobs.add(compilerJob);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		for (CompilerJob compilerJob : jobs) {
			try {
				compilerJob.join();
			} catch (InterruptedException e) {
				//ignore
			}
		}
		for (IProject project : projects) {
			if(!monitor.isCanceled()) {
				Job refreshJob = new Job("refresh project "+project.getName()) {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						try {
							hasOutdatedMarker(project);
							project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
						} catch (CoreException e) {
							Activator.logError("Couldn't refresh project, please refresh manually", e);
						}
						return Status.OK_STATUS;
					}
					
				};
				refreshJob.setRule(null);
				refreshJob.schedule();
			}
		}
		Job refreshJob = new Job("refreshing files") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				for (IFile file : files) {
					if (!monitor.isCanceled()) {
						refreshMarker(file);
					}
				}
				return Status.OK_STATUS;
			}

		};
		refreshJob.setRule(null);
		refreshJob.schedule();
		return Status.OK_STATUS;
	}

	private boolean hasOutdatedMarker(IResource child) throws CoreException {
		if(child instanceof IFile) {
			if(markerExists(child)) {
				if(LilyPondConstants.EXTENSION.equals(child.getFileExtension())) {
					return true;
				} else {
					//delete markers left for ily files by older Elysium versions
					deleteMarker(child);
				}
			}
			return false;
		} else if(child instanceof IContainer) {
			boolean hasOutdatedChild = false;
			IResource[] members = ((IContainer)child).members();
			for (IResource iResource : members) {
				hasOutdatedChild |= hasOutdatedMarker(iResource);
			}
			if(hasOutdatedChild && markContainers) {
				if(!markerExists(child)) {
					addMarker(child);
				}
				return true;
			} else {
				deleteMarker(child);
			}
		}
		return false;
	}

	private boolean markerExists(IResource r) throws CoreException {
		return  r.findMarkers(OUTDATED, false, DEPTH_ZERO).length!=0;
	}

	private void addMarker(IResource r) throws CoreException {
		r.createMarker(OUTDATED);
		refreshMarker(r);
	}


	private void deleteMarker(IResource r) throws CoreException {
		r.deleteMarkers(OUTDATED, true, DEPTH_ZERO);
		refreshMarker(r);
	}

	private void refreshMarker(IResource r) {
		if (outdatedDecorator != null) {
			outdatedDecorator.refresh(r);
		}
	}
}