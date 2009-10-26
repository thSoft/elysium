package org.lilypond.compiler;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.lilypond.preferences.LilyPondPreferencePageBase;

public class CompilerPreferencePage extends LilyPondPreferencePageBase {

	@Override
	public void createFieldEditors() {
		addField(new FileFieldEditor(CompilerPreferenceConstants.LILYPOND_PATH.name(), "Path to LilyPond executable", true, getFieldEditorParent()));
		addField(new BooleanFieldEditor(CompilerPreferenceConstants.DELETE_INTERMEDIATE_FILES.name(), "Delete intermediate files", getFieldEditorParent()));
	}

}
