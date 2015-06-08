package org.elysium.ui.refactoring;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.IConditionChecker;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.eclipse.ltk.core.refactoring.participants.ResourceChangeChecker;
import org.elysium.ui.Activator;

/**
 * Updates references to a LilyPond source file when it is moved.
 */
public class MoveFileParticipant extends MoveParticipant {

	private IFile sourceFile;
	private List<IFile> compiledFilesIncludedInMove=new ArrayList<IFile>();

	@Override
	protected boolean initialize(Object element) {
		sourceFile = (IFile)element;
		return RefactoringSupport.isSource(sourceFile);
	}

	@Override
	public String getName() {
		return RefactoringSupport.NAME;
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		final RefactoringStatus result = new RefactoringStatus();
		IConditionChecker checker = context.getChecker(ResourceChangeChecker.class);
		if (checker instanceof ResourceChangeChecker) {
			ResourceChangeChecker resourceChangeChecker = (ResourceChangeChecker)checker;
			IResourceDelta delta = resourceChangeChecker.getDeltaFactory().getDelta();
			try {
				delta.accept(new IResourceDeltaVisitor() {
					@Override
					public boolean visit(IResourceDelta delta) throws CoreException {
						IPath movedFromPath = delta.getMovedFromPath();
						if (movedFromPath != null) {
							IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(movedFromPath);
							if (!file.equals(sourceFile)) {
								if (RefactoringSupport.isSource(file)) {
									result.addFatalError("Moving multiple LilyPond source files is not supported");
								}
								if(RefactoringSupport.isCompiledFrom(file, sourceFile)){
									compiledFilesIncludedInMove.add(file);
								}
							}
						}
						return true;
					}
				});
			} catch (CoreException e) {
				Activator.logError("Can't check whether multiple LilyPond files are being moved", e);
			}
		}
		return result;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		IContainer destination = (IContainer)getArguments().getDestination();
		return RefactoringSupport.createChange(sourceFile, sourceFile.getName(), destination, false, compiledFilesIncludedInMove);
	}

	@Override
	public Change createPreChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		IContainer destination = (IContainer)getArguments().getDestination();
		return RefactoringSupport.createPreChange(sourceFile, destination.getFullPath(), false);
	}

}
