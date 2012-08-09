package org.elysium.ui.refactoring;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;

public class MoveFolderParticipant extends MoveParticipant {

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
		IContainer destination = (IContainer)getArguments().getDestination();
		return RefactoringSupport.createChange(folder, destination.getFolder(new Path(folder.getName())));
	}

	@Override
	public Change createPreChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		IContainer destination = (IContainer)getArguments().getDestination();
		return RefactoringSupport.createPreChange(folder, destination);
	}

}
