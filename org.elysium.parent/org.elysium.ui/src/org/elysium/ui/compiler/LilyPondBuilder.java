package org.elysium.ui.compiler;

import static org.eclipse.core.resources.IMarker.MESSAGE;
import static org.eclipse.core.resources.IResource.DEPTH_ZERO;
import static org.elysium.ui.markers.MarkerTypes.OUTDATED;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.outdated.OutdatedDecorator;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

/**
 * Performs automatic incremental build on LilyPond source files.
 */
public class LilyPondBuilder implements IXtextBuilderParticipant {

	private static final AtomicLong jobCount=new AtomicLong(0);
	@Inject
	private IPreferenceStore preferences;
	@Inject
	private IResourceDescriptions index;

	@Override
	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		if(context.getBuildType() != BuildType.INCREMENTAL) {
			return;
		}
		Set<IFile> filesToCompile = new HashSet<IFile>();
		for (Delta delta : context.getDeltas()) {
			URI uri = delta.getUri();
			boolean lilyPond = LilyPondConstants.EXTENSIONS.contains(uri.fileExtension());
			if (lilyPond) {
				IResource resource = ResourceUtils.findPlatformResource(uri);
				if ((resource != null) && (resource instanceof IFile)) {
					IFile file = (IFile)resource;
					boolean resourcesChangedOrCreated = delta.getNew() != null;
					boolean descriptionsChanged = delta.haveEObjectDescriptionsChanged();
					if (resourcesChangedOrCreated && descriptionsChanged) {
						filesToCompile.add(file);
					}
				}
			}
		}
		boolean doLilyPondCompile=preferences.getBoolean(CompilerPreferenceConstants.COMPILE_DURING_BUILD.name());
		boolean doDeleteMarkersIfCompilerIsInactive=preferences.getBoolean(CompilerPreferenceConstants.DELETE_ELYSIUM_MARKERS.name());
		compile(filesToCompile, doLilyPondCompile, doLilyPondCompile || doDeleteMarkersIfCompilerIsInactive, true);
	}

	private void markDirty(Set<IFile> files) {
		for (IFile iFile : files) {
			if(LilyPondConstants.EXTENSION.equals(iFile.getFileExtension())) {
				try {
					if (iFile.findMarkers(OUTDATED, false, DEPTH_ZERO).length == 0) {
						IMarker outdatedMarker = iFile.createMarker(OUTDATED);
						outdatedMarker.setAttribute(MESSAGE, "This file has been changed since it was compiled");
						// Refresh decorator
						OutdatedDecorator outdatedDecorator = OutdatedDecorator.getInstance();
						if (outdatedDecorator != null) {
							outdatedDecorator.refresh(iFile);
						}
					}
				} catch (CoreException e) {
					Activator.logError("Couldn't add LilyPond outdated markers", e);
				}
			}
		}
	}

	public void compile(Set<IFile> files) {
		compile(files, true, true, false);
	}

	private void compile(Set<IFile> files, boolean executeLilyPondCompilation, boolean deleteMarkers, boolean markDirty) {
		int maxParallelCalls = Activator.getInstance().getPreferenceStore().getInt(CompilerPreferenceConstants.PARALLEL_COMPILES.name());
		addAllIncludingFiles(files);
		if(markDirty) {
			markDirty(files);
		}
		for (IFile file : getFilesToCompile(files)) {
			CompilerJob compilerJob = new CompilerJob(file, executeLilyPondCompilation, deleteMarkers);
			Job[] oldCompilerJobs = Job.getJobManager().find(compilerJob);
			for (Job oldCompilerJob : oldCompilerJobs) {
				oldCompilerJob.cancel();
			}
			long ruleIndex=jobCount.incrementAndGet()%maxParallelCalls;
			ISchedulingRule parallelExecutionRule=new NumberedQueueSchedulingRule(ruleIndex);
			compilerJob.setRule(parallelExecutionRule);
			compilerJob.schedule();
		}
	}

	private List<IFile> getFilesToCompile(Set<IFile> allFiles){
		List<IFile> sortedFiles=new ArrayList<IFile>();
		for (IFile iFile : allFiles) {
			if(LilyPondConstants.EXTENSION.equals(iFile.getFileExtension())){
				sortedFiles.add(iFile);
			}
		}
		Collections.sort(sortedFiles, new Comparator<IFile>() {
			@Override
			public int compare(IFile o1, IFile o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		return sortedFiles;

	}

	/**
	 * Adds all files in the workspace to the given list of files which (even
	 * indirectly) include any file in the list.
	 */
	public void addAllIncludingFiles(Set<IFile> files) {
		Set<String> fileURIs=new HashSet<>();
		for (IFile iFile : files) {
			if(LilyPondConstants.EXTENSIONS.contains(iFile.getFileExtension())) {
				fileURIs.add(iFile.getLocationURI().toString());
			}
		}

		Set<String> includingURIs=new HashSet<>();

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		Iterator<IResourceDescription> indexIterator = index.getAllResourceDescriptions().iterator();
		while(indexIterator.hasNext()) {
			IResourceDescription next = indexIterator.next();
			Iterator<IReferenceDescription> lilyPonds = next.getReferenceDescriptions().iterator();
			while(lilyPonds.hasNext()) {
				IReferenceDescription ll = lilyPonds.next();
				if(ll.getEReference()==null) {
					if(fileURIs.contains(ll.getTargetEObjectUri().toString())) {
						includingURIs.add(ll.getSourceEObjectUri().toString());
					}
				}
			}
		}

		for (String uriString : includingURIs) {
			URI includingUri = URI.createURI(uriString);
			if(includingUri.isPlatform()) {
				IFile file = root.getFile(new Path(includingUri.toPlatformString(true)));
				files.add(file);
			}else if(includingUri.isFile()){
				IFile[] foundFiles = root.findFilesForLocationURI(java.net.URI.create(uriString));
				for (IFile iFile : foundFiles) {
					if(iFile.exists()) {
						files.add(iFile);
					}
				}
			}
		}
	}
}