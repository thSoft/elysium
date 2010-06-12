package org.elysium.ui.syntaxcoloring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.elysium.lilyPond.Command;
import org.elysium.lilyPond.CustomCommand;

/**
 * Assigns semantic highlighting styles to ranges of text based on LilyPond
 * nodes.
 */
public class LilyPondSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		if (resource != null) {
			for (AbstractNode node : NodeUtil.getAllContents(resource.getParseResult().getRootNode())) {
				EObject element = node.getElement();
				if (element instanceof Command) {
					Command command = (Command)element;
					boolean includeBackslash = command instanceof CustomCommand;
					acceptor.addPosition(node.getOffset(), command.getId().length() + (includeBackslash ? 1 : 0), DefaultHighlightingConfiguration.KEYWORD_ID);
				}
			}
		}
	}

}
