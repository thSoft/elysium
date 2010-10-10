package org.elysium.validation;

import java.util.Iterator;
import java.util.ListIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.validation.Check;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.ToplevelExpression;
import org.elysium.lilypond.Version;

/**
 * Validation rules for the LilyPond language.
 */
public class LilyPondJavaValidator extends AbstractLilyPondJavaValidator {

	public static final String HIDDEN_TOKEN_AFTER_BACKSLASH = "HIDDEN_TOKEN_AFTER_BACKSLASH"; //$NON-NLS-1$

	public static Iterator<LeafNode> getHiddenTokensAfterBackslash(Command object) {
		CompositeNode node = NodeUtil.getNode(object);
		EList<LeafNode> leafNodes = node.getLeafNodes();
		for (ListIterator<LeafNode> iterator = leafNodes.listIterator(); iterator.hasNext();) { // There may be hidden tokens before \
			if (LilyPondConstants.BACKSLASH.equals(iterator.next().getText())) {
				if (iterator.hasNext() && iterator.next().isHidden()) {
					iterator.previous();
					return iterator;
				}
			}
		}
		return null;
	}

	@Check
	public void checkNoHiddenTokenAfterBackslash(Command object) {
		if (getHiddenTokensAfterBackslash(object) != null) {
			error("Command name must immediately follow backslash", 0, HIDDEN_TOKEN_AFTER_BACKSLASH);
		}
	}

	public static final String NO_VERSION = "NO_VERSION"; //$NON-NLS-1$

	@Check
	public void checkVersion(LilyPond lilyPond) {
		for (ToplevelExpression expression : lilyPond.getExpressions()) {
			if (expression instanceof Version) {
				return;
			}
		}
		warning("Version should be specified", LilypondPackage.LILY_POND__EXPRESSIONS, NO_VERSION);
	}

}
