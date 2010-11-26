package org.elysium.ui;

import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

/**
 * Determines LilyPond's path from an Eclipse preference.
 */
public class UiLilyPondPathProvider implements ILilyPondPathProvider {

	@Override
	public String get() {
		return Activator.getInstance().getPreferenceStore().getString(CompilerPreferenceConstants.LILYPOND_PATH.name());
	}

}
