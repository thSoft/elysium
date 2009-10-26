package org.lilypond.compiler;

/**
 * Builds textual LilyPond command-line arguments to assign its internal program
 * options.
 */
public class OptionBuilder {

	public static String build(String name, boolean value) {
		StringBuilder stringBuilder = new StringBuilder("-d"); //$NON-NLS-1$
		if (!value) {
			stringBuilder.append("no-"); //$NON-NLS-1$
		}
		stringBuilder.append(name);
		return stringBuilder.toString();
	}

}
