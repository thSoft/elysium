package org.elysium.ui.preferences;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.xtext.ui.refactoring.ui.RefactoringPreferencePage;

@SuppressWarnings("restriction")
public class LilyPondRefactoringPreferencePage extends RefactoringPreferencePage {

	public static String REFACTORING_IS_ENABLED="LilyPond.Refactoring.enable";
	public static String REFACTORING_DELETE_COMPILED="LilyPond.Refactoring.DeleteCompiled";
	public static String REFACTORING_WARN_SEARCHPATH="LilyPond.Refactoring.SearchPathAffected";
	public static String REFACTORING_WARN_VARIABLE_INCLUDE="LilyPond.Refactoring.VariableInclude";
	public static String REFACTORING_WARN_DELETE_INCLUDED="LilyPond.Refactoring.DeleteIncluded";

	@Override
	protected void createFieldEditors() {
		super.createFieldEditors();
		final List<BooleanFieldEditor> dependentFields = new ArrayList<>();
		BooleanFieldEditor enabledEditor = new BooleanFieldEditor(REFACTORING_IS_ENABLED,
				"Enable Lilypond specific refactorings", getFieldEditorParent()) {
			@Override
			protected void valueChanged(boolean oldValue, boolean newValue) {
				super.valueChanged(oldValue, newValue);
				setEnablement(dependentFields, newValue);
			}

			@Override
			protected void doLoad() {
				super.doLoad();
				setEnablement(dependentFields, getBooleanValue());
			}
		};
		addField(enabledEditor);
		dependentFields.add(
				createBooleanField(REFACTORING_DELETE_COMPILED, "Delete compiled (pdf, midi) when deleting source"));
		dependentFields.add(
				createBooleanField(REFACTORING_WARN_DELETE_INCLUDED, "Warn if an indluded file is deleted"));
		dependentFields.add(
				createBooleanField(REFACTORING_WARN_SEARCHPATH, "Warn if a search path is affected by a refactoring"));
		dependentFields.add(
				createBooleanField(REFACTORING_WARN_VARIABLE_INCLUDE, "Warn if a there are variable includes (refactoring not supported)"));
	}

	private BooleanFieldEditor createBooleanField(String key, String fieldCaption) {
		BooleanFieldEditor editor = new BooleanFieldEditor(key, fieldCaption, getFieldEditorParent());
		addField(editor);
		return editor;
	}

	private void setEnablement(List<BooleanFieldEditor> editors, boolean enabled) {
		for (BooleanFieldEditor editor : editors) {
			editor.setEnabled(enabled, getFieldEditorParent());
		}
	}
}
