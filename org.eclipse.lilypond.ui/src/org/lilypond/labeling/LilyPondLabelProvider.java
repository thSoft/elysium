package org.lilypond.labeling;

import org.eclipse.xtext.ui.core.DefaultLabelProvider;
import org.lilypond.lilyPond.LilyPond;

/**
 * Provides texts and images for LilyPond nodes.
 */
public class LilyPondLabelProvider extends DefaultLabelProvider {

	String image(LilyPond lilyPond) {
		return "LilyPond.png";
	}

	String text(LilyPond lilyPond) {
		return "LilyPond";
	}

}
