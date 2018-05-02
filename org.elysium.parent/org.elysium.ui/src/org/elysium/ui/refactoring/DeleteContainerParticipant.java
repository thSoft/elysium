package org.elysium.ui.refactoring;

import javax.inject.Inject;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.DeleteParticipant;
import org.elysium.ui.refactoring.LilyPondRefactoringDelegate.Operation;

public class DeleteContainerParticipant extends DeleteParticipant {

	@Inject
	LilyPondRefactoringInjects injects;

	private IContainer folder;

	@Override
	protected boolean initialize(Object element) {
		folder = (IContainer)element;
		return !injects.isLinked(folder);
	}

	@Override
	public String getName() {
		return LilyPondRefactoringDelegate.NAME;
	}

	@Override
	public RefactoringStatus checkConditions(final IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		final LilyPondRefactoringDelegate checker=LilyPondRefactoringDelegate.get(Operation.delete, context, injects);
		checker.addContainerToRefactor(folder, getArguments());
		return new RefactoringStatus();
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		return null;
	}
}