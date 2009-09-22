package org.eclipse.lilypond.ide;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.Util;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();

		if (Util.isLinux()) {
			preferenceStore.setDefault(PreferenceConstants.LILYPOND_PATH.name(), "/usr/bin/lilypond"); //$NON-NLS-1$
		} else if (Util.isMac()) {
			preferenceStore.setDefault(PreferenceConstants.LILYPOND_PATH.name(), "/Applications/LilyPond.app/Contents/Resources/bin/lilypond"); //$NON-NLS-1$
		} else if (Util.isWindows()) {
			preferenceStore.setDefault(PreferenceConstants.LILYPOND_PATH.name(), "C:\\Program Files\\LilyPond\\usr\\bin\\lilypond.exe"); //$NON-NLS-1$
		}

		preferenceStore.setDefault(PreferenceConstants.DELETE_INTERMEDIATE_FILES.name(), true);
	}

}
