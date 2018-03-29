package org.elysium.ui.compiler.updater.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.elysium.ui.Activator;

public class SyntaxUpdaterPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore preferenceStore = Activator.getInstance().getPreferenceStore();

		preferenceStore.setDefault(SyntaxUpdaterPreferenceConstants.FORCE_CURRENT_VERSION.name(), true);
	}

}
