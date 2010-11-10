package org.elysium;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.elysium.conversion.LilyPondValueConverterService;
import org.elysium.importuri.DefaultLilyPondPathProvider;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.resource.LilyPondResourceDescriptionManager;
import org.elysium.scoping.LilyPondImportUriGlobalScopeProvider;
import com.google.inject.Binder;

/**
 * Registers runtime components to be used within the LilyPond IDE.
 */
public class LilyPondRuntimeModule extends AbstractLilyPondRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(IResourceDescription.Manager.class).to(LilyPondResourceDescriptionManager.class);
		binder.bind(ImportUriResolver.class).to(LilyPondImportUriResolver.class);
		binder.bind(ILilyPondPathProvider.class).to(DefaultLilyPondPathProvider.class);
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return LilyPondValueConverterService.class;
	}

	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return LilyPondImportUriGlobalScopeProvider.class;
	}

}
