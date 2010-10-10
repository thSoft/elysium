package org.elysium.validation;

import java.util.Iterator;
import java.util.ListIterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.validation.Check;
import org.elysium.lilypond.Command;

/**
 * Validation rules for the LilyPond language.
 */
public class LilyPondJavaValidator extends AbstractLilyPondJavaValidator {

	public static final String HIDDEN_TOKEN_AFTER_BACKSLASH = "HIDDEN_TOKEN_AFTER_BACKSLASH";

	public static Iterator<LeafNode> getHiddenTokensAfterBackslash(Command object) {
		CompositeNode node = NodeUtil.getNode(object);
		EList<LeafNode> leafNodes = node.getLeafNodes();
		for (ListIterator<LeafNode> iterator = leafNodes.listIterator(); iterator.hasNext();) { // There may be hidden tokens before \
			if ("\\".equals(iterator.next().getText())) { //$NON-NLS-1$
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

}
