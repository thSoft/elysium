package org.elysium.ui.audio;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.midi.MidiViewType;
import org.eclipse.util.ResourceUtils;
import org.elysium.ui.Activator;

/**
 * Plays the MIDI file compiled from a LilyPond source file.
 */
public class AudioViewType extends MidiViewType {

	public static final String ID = Activator.getId() + ".views.Audio"; //$NON-NLS-1$

	/**
	 * Returns the score file compiled from the given source file.
	 */
	public static IFile getAudioFile(IFile sourceFile) {
		return ResourceUtils.replaceExtension(sourceFile, EXTENSION);
	}

}
