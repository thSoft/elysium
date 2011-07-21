package org.elysium;

import java.util.Arrays;
import java.util.List;

public interface LilyPondConstants {

	/**
	 * The official extension of LilyPond files.
	 */
	String EXTENSION = "ly"; //$NON-NLS-1$

	/**
	 * The official extension of included (not standalone) LilyPond files.
	 */
	String INCLUDED_EXTENSION = "ily"; //$NON-NLS-1$

	/**
	 * The official extensions of LilyPond files.
	 */
	List<String> EXTENSIONS = Arrays.asList(EXTENSION, INCLUDED_EXTENSION);

	/**
	 * LilyPond counts column numbers based on this tab width value.
	 */
	int TAB_WIDTH = 8;

	/**
	 * Common prefix of LilyPond commands.
	 */
	String BACKSLASH = "\\"; //$NON-NLS-1$

}
