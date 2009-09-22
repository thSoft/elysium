package org.lilypond.outline;

import org.eclipse.xtext.ui.common.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;

/**
 * Translates LilyPond outline nodes to their underlying model types for which
 * context menu contributions can be registered.
 */
public class LilyPondOutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	private static final Class<?>[] types = {};

	@Override
	public Class<?>[] getAdapterList() {
		return types;
	}

}
