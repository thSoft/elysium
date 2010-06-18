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
		// TODO search for hyperlink in currently displayed score
		// TODO navigate to page, reveal and highlight area
	}

}
