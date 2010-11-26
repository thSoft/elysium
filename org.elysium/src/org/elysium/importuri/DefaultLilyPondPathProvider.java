package org.elysium.importuri;

/**
 * Determines LilyPond's path from a system property.
 */
public class DefaultLilyPondPathProvider implements ILilyPondPathProvider {

	@Override
	public String get() {
		return System.getProperty("lilypond.path"); //$NON-NLS-1$
	}

}
