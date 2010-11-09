package org.elysium.test;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.elysium.LilyPondStandaloneSetup;

public abstract class LilyPondTest extends AbstractXtextTests {

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(LilyPondStandaloneSetup.class);
	}

}
