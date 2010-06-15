package org.elysium.ui.score;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.file.source.CurrentFileViewSource;

/**
 * A source for the score compiled from the currently edited file.
 */
public class CurrentScoreViewSource extends CurrentFileViewSource {

	@Override
	protected IFile deriveFile(IFile currentFile) {
		return ScoreViewType.getScoreFile(currentFile);
	}

	@Override
	public String getLongName() {
		return "Score of the currently edited file";
	}

}
