package org.elysium.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.elysium.ui.Activator;

/**
 * Common ancestor class for LilyPond preference pages.
 */
public abstract class AbstractLilyPondPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public AbstractLilyPondPreferencePage() {
		super(FieldEditorPreferencePage.GRID);
	}

	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		return Activator.getInstance().getPreferenceStore();
	}

	@Override
	public void init(IWorkbench workbench) {
	}

}
