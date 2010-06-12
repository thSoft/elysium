package org.elysium.ui.score;

import org.eclipse.core.resources.IFile;
import org.elysium.ui.mainfile.MainFileViewSource;

/**
 * A source for the score compiled from the main file.
 */
public class MainFileScoreViewSource extends MainFileViewSource {

	@Override
	protected IFile getFile(IFile mainFile) {
		return ScoreView.getScoreFile(mainFile);
	}

}
