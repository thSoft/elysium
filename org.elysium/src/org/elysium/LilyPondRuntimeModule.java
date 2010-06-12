package org.elysium;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.elysium.conversion.LilyPondValueConverterService;

/**
 * Registers runtime components to be used within the LilyPond IDE.
 */
public class LilyPondRuntimeModule extends AbstractLilyPondRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return LilyPondValueConverterService.class;
	}

}
