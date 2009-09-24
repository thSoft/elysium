package org.eclipse.lilypond.ide.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.IDocument;
import org.eclipse.lilypond.ide.internal.CompilerJob;
import org.eclipse.lilypond.ide.internal.MarkerRemover;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.util.EditorUtils;

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

		// Ensure that LilyPond problems are removed when the file is edited again
		if (activeEditor instanceof TextEditor) {
			TextEditor activeTextEditor = (TextEditor)activeEditor;
			IEditorInput editorInput = new FileEditorInput(currentlyOpenFile);
			IDocument document = activeTextEditor.getDocumentProvider().getDocument(editorInput);
			document.addDocumentListener(new MarkerRemover(currentlyOpenFile));
		}

		CompilerJob.Family compilerJobFamily = new CompilerJob.Family(currentlyOpenFile);
		if (Job.getJobManager().find(compilerJobFamily).length == 0) { // Do not process the same file more than one time at once
			Job compilerJob = new CompilerJob(currentlyOpenFile);
			compilerJob.schedule();
		}
		return null;
	}

}
