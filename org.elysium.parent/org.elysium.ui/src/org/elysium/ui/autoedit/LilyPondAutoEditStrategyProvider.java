package org.elysium.ui.autoedit;

import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.ui.editor.autoedit.DefaultAutoEditStrategyProvider;
import org.eclipse.xtext.ui.editor.model.TerminalsTokenTypeToPartitionMapper;
import org.elysium.formatting2.LilyPondFormatter;

/**
 * Auto edit strategy for LilyPond source editors.
 */
public class LilyPondAutoEditStrategyProvider extends DefaultAutoEditStrategyProvider {

	private static void accept(IEditStrategyAcceptor acceptor, IAutoEditStrategy strategy, String left) {
		acceptor.accept(strategy, IDocument.DEFAULT_CONTENT_TYPE);
		if(!"{".equals(left)) {//$NON-NLS-1$
			acceptor.accept(strategy, TerminalsTokenTypeToPartitionMapper.COMMENT_PARTITION);
		}
		if("%{".equals(left)) {//$NON-NLS-1$
			acceptor.accept(strategy, TerminalsTokenTypeToPartitionMapper.SL_COMMENT_PARTITION);
		}
	}

	@Override
	protected void configure(IEditStrategyAcceptor acceptor) {
		accept(acceptor, defaultIndentLineAutoEditStrategy.get(), null);
		for (String[] blockKeywordPair : LilyPondFormatter.BLOCK_KEYWORD_PAIRS) {
			String left=blockKeywordPair[0];
			accept(acceptor, singleLineTerminals.newInstance(left, blockKeywordPair[1]), left);
			accept(acceptor, multiLineTerminals.newInstance(left, null, blockKeywordPair[1]), left);
		}
		final String[][] brackets = new String[][] { { "[", "]" }, //$NON-NLS-1$ //$NON-NLS-2$
			{ "\\(", "\\)" }, //$NON-NLS-1$ //$NON-NLS-2$
			{ "(", ")" } }; //$NON-NLS-1$ //$NON-NLS-2$
		for (String[] blockKeywordPair : brackets) {
			accept(acceptor, singleLineTerminals.newInstance(blockKeywordPair[0], blockKeywordPair[1]), null);
		}
		accept(acceptor, partitionInsert.newInstance("\"", "\""), null); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
