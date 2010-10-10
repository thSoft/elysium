package org.elysium.formatting;

import java.util.Iterator;
import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.elysium.services.LilyPondGrammarAccess;

/**
 * Formatting rules for the LilyPond language.
 */
public class LilyPondFormatter extends AbstractDeclarativeFormatter {

	public static final String[][] BLOCK_KEYWORD_PAIRS = { { "{", "}" }, //$NON-NLS-1$ //$NON-NLS-2$
		{ "<<", ">>" } }; //$NON-NLS-1$ //$NON-NLS-2$

	@Override
	protected void configureFormatting(FormattingConfig config) {
		LilyPondGrammarAccess grammar = (LilyPondGrammarAccess)getGrammarAccess();
		// No space after
		List<Keyword> noSpaceAfter = grammar.findKeywords("\\", "#"); //$NON-NLS-1$ //$NON-NLS-2$
		for (Keyword keyword : noSpaceAfter) {
			config.setNoSpace().after(keyword);
		}
		// No space before
		List<Keyword> noSpaceBefore = grammar.findKeywords("'", ",", "(", ")"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		for (Keyword keyword : noSpaceBefore) {
			config.setNoSpace().before(keyword);
		}
		config.setNoSpace().before(grammar.getNumberRule());
		config.setNoSpace().before(grammar.getANY_OTHERRule()); // FIXME doesn't seem to apply
		// Line break after
		config.setLinewrap().after(grammar.getIncludeRule());
		config.setLinewrap(2).after(grammar.getVersionRule());
		// Blocks
		for (String[] blockKeywordPair : BLOCK_KEYWORD_PAIRS) {
			Iterator<Keyword> startKeywords = grammar.findKeywords(blockKeywordPair[0]).iterator();
			Iterator<Keyword> endKeywords = grammar.findKeywords(blockKeywordPair[1]).iterator();
			while (startKeywords.hasNext() && endKeywords.hasNext()) {
				Keyword start = startKeywords.next();
				Keyword end = endKeywords.next();
				config.setIndentation(start, end);
				config.setLinewrap().after(start);
				config.setLinewrap().before(end);
				config.setLinewrap().after(end);
			}
			// Comments
			config.setLinewrap(0, 1, 2).before(grammar.getSL_COMMENTRule());
			config.setLinewrap(0, 1, 2).before(grammar.getSCHEME_SL_COMMENTRule());
			config.setLinewrap(0, 1, 2).before(grammar.getML_COMMENTRule());
			config.setLinewrap(0, 1, 1).after(grammar.getML_COMMENTRule());
		}
	}

}
