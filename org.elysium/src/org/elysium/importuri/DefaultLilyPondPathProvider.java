package org.elysium.importuri;

public class DefaultLilyPondPathProvider implements ILilyPondPathProvider {

	@Override
	public String get() {
		return System.getProperty("lilypond.path"); //$NON-NLS-1$
	}

}
