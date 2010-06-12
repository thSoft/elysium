package org.elysium;

/**
 * Initialization support for the LilyPond parser without Equinox extension
 * registry.
 */
public class LilyPondStandaloneSetup extends LilyPondStandaloneSetupGenerated {

	public static void doSetup() {
		new LilyPondStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

}
