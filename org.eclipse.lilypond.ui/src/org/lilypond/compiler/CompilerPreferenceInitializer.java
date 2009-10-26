package org.lilypond.compiler;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.Util;
import org.lilypond.internal.LilyPondActivator;

public class CompilerPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore preferenceStore = LilyPondActivator.getInstance().getPreferenceStore();

		if (Util.isLinux()) {
			preferenceStore.setDefault(CompilerPreferenceConstants.LILYPOND_PATH.name(), "/usr/bin/lilypond"); //$NON-NLS-1$
		} else if (Util.isMac()) {
			preferenceStore.setDefault(CompilerPreferenceConstants.LILYPOND_PATH.name(), "/Applications/LilyPond.app/Contents/Resources/bin/lilypond"); //$NON-NLS-1$
		} else if (Util.isWindows()) {
			preferenceStore.setDefault(CompilerPreferenceConstants.LILYPOND_PATH.name(), "C:\\Program Files\\LilyPond\\usr\\bin\\lilypond.exe"); //$NON-NLS-1$
		}

		preferenceStore.setDefault(CompilerPreferenceConstants.DELETE_INTERMEDIATE_FILES.name(), true);
	}

}
