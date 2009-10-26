package org.lilypond.compiler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.util.EditorUtils;
import org.lilypond.score.ScoreView;
import org.lilypond.score.ScoreViewPage;

/**
 * Compiles the currently open file.
 */
public class CompileHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile currentlyOpenFile = EditorUtils.getCurrentlyOpenFile();

		IEditorPart activeEditor = EditorUtils.getActiveEditor();
		if (activeEditor.isDirty()) {
			activeEditor.doSave(new NullProgressMonitor());
		}

		ScoreView scoreView = (ScoreView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ScoreView.ID);
		if (scoreView != null) {
			ScoreViewPage scoreViewPage = (ScoreViewPage)scoreView.getPageForPart(activeEditor);
			scoreViewPage.closeFile();
		}

		CompilerJob.Family compilerJobFamily = new CompilerJob.Family(currentlyOpenFile);
		if (Job.getJobManager().find(compilerJobFamily).length == 0) { // Do not process the same file more than one time at once
			Job compilerJob = new CompilerJob(currentlyOpenFile);
			compilerJob.schedule();
		}
		return null;
	}

}
