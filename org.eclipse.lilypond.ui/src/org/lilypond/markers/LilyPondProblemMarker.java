package org.lilypond.markers;

/**
 * Describes markers for LilyPond compilation problems.
 */
public class LilyPondProblemMarker {

	/**
	 * The marker type for LilyPond problems.
	 */
	public static final String TYPE = "org.lilypond.problemMarker"; //$NON-NLS-1$

	/**
	 * Column number marker attribute. An integer value indicating the column
	 * number for a text marker. This attribute is 1-relative.
	 */
	public static final String COLUMN_NUMBER = "columnNumber"; //$NON-NLS-1$

}
