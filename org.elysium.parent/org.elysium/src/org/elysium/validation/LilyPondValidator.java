package org.elysium.validation;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.elysium.LilyPondConstants;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.importuri.LilyPondResolvedUri;
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

	public static final String FILE_URI_PREFIX = "file:/";

	@Inject
	private LilyPondImportUriResolver importUriResolver;

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
			LilyPondResolvedUri resolvedUriString=importUriResolver.typedResolve(include);
			if (!resolvedUriString.isResolved()) {
				addIssue("Include could not be resolved", getCurrentObject(), LilypondPackage.Literals.INCLUDE__IMPORT_URI, unresolvableIncludeCode);
			}else {
				URI resolvedUri = URI.createURI(resolvedUriString.get());
				if(!LilyPondConstants.EXTENSIONS.contains(resolvedUri.fileExtension())){
					warning("Include does not have a known file extension; this may cause unexpected linking errors", LilypondPackage.Literals.INCLUDE__IMPORT_URI);
				}
			}	
		}
		if(LilyPondImportUriResolver.isAbsolute(include.getImportURI(), LilyPondConstants.IS_WINDOWS) && !isIgnored(IssueCodes.ABSOLUTE_INCLUDE)) {
			addIssue("Include with absolute location", getCurrentObject(), LilypondPackage.Literals.INCLUDE__IMPORT_URI, IssueCodes.ABSOLUTE_INCLUDE);
		}
	}

	@Check
	public void checkWindowsIncludeNormalized(Include include) {
		if(LilyPondConstants.IS_WINDOWS && include.getImportURI()!=null) {
			String includeString = include.getImportURI();
			if(includeString.startsWith(FILE_URI_PREFIX)) {
				error("file URIs are not allowed", LilypondPackage.Literals.INCLUDE__IMPORT_URI, 0, IssueCodes.WINDOWS_NORMALIZED_INCLUDE);
			}else if(includeString.contains("\\")){
				warning("Include should not contain backslash", LilypondPackage.Literals.INCLUDE__IMPORT_URI, 0, IssueCodes.WINDOWS_NORMALIZED_INCLUDE);
			}
		}
	}
}
