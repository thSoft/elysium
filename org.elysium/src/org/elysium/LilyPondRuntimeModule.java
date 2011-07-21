package org.elysium;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.validation.INamesAreUniqueValidationHelper;
import org.elysium.conversion.LilyPondValueConverterService;
import org.elysium.importuri.DefaultLilyPondPathProvider;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.resource.LilyPondResourceDescriptionStrategy;
import org.elysium.scoping.LilyPondImportUriGlobalScopeProvider;
import org.elysium.validation.LilyPondNamesAreUniqueValidationHelper;
import com.google.inject.Binder;

/**
 * Registers runtime components for the LilyPond DSL.
 */
public class LilyPondRuntimeModule extends AbstractLilyPondRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(IDefaultResourceDescriptionStrategy.class).to(LilyPondResourceDescriptionStrategy.class);
		binder.bind(ImportUriResolver.class).to(LilyPondImportUriResolver.class);
		binder.bind(ILilyPondPathProvider.class).to(DefaultLilyPondPathProvider.class);
		binder.bind(INamesAreUniqueValidationHelper.class).to(LilyPondNamesAreUniqueValidationHelper.class);
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
