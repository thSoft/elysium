package org.elysium.ui.quickfix;

import org.apache.commons.lang.StringUtils;
import org.eclipse.xtext.ui.editor.quickfix.ISimilarityMatcher;
import org.eclipse.xtext.util.Strings;

/**
 * Smart, LilyPond-specific {@link ISimilarityMatcher}.
 */
public class LilyPondSimilarityMatcher implements ISimilarityMatcher {

	@Override
	public boolean isSimilar(String s0, String s1) {
		if (Strings.isEmpty(s0) || Strings.isEmpty(s1)) {
			return false;
		}
		double levenshteinDistance = StringUtils.getLevenshteinDistance(s0, s1);
		return levenshteinDistance <= (1 + ((s0.length() + s1.length()) / 2 / 5));
	}

}
