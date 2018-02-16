package org.elysium.ui.refactoring;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.elysium.ui.refactoring.LilyPondRefactoringDelegate.Operation;

/**
 * Updates references to a LilyPond source file when it is renamed.
 */
public class RenameFileParticipant extends RenameParticipant {

	@Inject
	LilyPondRefactoringInjects injects;
	LilyPondRefactoringDelegate delegate;
	private IFile sourceFile;

	@Override
	protected boolean initialize(Object element) {
		sourceFile = (IFile)element;
		return injects.isSource(sourceFile);
	}

	@Override
	public String getName() {
		return LilyPondRefactoringDelegate.NAME;
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		delegate=LilyPondRefactoringDelegate.get(Operation.rename, context, injects);
		delegate.addFileToRefactor(sourceFile, getArguments());
		return new RefactoringStatus();
	}

	@Override
	public Change createPreChange(IProgressMonitor pm) throws CoreException,
			OperationCanceledException {
		return delegate.adaptIncludes(pm);
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		return delegate.apply(pm);
	}
}