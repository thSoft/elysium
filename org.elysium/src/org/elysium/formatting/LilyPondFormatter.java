package org.elysium.formatting;

import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.elysium.LilyPondConstants;
import org.elysium.services.LilyPondGrammarAccess;

/**
 * Formatting rules for the LilyPond language.
 */
public class LilyPondFormatter extends AbstractDeclarativeFormatter {

	public static final String[][] BLOCK_KEYWORD_PAIRS = { { "%{", "%}" }, //$NON-NLS-1$ //$NON-NLS-2$ 
		{ "{", "}" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "<<", ">>" } }; //$NON-NLS-1$ //$NON-NLS-2$

	@Override
	protected void configureFormatting(FormattingConfig config) {
		LilyPondGrammarAccess grammar = (LilyPondGrammarAccess)getGrammarAccess();
		// No space
		List<Keyword> noSpaceAfter = grammar.findKeywords(LilyPondConstants.BACKSLASH, "#"); //$NON-NLS-1$
		for (Keyword keyword : noSpaceAfter) {
			config.setNoSpace().after(keyword);
		}
		List<Keyword> noSpaceBefore = grammar.findKeywords("'", ",", "(", ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		for (Keyword keyword : noSpaceBefore) {
			config.setNoSpace().before(keyword);
		}
		config.setNoSpace().before(grammar.getNumberRule());
		config.setNoSpace().before(grammar.getANY_OTHERRule()); // FIXME doesn't seem to apply
		// Line wrap
		config.setLinewrap().after(grammar.getIncludeRule());
		config.setLinewrap(2).after(grammar.getVersionRule());
		config.setLinewrap(2).after(grammar.getAssignmentRule());
//		config.setLinewrap().after(grammar.getPropertyAssignmentRule());
		// Blocks
		for (String[] blockKeywordPair : BLOCK_KEYWORD_PAIRS) {
			for (Pair<Keyword, Keyword> pair : grammar.findKeywordPairs(blockKeywordPair[0], blockKeywordPair[1])) {
				Keyword first = pair.getFirst();
				Keyword second = pair.getSecond();
				config.setIndentation(first, second);
				config.setLinewrap().after(first);
				config.setLinewrap().before(second);
				config.setLinewrap().after(second);
			}
		}
		// Comments
		config.setLinewrap(0, 1, 2).before(grammar.getSL_COMMENTRule());
		config.setLinewrap(0, 1, 2).before(grammar.getML_COMMENTRule());
		config.setLinewrap(0, 1, 1).after(grammar.getML_COMMENTRule());
		config.setLinewrap(0, 1, 2).before(grammar.getSCHEME_ML_COMMENTRule());
		config.setLinewrap(0, 1, 1).after(grammar.getSCHEME_ML_COMMENTRule());
	}

}
