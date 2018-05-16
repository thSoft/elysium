package org.elysium.ui.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.preferences.PreferenceKey;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class LilyPondPreferenceInitializer implements IPreferenceStoreInitializer{

	@Inject
	private ConfigurableIssueCodesProvider issueCodes;

	@Override
	public void initialize(IPreferenceStoreAccess access) {
		IPreferenceStore store = access.getWritablePreferenceStore();

		for (PreferenceKey preference : issueCodes.getConfigurableIssueCodes().values()) {
			store.setDefault(preference.getId(), preference.getDefaultValue());
		}
		store.setDefault(LilyPondRefactoringPreferencePage.REFACTORING_IS_ENABLED, true);
		store.setDefault(LilyPondRefactoringPreferencePage.REFACTORING_DELETE_COMPILED, true);
		store.setDefault(LilyPondRefactoringPreferencePage.REFACTORING_ADAPT_INCLUDES, true);
		store.setDefault(LilyPondRefactoringPreferencePage.REFACTORING_WARN_DELETE_INCLUDED, true);
		store.setDefault(LilyPondRefactoringPreferencePage.REFACTORING_WARN_SEARCHPATH, true);
		store.setDefault(LilyPondRefactoringPreferencePage.REFACTORING_WARN_VARIABLE_INCLUDE, true);
	}
}