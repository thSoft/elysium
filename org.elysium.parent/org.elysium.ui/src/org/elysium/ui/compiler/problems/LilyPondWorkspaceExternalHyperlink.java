package org.elysium.ui.compiler.problems;

import java.net.URI;

import org.eclipse.ui.console.IHyperlink;
import org.eclipse.util.TextEditorUtils;

class LilyPondWorkspaceExternalHyperlink implements IHyperlink {

	private URI file;
	private int line;
	private int column;

	public LilyPondWorkspaceExternalHyperlink(URI file, int line, int column) {
		this.file = file;
		this.line = line;
		this.column = column;
	}

	@Override
	public void linkEntered() {}

	@Override
	public void linkExited() {}

	@Override
	public void linkActivated() {
		//TODO if we are really good, we could add an annotation with the error text
		//corresponding to the issue to the editor just opened
		TextEditorUtils.revealPosition(file, line, column, 1);
	}

}
