package org.elysium.validation;

import java.util.Iterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.ToplevelExpression;
import org.elysium.lilypond.Version;

/**
 * Validation rules for the LilyPond language.
 */
public class LilyPondJavaValidator extends AbstractLilyPondJavaValidator {

	public static final String HIDDEN_TOKEN_AFTER_BACKSLASH = "HIDDEN_TOKEN_AFTER_BACKSLASH"; //$NON-NLS-1$

	public static Iterator<ILeafNode> getHiddenTokensAfterBackslash(Command object) {
		ICompositeNode node = NodeModelUtils.getNode(object);
		Iterable<ILeafNode> leafNodes = node.getLeafNodes();
		for (Iterator<ILeafNode> iterator = leafNodes.iterator(); iterator.hasNext();) { // There may be hidden tokens before \
			ILeafNode leafNode = iterator.next();
			if (LilyPondConstants.BACKSLASH.equals(leafNode.getText())) {
				INode nextSibling = leafNode.getNextSibling();
				if ((nextSibling != null) && (nextSibling instanceof ILeafNode) && ((ILeafNode)nextSibling).isHidden()) {
					return iterator;
				}
			}
		}
		return null;
	}

	@Check
	public void checkNoHiddenTokenAfterBackslash(Command object) {
		if (getHiddenTokensAfterBackslash(object) != null) {
			error("Command name must immediately follow backslash", null, HIDDEN_TOKEN_AFTER_BACKSLASH);
		}
	}

	public static final String NO_VERSION = "NO_VERSION"; //$NON-NLS-1$

	@Check
	public void checkVersion(LilyPond lilyPond) {
		for (ToplevelExpression expression : lilyPond.getExpressions()) {
			if ((expression instanceof Version) || (expression instanceof Include)) {
				return;
			}
		}
		warning("Version should be specified", LilypondPackage.eINSTANCE.getLilyPond_Expressions(), NO_VERSION);
	}

}
