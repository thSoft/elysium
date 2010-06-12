package org.elysium.ui.score.hyperlinks;

import org.eclipse.core.resources.IMarker;
import org.eclipse.xtext.ui.editor.hyperlinking.AbstractHyperlink;

/**
 * A hyperlink that links from a source region to a score region.
 */
public class SourceToScoreHyperlink extends AbstractHyperlink {

	public SourceToScoreHyperlink(IMarker marker) {
		super();
	}

	@Override
	public void open() {
		// TODO if displayed file differs from score file then set direct file view source
		// TODO navigate to page and highlight area
	}

}
