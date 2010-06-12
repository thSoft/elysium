package org.elysium.ui.markers;

/**
 * Attribute names for LilyPond markers.
 */
public enum MarkerAttributes {

	/**
	 * The column number in a source file. Integer. 1-based.
	 */
	COLUMN_NUMBER,

	/**
	 * The line of the compiler's output corresponding to a problem marker.
	 * String.
	 */
	COMPILER_OUTPUT,

	/**
	 * The workspace-relative path of the target file. String.
	 */
	TARGET_PATH,

	/**
	 * The page number in a score file. Integer. 1-based.
	 */
	PAGE,

	LEFT,

	TOP,

	RIGHT,

	BOTTOM

}
