package org.elysium.ui.wizard;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.util.MultilineStringFieldEditor;
import org.elysium.ui.preferences.AbstractLilyPondPreferencePage;

public class LilyPondNewProjectFileTemplatePreferencePage extends AbstractLilyPondPreferencePage{

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(LilyPondNewProjectFilePreferenceInitializer.USE_USER_TEMPLATE, "Use custom template", getFieldEditorParent()));
		addField(new MultilineStringFieldEditor(LilyPondNewProjectFilePreferenceInitializer.TEMPLATE, "Custom template:", getFieldEditorParent()));
	}
}
