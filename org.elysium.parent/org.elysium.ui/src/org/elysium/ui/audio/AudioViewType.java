package org.elysium.ui.audio;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.midi.MidiViewType;
import org.eclipse.util.ResourceUtils;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;

/**
 * Plays the MIDI file compiled from a LilyPond source file.
 */
public class AudioViewType extends MidiViewType {

	public static final String ID = Activator.getId() + ".views.Audio"; //$NON-NLS-1$

	/**
	 * Returns the score file compiled from the given source file.
	 */
	@Override
	public IFile getFile(IFile sourceFile) {
		String replaceExtension = "dontshow"; //$NON-NLS-1$
		if(mayHaveMatchingMidi(sourceFile)) {
			replaceExtension = EXTENSION;
		}
		return ResourceUtils.replaceExtension(sourceFile, replaceExtension);
	}

	private boolean mayHaveMatchingMidi(IFile sourceFile) {
		String extension=sourceFile.getFileExtension();
		return LilyPondConstants.EXTENSION.equals(extension) || LilyPondConstants.COMPILED_EXTENSIONS.contains(extension);
	}

}
