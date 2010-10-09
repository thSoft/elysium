package org.elysium;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.elysium.conversion.LilyPondValueConverterService;
import org.elysium.resource.LilyPondResourceDescriptionManager;
import org.elysium.scoping.LilyPondImportUriGlobalScopeProvider;

/**
 * Registers runtime components to be used within the LilyPond IDE.
 */
public class LilyPondRuntimeModule extends AbstractLilyPondRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return LilyPondValueConverterService.class;
	}

	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return LilyPondImportUriGlobalScopeProvider.class;
	}

	public Class<? extends IResourceDescription.Manager> bindIResourceDescriptionsManager() {
		return LilyPondResourceDescriptionManager.class;
	}

}
