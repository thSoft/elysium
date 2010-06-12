package org.elysium.ui.markers;

import org.elysium.ui.Activator;

/**
 * Type names for LilyPond markers.
 */
public class MarkerTypes {

	private MarkerTypes() {
	}

	private static final String get(String id) {
		return Activator.getId() + ".markers." + id; //$NON-NLS-1$
	}

	public static final String LILYPOND_PROBLEM = get("LilyPondProblem"); //$NON-NLS-1$

	public static final String OUTDATED = get("Outdated"); //$NON-NLS-1$

	public static final String SCORE_TO_SOURCE = get("ScoreToSource"); //$NON-NLS-1$

	public static final String SOURCE_TO_SCORE = get("SourceToScore"); //$NON-NLS-1$

}
