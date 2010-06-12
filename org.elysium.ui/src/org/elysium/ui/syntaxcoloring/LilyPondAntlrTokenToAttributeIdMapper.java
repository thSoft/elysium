package org.elysium.ui.syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper;

/**
 * Assigns lexical highlighting styles to LilyPond tokens.
 */
public class LilyPondAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (tokenName.equals("RULE_STRING")) { //$NON-NLS-1$
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		if (tokenName.equals("RULE_INT")) { //$NON-NLS-1$
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		if (tokenName.equals("RULE_ML_COMMENT") || tokenName.equals("RULE_SL_COMMENT")) { //$NON-NLS-1$ //$NON-NLS-2$
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}

}
