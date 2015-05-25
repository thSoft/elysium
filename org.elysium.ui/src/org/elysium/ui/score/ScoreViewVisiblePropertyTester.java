package org.elysium.ui.score;

import org.eclipse.core.expressions.PropertyTester;

public class ScoreViewVisiblePropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		return ScoreViewType.getScoreFile() != null;
	}

}
