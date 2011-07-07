package org.elysium.ui.autoedit;

import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.elysium.formatting.LilyPondFormatter;

/**
 * Auto edit strategy for LilyPond source editors.
 */
public class LilyPondAutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		configureIndentationEditStrategy(acceptor);

		for (String[] blockKeywordPair : LilyPondFormatter.BLOCK_KEYWORD_PAIRS) {
			acceptor.accept(singleLineTerminals.newInstance(blockKeywordPair[0], blockKeywordPair[1]), IDocument.DEFAULT_CONTENT_TYPE);
			acceptor.accept(multiLineTerminals.newInstance(blockKeywordPair[0], null, blockKeywordPair[1]), IDocument.DEFAULT_CONTENT_TYPE);
		}
		acceptor.accept(singleLineTerminals.newInstance("[", "]"), IDocument.DEFAULT_CONTENT_TYPE); //$NON-NLS-1$ //$NON-NLS-2$
		acceptor.accept(singleLineTerminals.newInstance("\\(", "\\)"), IDocument.DEFAULT_CONTENT_TYPE); //$NON-NLS-1$ //$NON-NLS-2$
		acceptor.accept(singleLineTerminals.newInstance("(", ")"), IDocument.DEFAULT_CONTENT_TYPE); //$NON-NLS-1$ //$NON-NLS-2$
		acceptor.accept(partitionInsert.newInstance("\"", "\""), IDocument.DEFAULT_CONTENT_TYPE);
	}

}
