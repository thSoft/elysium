package org.eclipse.lilypond.ide.preferencePages;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.lilypond.ide.PreferenceConstants;

public class ExecutionPreferencePage extends PreferencePageBase {

	@Override
	public void createFieldEditors() {
		addField(new FileFieldEditor(PreferenceConstants.LILYPOND_PATH.name(), "Path to LilyPond executable", true, getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.DELETE_INTERMEDIATE_FILES.name(), "Delete intermediate files", getFieldEditorParent()));
	}

}
