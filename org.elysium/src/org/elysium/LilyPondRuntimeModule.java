package org.elysium;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.validation.INamesAreUniqueValidationHelper;
import org.eclipse.xtext.validation.IssueSeveritiesProvider;
import org.elysium.conversion.LilyPondValueConverterService;
import org.elysium.importuri.DefaultLilyPondPathProvider;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.linking.LilyPondLinkingDiagnosticMessageProvider;
import org.elysium.resource.LilyPondResourceDescriptionStrategy;
import org.elysium.scoping.LilyPondImportUriGlobalScopeProvider;
import org.elysium.scoping.LilyPondSimpleLocalScopeProvider;
import org.elysium.validation.IssueCodes;
import org.elysium.validation.LilyPondIssueCodesProvider;
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
	public void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class).annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(LilyPondSimpleLocalScopeProvider.class);
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return LilyPondValueConverterService.class;
	}

	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return LilyPondImportUriGlobalScopeProvider.class;
	}

	public Class<? extends org.eclipse.xtext.validation.ConfigurableIssueCodesProvider> bindConfigurableIssueCodesProvider() {
		return IssueCodes.class;
	}

	public Class<? extends IssueSeveritiesProvider> bindIssueSeverityServiceProvider() {
		return LilyPondIssueCodesProvider.class;
	}

	public Class<? extends ILinkingDiagnosticMessageProvider.Extended> bindILinkingDiagnosticMessageProvider() {
		return LilyPondLinkingDiagnosticMessageProvider.class;
	}


}
