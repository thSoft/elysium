package org.elysium.ui.autoedit;

import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategy;
import org.elysium.formatting.LilyPondFormatter;

/**
 * Auto edit strategy for LilyPond source editors.
 */
public class LilyPondAutoEditStrategy extends DefaultAutoEditStrategy {

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		for (String[] blockKeywordPair : LilyPondFormatter.BLOCK_KEYWORD_PAIRS) {
			acceptor.accept(newMultiLineTerminals(blockKeywordPair[0], null, blockKeywordPair[1]));
		}
		acceptor.accept(newSingleLineTerminals('[', ']'));
		acceptor.accept(newSingleLineTerminals('(', ')'));
		// TODO enable this when bug 302040 is resolved: acceptor.accept(newSingleLineTerminals("\\(", "\\)")); //$NON-NLS-1$ //$NON-NLS-2$
		acceptor.accept(newSameTerminal('"'));
	}

}
