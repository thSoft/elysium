package org.elysium.ui.preferences;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.preferences.PreferenceKey;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class LilyPondValidatorPreferenceInitializer implements IPreferenceStoreInitializer{

	@Inject
	private ConfigurableIssueCodesProvider issueCodes;

	@Override
	public void initialize(IPreferenceStoreAccess access) {
		IPreferenceStore store = access.getWritablePreferenceStore();

		for (PreferenceKey preference : issueCodes.getConfigurableIssueCodes().values()) {
			store.setDefault(preference.getId(), preference.getDefaultValue());
		}
	}
}