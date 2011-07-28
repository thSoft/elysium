package org.elysium.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.linking.ILinkingDiagnosticMessageProvider;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.eclipse.xtext.ui.editor.quickfix.ISimilarityMatcher;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider;
import org.eclipse.xtext.ui.shared.Access;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.linking.LilyPondLinkingDiagnosticMessageProvider;
import org.elysium.ui.autoedit.LilyPondAutoEditStrategyProvider;
import org.elysium.ui.hyperlinks.LilyPondHyperlinkHelper;
import org.elysium.ui.outline.FilterIncludesContribution;
import org.elysium.ui.quickfix.LilyPondSimilarityMatcher;
import org.elysium.ui.syntaxcoloring.LilyPondHighlightingConfiguration;
import org.elysium.ui.syntaxcoloring.LilyPondSemanticHighlightingCalculator;
import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;

/**
 * Registers UI components to be used within the LilyPond IDE.
 */
public class LilyPondUiModule extends AbstractLilyPondUiModule {

	public static final String ICONS = "icons/"; //$NON-NLS-1$

	public static final String NODES = ICONS + "nodes/"; //$NON-NLS-1$

	public LilyPondUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		// Icon path
		binder.bind(String.class).annotatedWith(Names.named("org.eclipse.xtext.ui.PluginImageHelper.pathSuffix")).toInstance(NODES); //$NON-NLS-1$
		// Hyperlinks
		binder.bind(IHyperlinkHelper.class).to(LilyPondHyperlinkHelper.class);
		// Syntax coloring
		binder.bind(IHighlightingConfiguration.class).to(LilyPondHighlightingConfiguration.class);
		binder.bind(ISemanticHighlightingCalculator.class).to(LilyPondSemanticHighlightingCalculator.class);
		// Import URI resolution
		binder.bind(ILilyPondPathProvider.class).to(UiLilyPondPathProvider.class);
		// Customized linking errors
		binder.bind(ILinkingDiagnosticMessageProvider.class).to(LilyPondLinkingDiagnosticMessageProvider.class);
		// Quick fixes
		binder.bind(ISimilarityMatcher.class).to(LilyPondSimilarityMatcher.class);
	}

	@Override
	public Class<? extends IXtextEditorCallback> bindIXtextEditorCallback() {
		return LilyPondEditorCallback.class;
	}

	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return LilyPondAutoEditStrategyProvider.class;
	}

	public void configureFilterIncludesContribution(Binder binder) {
		binder.bind(IOutlineContribution.class).annotatedWith(FilterIncludesContribution.Annotation.class).to(FilterIncludesContribution.class);
	}

	// Avoid dependency on JDT

	@Override
	public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		return ResourceForIEditorInputFactory.class;
	}

	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return SimpleResourceSetProvider.class;
	}

	@Override
	public Provider<IAllContainersState> provideIAllContainersState() {
		return Access.getWorkspaceProjectsState();
	}

}
