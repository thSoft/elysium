package org.elysium.ui.refactoring;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.elysium.LilyPondConstants;

/**
 * Updates references to a LilyPond source file when it is renamed.
 */
public class RenameLilyPondFileParticipant extends RenameParticipant {

	private IFile sourceFile;

	@Override
	protected boolean initialize(Object element) {
		sourceFile = (IFile)element;
		return LilyPondConstants.EXTENSIONS.contains(sourceFile.getFileExtension());
	}

	@Override
	public String getName() {
		return "Rename LilyPond Source File";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		return null;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		String newName = getArguments().getNewName();
		return RefactoringSupport.createChange(sourceFile, newName, sourceFile.getParent());
	}

}
