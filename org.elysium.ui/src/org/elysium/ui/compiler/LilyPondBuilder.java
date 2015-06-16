package org.elysium.ui.compiler;

import static org.elysium.ui.compiler.CompilerJob.removeOutdatedMarker;
import static org.elysium.ui.markers.MarkerTypes.UP_TO_DATE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.ui.editor.SchedulingRuleFactory;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Include;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

/**
 * Performs automatic incremental build on LilyPond source files.
 */
public class LilyPondBuilder implements IXtextBuilderParticipant {

	private static final AtomicLong jobCount=new AtomicLong(0);
	private static final Map<Long, ISchedulingRule> parallelExecutionRules=new HashMap<Long, ISchedulingRule>();

	@Override
	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		Set<IFile> filesToCompile = new HashSet<IFile>();
		Set<IFile> filesMarkedAsOutdated = new HashSet<IFile>();
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
					} else {
						filesMarkedAsOutdated.add(file);
					}
				}
			}
		}
		compile(filesToCompile);
		removeOutdatedMarkers(filesMarkedAsOutdated);
	}

	public static void compile(Set<IFile> files) {
		int maxParallelCalls = Activator.getInstance().getPreferenceStore().getInt(CompilerPreferenceConstants.PARALLEL_COMPILES.name());
		addAllIncludingFiles(files);
		for (IFile file : files) {
			CompilerJob compilerJob = new CompilerJob(file);
			Job[] oldCompilerJobs = Job.getJobManager().find(compilerJob);
			for (Job oldCompilerJob : oldCompilerJobs) {
				oldCompilerJob.cancel();
			}
			long ruleIndex=jobCount.incrementAndGet()%maxParallelCalls;
			ISchedulingRule parallelExecutionRule=getParallelExecutionRule(ruleIndex);
			compilerJob.setRule(parallelExecutionRule);
			compilerJob.schedule();
		}
	}

	private static synchronized ISchedulingRule getParallelExecutionRule(Long index){
		ISchedulingRule result = parallelExecutionRules.get(index);
		if(result==null){
			result=SchedulingRuleFactory.INSTANCE.newSerialPerObjectRule(index);
			parallelExecutionRules.put(index, result);
		}
		return result;
	}

	private static void removeOutdatedMarkers(final Set<IFile> files) throws CoreException {
		addAllIncludingFiles(files);
		for (IFile file : files) {
			removeOutdatedMarker(file);
			file.createMarker(UP_TO_DATE); // Prevent readding outdated marker
		}
	}

	/**
	 * Adds all files in the workspace to the given list of files which (even
	 * indirectly) include any file in the list.
	 */
	public static void addAllIncludingFiles(Set<IFile> files) {
		Set<IProject> projects = new HashSet<IProject>();
		for (IFile file : files) {
			projects.add(file.getProject());
		}
		for (IProject project : projects) {
			projects.addAll(Arrays.asList(project.getReferencingProjects()));
		}
		for (IProject project : projects) {
			for (IFile file : org.eclipse.util.ResourceUtils.getAllFiles(project)) {
				addIfNecessary(file, files);
			}
		}
	}

	/**
	 * Adds the given file to the list of files to build if it (even indirectly)
	 * includes any of the files to build.
	 */
	private static void addIfNecessary(IFile file, Set<IFile> filesToBuild) {
		if (!filesToBuild.contains(file) && LilyPondConstants.EXTENSIONS.contains(file.getFileExtension())) {
			Set<IFile> includedFiles = getIncludedFiles(file);
			for (IFile includedFile : includedFiles) {
				if (!includedFile.equals(file)) {
					if (filesToBuild.contains(includedFile)) {
						filesToBuild.add(file);
					} else {
						addIfNecessary(includedFile, filesToBuild);
						if (filesToBuild.contains(includedFile)) {
							filesToBuild.add(file);
						}
					}
				}
			}
		}
	}

	/**
	 * Returns the files directly included in the given file.
	 */
	private static Set<IFile> getIncludedFiles(IFile file) {
		Set<IFile> result = new HashSet<IFile>();
		Resource eResource = new ResourceSetImpl().getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
		if (eResource != null) {
			for (EObject eObject : EcoreUtil2.eAllContentsAsList(eResource)) {
				if (eObject instanceof Include) {
					Include include = (Include)eObject;
					Resource includedEResource = EcoreUtil2.getResource(eResource, include.getImportURI());
					if (includedEResource != null) {
						IResource includedResource = ResourceUtils.convertEResourceToPlatformResource(includedEResource);
						if ((includedResource != null) && (includedResource instanceof IFile)) {
							IFile includedFile = (IFile)includedResource;
							result.add(includedFile);
						}
					}
				}
			}
		}
		return result;
	}

}
