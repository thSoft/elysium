package org.elysium.ui.refactoring;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;

public class RenameFolderParticipant extends RenameParticipant {

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
		return null;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		String newName = getArguments().getNewName();
		return RefactoringSupport.createChange(folder, folder.getParent().getFolder(new Path(newName)));
	}

}
