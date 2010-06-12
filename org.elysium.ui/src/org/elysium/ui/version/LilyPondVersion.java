package org.elysium.ui.version;

/**
 * Returns the version of LilyPond run by the user.
 */
public class LilyPondVersion {

	private LilyPondVersion() {
	}

	public static String get() {
		// TODO query version by running LilyPond
		return "2.12.3"; //$NON-NLS-1$
	}

}
