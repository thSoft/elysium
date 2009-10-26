package org.lilypond.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.lilypond.internal.LilyPondActivator;

/**
 * Common ancestor class for LilyPond preference pages.
 */
public abstract class LilyPondPreferencePageBase extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public LilyPondPreferencePageBase() {
		super(FieldEditorPreferencePage.GRID);
	}

	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		return LilyPondActivator.getInstance().getPreferenceStore();
	}

	public void init(IWorkbench workbench) {
	}

}
