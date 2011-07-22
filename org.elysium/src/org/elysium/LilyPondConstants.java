package org.elysium;

import java.util.Arrays;
import java.util.List;

public interface LilyPondConstants {

	/**
	 * The official extension of standalone LilyPond files.
	 */
	String EXTENSION = "ly"; //$NON-NLS-1$

	/**
	 * The official extensions of LilyPond files.
	 */
	List<String> EXTENSIONS = Arrays.asList(EXTENSION, "ily", "lyi");

	/**
	 * LilyPond counts column numbers based on this tab width value.
	 */
	int TAB_WIDTH = 8;

	/**
	 * Common prefix of LilyPond commands.
	 */
	String BACKSLASH = "\\"; //$NON-NLS-1$

}
