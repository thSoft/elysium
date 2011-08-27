package org.elysium.validation;

import java.util.Iterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.Expression;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Version;

/**
 * Validation rules for the LilyPond language.
 */
public class LilyPondJavaValidator extends AbstractLilyPondJavaValidator {

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
			error("Command name must immediately follow backslash", null, IssueCodes.HIDDEN_TOKEN_AFTER_BACKSLASH);
		}
	}

	@Check
	public void checkVersion(LilyPond lilyPond) {
		for (Expression expression : lilyPond.getExpressions()) {
			if ((expression instanceof Version) || (expression instanceof Include)) {
				return;
			}
		}
		warning("Version should be specified", LilypondPackage.eINSTANCE.getLilyPond_Expressions(), IssueCodes.NO_VERSION);
	}

	@Check
	public void checkSelfInclude(Include include) {
		if (include.getImportURI().equals(include.eResource().getURI().lastSegment())) {
			warning("The file may include itself", LilypondPackage.eINSTANCE.getInclude_ImportURI());
		}
	}

}
