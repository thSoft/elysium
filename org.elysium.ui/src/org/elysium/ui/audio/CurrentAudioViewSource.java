package org.elysium.ui.audio;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.file.source.CurrentFileViewSource;

/**
 * A source for the audio compiled from the currently edited file.
 */
public class CurrentAudioViewSource extends CurrentFileViewSource {

	@Override
	protected IFile deriveFile(IFile currentFile) {
		return AudioViewType.getAudioFile(currentFile);
	}

	@Override
	public String getLongName() {
		return "Audio of the currently edited file";
	}

}
