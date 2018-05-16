package org.elysium.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.xtext.ui.refactoring.ui.RefactoringPreferencePage;

@SuppressWarnings("restriction")
public class LilyPondRefactoringPreferencePage extends RefactoringPreferencePage {

	public static String REFACTORING_IS_ENABLED="LilyPond.Refactoring.enable";
	public static String REFACTORING_WARN_SEARCHPATH="LilyPond.Refactoring.SearchPathAffected";
	public static String REFACTORING_WARN_VARIABLE_INCLUDE="LilyPond.Refactoring.VariableInclude";

	@Override
	protected void createFieldEditors() {
		super.createFieldEditors();
		addField(new BooleanFieldEditor(REFACTORING_IS_ENABLED,
				"Enable Lilypond specific refactorings", getFieldEditorParent()));
		addField(new BooleanFieldEditor(REFACTORING_WARN_SEARCHPATH,
				"Warn if a search path is affected by a refactoring", getFieldEditorParent()));
		addField(new BooleanFieldEditor(REFACTORING_WARN_VARIABLE_INCLUDE,
				"Warn if a there are variable includes (refactoring not supported)", getFieldEditorParent()));
	}
}
