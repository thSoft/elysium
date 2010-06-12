package org.elysium.ui.score;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.file.CurrentFileViewSource;

/**
 * A source for the score compiled from the currently edited file.
 */
public class CurrentScoreViewSource extends CurrentFileViewSource {

	@Override
	protected IFile getFile(IFile currentFile) {
		return ScoreView.getScoreFile(currentFile);
	}

}
