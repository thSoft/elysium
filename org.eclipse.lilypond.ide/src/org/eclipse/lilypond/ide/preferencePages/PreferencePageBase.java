package org.eclipse.lilypond.ide.preferencePages;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.lilypond.ide.Activator;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Common ancestor class for LilyPond preference pages.
 */
public abstract class PreferencePageBase extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public PreferencePageBase() {
		super(FieldEditorPreferencePage.GRID);
	}

	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	public void init(IWorkbench workbench) {
	}

}
