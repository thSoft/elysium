package org.elysium.tests;

import javax.inject.Inject;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.elysium.LilyPondStandaloneSetup;
import org.elysium.lilypond.LilyPond;
import org.junit.Before;
import org.junit.runner.RunWith;

import com.google.inject.Injector;

@RunWith(XtextRunner.class)
@InjectWith(LilyPondInjectorProvider.class)
public abstract class LilyPondTest {

	@Inject
	protected ParseHelper<LilyPond> parseHelper;
	
	@Inject
	protected ValidationTestHelper validationTestHelper;

	@Before
	public void setUp() throws Exception {
		Injector injector = new LilyPondStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
	}

}
