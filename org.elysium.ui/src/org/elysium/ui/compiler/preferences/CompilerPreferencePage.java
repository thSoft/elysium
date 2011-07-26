package org.elysium.ui.compiler.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.util.MultilineStringFieldEditor;
import org.elysium.ui.preferences.AbstractLilyPondPreferencePage;

public class CompilerPreferencePage extends AbstractLilyPondPreferencePage {

	@Override
	public void createFieldEditors() {
		addField(new FileFieldEditor(CompilerPreferenceConstants.LILYPOND_PATH.name(), "Path to LilyPond executable", true, getFieldEditorParent()));
		addField(new BooleanFieldEditor(CompilerPreferenceConstants.DELETE_INTERMEDIATE_FILES.name(), "Delete intermediate files", getFieldEditorParent()));
		addField(new BooleanFieldEditor(CompilerPreferenceConstants.POINT_AND_CLICK.name(), "Point and click", getFieldEditorParent()));
		addField(new BooleanFieldEditor(CompilerPreferenceConstants.VERBOSE.name(), "Verbose output", getFieldEditorParent()));
		addField(new MultilineStringFieldEditor(CompilerPreferenceConstants.COMMAND_LINE.name(), "Additional command line options\n(separated by newline)", getFieldEditorParent()));
	}

}
