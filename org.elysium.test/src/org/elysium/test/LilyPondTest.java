package org.elysium.test;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.XtextResource;
import org.elysium.LilyPondStandaloneSetup;

public abstract class LilyPondTest extends AbstractXtextTests {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(LilyPondStandaloneSetup.class);
	}

	protected void assertValid(String model) throws Exception {
		getResourceFromString(model);
	}

	protected void assertErrors(String model, int count) throws Exception {
		getResourceAndExpect(getAsStream(model), count);
	}

	protected void assertWarnings(String model, int expectedWarnings) throws Exception {
		XtextResource resource = doGetResource(getAsStream(model), URI.createURI("mytestmodel." + getCurrentFileExtension()));
		assertEquals(resource.getWarnings().toString(), expectedWarnings, resource.getWarnings().size());
	}

}
