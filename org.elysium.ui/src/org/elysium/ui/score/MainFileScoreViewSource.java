package org.elysium.ui.score;

import org.eclipse.core.resources.IFile;
import org.elysium.ui.mainfile.MainFileViewSource;

/**
 * A source for the score compiled from the main file.
 */
public class MainFileScoreViewSource extends MainFileViewSource {

	@Override
	protected IFile deriveFile(IFile mainFile) {
		return ScoreViewType.getScoreFile(mainFile);
	}

	@Override
	public String getLongName() {
		return "Score of the main file";
	}

}
