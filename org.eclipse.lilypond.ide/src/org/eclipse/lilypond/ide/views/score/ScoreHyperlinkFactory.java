package org.eclipse.lilypond.ide.views.score;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.util.EditorUtils;

public class ScoreHyperlinkFactory {

	public static Control create(Composite parent, String filename, final int lineNumber, final int columnNumber) {
		Composite result = new Composite(parent, SWT.NO_BACKGROUND);
		result.setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(filename));
		final FileEditorInput editorInput = new FileEditorInput(file);
		result.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				EditorUtils.revealTextEditorPosition(editorInput, lineNumber, columnNumber, 1);
			};

		});
		return result;
	}

}
