package org.elysium.validation;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Singleton;

import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.preferences.PreferenceKey;
import org.eclipse.xtext.validation.ConfigurableIssueCodesProvider;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;

@SuppressWarnings("restriction")
@Singleton
public class IssueCodes extends ConfigurableIssueCodesProvider {

	private static final String PREFIX = "org.elysium.lilypond.validation.";//$NON-NLS-1$
	public static final String HIDDEN_TOKEN_AFTER_BACKSLASH = PREFIX
			+ "HIDDEN_TOKEN_AFTER_BACKSLASH"; //$NON-NLS-1$
	public static final String NO_VERSION_STANDALONE = PREFIX + "NO_VERSION_LY"; //$NON-NLS-1$
	public static final String NO_VERSION_ILY = PREFIX + "NO_VERSION_ILY"; //$NON-NLS-1$
	public static final String UNKNOWN_VARIABLE_IGNORES = PREFIX + "UNKNOWN_VARIABLE_IGNORES"; //$NON-NLS-1$
	public static final String UNKNOWN_VARIABLE_ILY = PREFIX + "UNKNOWN_VARIABLE_ILY"; //$NON-NLS-1$
	public static final String UNKNOWN_VARIABLE_STANDALONE = PREFIX + "UNKNOWN_VARIABLE_LY"; //$NON-NLS-1$
	public static final String UNRESOLVABLE_INCLUDE_STANDALONE = PREFIX + "UNRESOLVABLE_INCLUDE_LY"; //$NON-NLS-1$
	public static final String UNRESOLVABLE_INCLUDE_ILY = PREFIX + "UNRESOLVABLE_INCLUDE_ILY"; //$NON-NLS-1$
	public static final String DUPLICATE_VARIABLE = PREFIX
			+ "DUPLICATE_VARIABLE"; //$NON-NLS-1$
	public static final String VARIABLE_INCLUDE = PREFIX + "VARIABLE_INCLUDE"; //$NON-NLS-1$

	static final PreferenceKey UNKNOWN_VARIABLE_IGNORES_KEY=new PreferenceKey(UNKNOWN_VARIABLE_IGNORES, Joiner.on("\n")
			.join("discant","freeBass","stdBass"));

	private Map<String, PreferenceKey> issueCodes;

	public IssueCodes() {
		issueCodes = ImmutableMap
				.<String, PreferenceKey> builder()
				.put(create(NO_VERSION_STANDALONE, Severity.WARNING))
				.put(create(NO_VERSION_ILY, Severity.IGNORE))
				.put(create(UNKNOWN_VARIABLE_STANDALONE, Severity.ERROR))
				.put(create(UNKNOWN_VARIABLE_ILY, Severity.WARNING))
				.put(create(DUPLICATE_VARIABLE, Severity.WARNING))
				.put(UNKNOWN_VARIABLE_IGNORES_KEY.getId(), UNKNOWN_VARIABLE_IGNORES_KEY)
				.put(create(VARIABLE_INCLUDE, Severity.INFO))
				.put(create(UNRESOLVABLE_INCLUDE_STANDALONE, Severity.ERROR))
				.put(create(UNRESOLVABLE_INCLUDE_ILY, Severity.ERROR))
				.build();
	}

	private Entry<String, PreferenceKey> create(String id, Severity defaultValue) {
		return new SimpleEntry<String, PreferenceKey>(id, new PreferenceKey(id,
				defaultValue.name().toLowerCase()));
	}

	@Override
	public Map<String, PreferenceKey> getConfigurableIssueCodes() {
		return issueCodes;
	}
}
