package org.lilypond.hyperlinks;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.util.TextEditorUtils;

/**
 * Represents a clickable hyperlink in a score.
 */
public class ScoreToSourceHyperlink extends Composite {

	public ScoreToSourceHyperlink(Composite parent, String filename, final int lineNumber, final int columnNumber) {
		super(parent, SWT.NO_BACKGROUND);
		setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filename));
		final FileEditorInput editorInput = new FileEditorInput(file);
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				TextEditorUtils.revealPosition(editorInput, lineNumber, columnNumber, 1);
			};

		});
	}

}
