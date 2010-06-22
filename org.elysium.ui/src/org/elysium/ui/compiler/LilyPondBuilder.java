package org.elysium.ui.compiler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.util.ResourceUtils;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.elysium.LilyPondConstants;
import org.elysium.lilyPond.Include;

/**
 * Performs automatic incremental build on LilyPond source files.
 */
public class LilyPondBuilder implements IXtextBuilderParticipant {

	@Override
	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		IProject builtProject = context.getBuiltProject();
		// Get all files to build
		Set<IFile> filesToBuild = new HashSet<IFile>();
		for (Delta delta : context.getDeltas()) {
			if ((delta.getNew() != null) && (delta.getOld() != null)) { // If file changed
				IResource resource = ResourceUtils.findPlatformResource(delta.getUri());
				if ((resource != null) && (resource instanceof IFile)) {
					filesToBuild.add((IFile)resource);
				}
			}
		}
		addAllIncludingFiles(builtProject, filesToBuild);
		// Build them
		for (IFile file : filesToBuild) {
			CompilerJob compilerJob = new CompilerJob(file);
			Job[] oldCompilerJobs = Job.getJobManager().find(compilerJob);
			for (Job oldCompilerJob : oldCompilerJobs) {
				oldCompilerJob.cancel();
			}
			compilerJob.schedule();
		}
	}

	/**
	 * Adds all files in the workspace to the given list of files which (even
	 * indirectly) include any file in the list.
	 */
	public static void addAllIncludingFiles(IProject project, Set<IFile> files) {
		List<IProject> referencingProjects = new ArrayList<IProject>(Arrays.asList(project.getReferencingProjects()));
		referencingProjects.add(project);
		for (IProject referencingProject : referencingProjects) {
			for (IFile file : org.eclipse.util.ResourceUtils.getAllFiles(referencingProject)) {
				addIfNecessary(file, files);
			}
		}
	}

	/**
	 * Adds the given file to the list of files to build if it (even indirectly)
	 * includes any of the files to build.
	 */
	private static void addIfNecessary(IFile file, Set<IFile> filesToBuild) {
		if (!filesToBuild.contains(file) && Arrays.asList(LilyPondConstants.EXTENSIONS).contains(file.getFileExtension())) {
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
