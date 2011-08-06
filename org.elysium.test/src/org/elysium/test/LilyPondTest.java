package org.elysium.test;

import org.eclipse.xtext.junit.AbstractXtextTests;
import org.elysium.LilyPondStandaloneSetup;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public abstract class LilyPondTest extends AbstractXtextTests {

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		with(LilyPondStandaloneSetup.class);
	}

}
