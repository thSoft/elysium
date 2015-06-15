package org.elysium.ui.wizard;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.elysium.ui.Activator;

public class LilyPondNewProjectFilePreferenceInitializer extends AbstractPreferenceInitializer {

	static final String USE_USER_TEMPLATE="newLilyPondProjectFileUseUserTemplate";
	static final String TEMPLATE="newLilyPondProjectFileUserTemplate";
	
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore preferenceStore = Activator.getInstance().getPreferenceStore();
		preferenceStore.setDefault(USE_USER_TEMPLATE, false);
		preferenceStore.setDefault(TEMPLATE, "Copy your template here\n\nYou can use a $ to mark the inital cursor position");
	}
}
