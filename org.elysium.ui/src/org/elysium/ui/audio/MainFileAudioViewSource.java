package org.elysium.ui.audio;

import org.eclipse.core.resources.IFile;
import org.elysium.ui.mainfile.MainFileViewSource;

/**
 * A source for the audio compiled from the main file.
 */
public class MainFileAudioViewSource extends MainFileViewSource {

	@Override
	protected IFile deriveFile(IFile mainFile) {
		return AudioViewType.getAudioFile(mainFile);
	}

	@Override
	public String getLongName() {
		return "Audio of the main file";
	}

}
