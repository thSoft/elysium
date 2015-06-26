package org.elysium.test;

import javax.inject.Inject;

import org.eclipse.xtext.junit.validation.ValidatorTester;
import org.elysium.validation.LilyPondJavaValidator;

public abstract class LilyPondTestWithValidator extends LilyPondTest {

	@Inject
	protected ValidatorTester<LilyPondJavaValidator> tester;

}
