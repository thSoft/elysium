package org.elysium.validation;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.validation.Check;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Command;
import org.elysium.lilypond.Expression;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Version;

import com.google.inject.Inject;

/**
 * Validation rules for the LilyPond language.
 */
public class LilyPondValidator extends AbstractLilyPondValidator {

	@Inject
	private ImportUriResolver importUriResolver;

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
		String code=LilyPondConstants.isStandalone(lilyPond)?IssueCodes.NO_VERSION_STANDALONE:IssueCodes.NO_VERSION_ILY;
		if(!isIgnored(code)){
			for (Expression expression : lilyPond.getExpressions()) {
				if ((expression instanceof Version) || (expression instanceof Include)) {
					return;
				}
			}
			addIssue("Version should be specified", getCurrentObject(), LilypondPackage.Literals.LILY_POND__EXPRESSIONS, code);
		}
	}

	@Check
	public void checkInclude(Include include) {
		if (include.getImportURI() != null && include.getImportURI().equals(include.eResource().getURI().lastSegment())) {
			warning("The file may include itself", LilypondPackage.eINSTANCE.getInclude_ImportURI());
		}
		String variableIncludeCode = IssueCodes.VARIABLE_INCLUDE;
		if(!isIgnored(variableIncludeCode) && include.getCommand() != null){
			addIssue("Includes using variables are not supported by Elysium and may lead to subsequent errors", 
					getCurrentObject(),  LilypondPackage.Literals.INCLUDE__COMMAND, variableIncludeCode);
		}

		String unresolvableIncludeCode=LilyPondConstants.isStandalone(include)?IssueCodes.UNRESOLVABLE_INCLUDE_STANDALONE:IssueCodes.UNRESOLVABLE_INCLUDE_ILY;
		if(include.getImportURI()!=null && !isIgnored(unresolvableIncludeCode)){
			String resolved = importUriResolver.resolve(include);
			if (!EcoreUtil2.isValidUri(include, URI.createURI(resolved))) {
				addIssue("Include could not be resolved", getCurrentObject(), LilypondPackage.Literals.INCLUDE__IMPORT_URI, unresolvableIncludeCode);
			}
		}
	}
}
