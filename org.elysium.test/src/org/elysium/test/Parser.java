package org.elysium.test;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.elysium.LilyPondStandaloneSetup;

public class Parser extends AbstractXtextTests {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(LilyPondStandaloneSetup.class);
	}

	public void testSimple() throws Exception {
		getModel("{ c' }");
	}

}
