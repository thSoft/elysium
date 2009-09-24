package org.lilypond;

import org.eclipse.xtext.ui.core.editor.utils.ValidationJob;
import org.lilypond.validation.LilyPondValidationJobFactory;

/**
 * Registers UI components to be used within the LilyPond IDE.
 */
public class LilyPondUiModule extends AbstractLilyPondUiModule {

	@Override
	public Class<? extends ValidationJob.Factory> bindValidationJob$Factory() {
		return LilyPondValidationJobFactory.class;
	}

}
