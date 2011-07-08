package org.elysium.ui.autoedit;

import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;
import org.elysium.formatting.LilyPondFormatter;

/**
 * Auto edit strategy for LilyPond source editors.
 */
public class LilyPondAutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {

	private void accept(IEditStrategyAcceptor acceptor, IAutoEditStrategy strategy) {
		acceptor.accept(strategy, IDocument.DEFAULT_CONTENT_TYPE);
		acceptor.accept(strategy, TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION);
		acceptor.accept(strategy, TerminalsTokenTypeToPartitionMapper.SL_COMMENT_PARTITION);
	}

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		configureIndentationEditStrategy(acceptor);

		for (String[] blockKeywordPair : LilyPondFormatter.BLOCK_KEYWORD_PAIRS) {
			accept(acceptor, singleLineTerminals.newInstance(blockKeywordPair[0], blockKeywordPair[1]));
			accept(acceptor, multiLineTerminals.newInstance(blockKeywordPair[0], null, blockKeywordPair[1]));
		}
		String[][] brackets = new String[][] { { "[", "]" }, //$NON-NLS-1$ //$NON-NLS-2$
			{ "\\(", "\\)" }, //$NON-NLS-1$ //$NON-NLS-2$
			{ "(", ")" } }; //$NON-NLS-1$ //$NON-NLS-2$
		for (String[] blockKeywordPair : brackets) {
			accept(acceptor, singleLineTerminals.newInstance(blockKeywordPair[0], blockKeywordPair[1]));
		}
		accept(acceptor, partitionInsert.newInstance("\"", "\"")); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
