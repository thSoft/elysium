package org.lilypond;

import org.eclipse.xtext.ui.core.editor.utils.ValidationJob;
import org.lilypond.validation.LilyPondValidationJob;
import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Registers UI components to be used within the LilyPond IDE.
 */
public class LilyPondUiModule extends AbstractLilyPondUiModule {

	@Override
	public Class<? extends ValidationJob.Factory> bindValidationJob$Factory() {
		return LilyPondValidationJob.Factory.class;
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(String.class).annotatedWith(Names.named("org.eclipse.xtext.ui.core.PluginImageHelper.pathSuffix")).toInstance("icons/labeling/");
	}

}
