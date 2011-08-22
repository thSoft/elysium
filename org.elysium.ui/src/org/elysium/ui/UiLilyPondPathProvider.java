package org.elysium.ui;

import org.elysium.importuri.DefaultLilyPondPathProvider;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

/**
 * Determines LilyPond paths from Eclipse preferences.
 */
public class UiLilyPondPathProvider implements ILilyPondPathProvider {

	@Override
	public String getLilyPondPath() {
		return Activator.getInstance().getPreferenceStore().getString(CompilerPreferenceConstants.LILYPOND_PATH.name());
	}

	@Override
	public Iterable<String> getSearchPaths() {
		return getTheSearchPaths();
	}

	public static Iterable<String> getTheSearchPaths() {
		return DefaultLilyPondPathProvider.parse(Activator.getInstance().getPreferenceStore().getString(CompilerPreferenceConstants.SEARCH_PATHS.name()));
	}

}
