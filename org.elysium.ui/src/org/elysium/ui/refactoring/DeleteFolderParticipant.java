package org.elysium.ui.refactoring;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant;
import org.elysium.ui.Activator;

public class DeleteFolderParticipant extends DeleteParticipant {

	private IFolder folder;

	@Override
	protected boolean initialize(Object element) {
		folder = (IFolder)element;
		return true;
	}

	@Override
	public String getName() {
		return RefactoringSupport.NAME;
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		final RefactoringStatus result = new RefactoringStatus();
		try {
			folder.accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile) {
						IFile sourceFile = (IFile)resource;
						result.merge(RefactoringSupport.checkConditions(sourceFile));
					}
					return true;
				}
			});
		} catch (CoreException e) {
			Activator.logError(RefactoringSupport.ERROR_MESSAGE, e);
		}
		return result;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		return null;
	}

}
