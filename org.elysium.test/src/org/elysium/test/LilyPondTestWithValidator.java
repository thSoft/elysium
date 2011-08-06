package org.elysium.test;

import org.eclipse.xtext.junit.validation.ValidatorTester;
import org.elysium.validation.LilyPondJavaValidator;

public abstract class LilyPondTestWithValidator extends LilyPondTest {

	protected ValidatorTester<LilyPondJavaValidator> tester;

	@Override
	public void setUp() throws Exception {
		super.setUp();
		LilyPondJavaValidator validator = get(LilyPondJavaValidator.class);
		tester = new ValidatorTester<LilyPondJavaValidator>(validator, getInjector());
	}

}
