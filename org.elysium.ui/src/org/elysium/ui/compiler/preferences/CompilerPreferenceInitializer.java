package org.elysium.ui.compiler.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.Util;
import org.elysium.ui.Activator;

public class CompilerPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore preferenceStore = Activator.getInstance().getPreferenceStore();

		if (Util.isLinux()) {
			preferenceStore.setDefault(CompilerPreferenceConstants.LILYPOND_PATH.name(), "/usr/bin/lilypond"); //$NON-NLS-1$
		} else if (Util.isMac()) {
			preferenceStore.setDefault(CompilerPreferenceConstants.LILYPOND_PATH.name(), "/Applications/LilyPond.app/Contents/Resources/bin/lilypond"); //$NON-NLS-1$
		} else if (Util.isWindows()) {
			preferenceStore.setDefault(CompilerPreferenceConstants.LILYPOND_PATH.name(), "C:\\Program Files\\LilyPond\\usr\\bin\\lilypond.exe"); //$NON-NLS-1$
		}

		preferenceStore.setDefault(CompilerPreferenceConstants.DELETE_INTERMEDIATE_FILES.name(), true);

		preferenceStore.setDefault(CompilerPreferenceConstants.POINT_AND_CLICK.name(), true);

		preferenceStore.setDefault(CompilerPreferenceConstants.VERBOSE.name(), false);

		preferenceStore.setDefault(CompilerPreferenceConstants.SEARCH_PATHS.name(), ""); //$NON-NLS-1$

		preferenceStore.setDefault(CompilerPreferenceConstants.PARALLEL_COMPILES.name(), 5);
	}

}
