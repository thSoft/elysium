package org.elysium.ui.compiler.updater.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.elysium.ui.preferences.AbstractLilyPondPreferencePage;

public class SyntaxUpdaterPreferencePage extends AbstractLilyPondPreferencePage {

	@Override
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(SyntaxUpdaterPreferenceConstants.UPDATE_SYNTAX.name(), "Update syntax before compiling", getFieldEditorParent()));
		addField(new BooleanFieldEditor(SyntaxUpdaterPreferenceConstants.FORCE_CURRENT_VERSION.name(), "Force updating version number to the latest", getFieldEditorParent()));
	}

}
