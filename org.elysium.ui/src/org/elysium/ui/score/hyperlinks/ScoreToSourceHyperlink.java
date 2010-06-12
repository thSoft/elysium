package org.elysium.ui.score.hyperlinks;

import org.eclipse.core.resources.IMarker;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.views.file.Activator;
import org.eclipse.util.UiUtils;

/**
 * Represents a clickable hyperlink in a score.
 */
public class ScoreToSourceHyperlink extends Composite {

	private final IMarker target;

	public ScoreToSourceHyperlink(Composite parent, IMarker target) {
		super(parent, SWT.NO_BACKGROUND);
		setCursor(new Cursor(Display.getDefault(), SWT.CURSOR_HAND));
		this.target = target;
	}

	public void onClicked() {
		try {
			IDE.openEditor(UiUtils.getWorkbenchPage(), target);
		} catch (PartInitException e) {
			Activator.logError("Couldn't jump to source position", e);
		}
	}

}
