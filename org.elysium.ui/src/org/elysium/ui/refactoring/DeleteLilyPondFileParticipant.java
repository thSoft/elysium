package org.elysium.ui.refactoring;

import static java.text.MessageFormat.format;
import javax.util.collections.IterableIterator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant;
import org.eclipse.ltk.core.refactoring.resource.DeleteResourceChange;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Include;
import org.elysium.ui.Activator;

public class DeleteLilyPondFileParticipant extends DeleteParticipant {

	private IFile sourceFile;

	@Override
	protected boolean initialize(Object element) {
		sourceFile = (IFile)element;
		return LilyPondConstants.EXTENSIONS.contains(sourceFile.getFileExtension());
	}

	@Override
	public String getName() {
		return "Delete LilyPond Source File";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		final RefactoringStatus result = new RefactoringStatus();
		try {
			ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile) {
						IFile file = (IFile)resource;
						String extension = file.getFileExtension();
						if (LilyPondConstants.EXTENSIONS.contains(extension)) {
							Resource eResource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(resource.getFullPath().toString(), true), true);
							for (EObject eObject : new IterableIterator<EObject>(eResource.getAllContents())) {
								if (eObject instanceof Include) {
									Include include = (Include)eObject;
									String importUri = include.getImportURI();
									IPath basePath = file.getParent().getFullPath();
									if (basePath.append(importUri).equals(sourceFile.getFullPath())) {
										result.addWarning(format("{0} includes {1}", file.getFullPath(), sourceFile.getFullPath()));
									}
								}
							}
						}
					}
					return true;
				}

			});
		} catch (CoreException e) {
			Activator.logError("Can't find \\include statements", e);
		}
		return result;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		final CompositeChange result = new CompositeChange("Delete compiled files");
		ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {

			@Override
			public boolean visit(IResource resource) throws CoreException {
				if (resource instanceof IFile) {
					IFile file = (IFile)resource;
					String extension = file.getFileExtension();
					if (LilyPondConstants.COMPILED_EXTENSIONS.contains(extension)) {
						IPath path = file.getFullPath();
						if (path.removeFileExtension().equals(sourceFile.getFullPath().removeFileExtension())) {
							result.add(new DeleteResourceChange(path, true));
						}
					}
				}
				return true;
			}

		});
		return result;
	}

}
