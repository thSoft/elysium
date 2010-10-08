package org.elysium.ui.syntaxcoloring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.MarkupCommand;
import org.elysium.lilypond.Reference;

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
				if (element instanceof Reference) {
					Reference reference = (Reference)element;
					Assignment assignment = reference.getAssignment();
					if (assignment != null) {
						String name = assignment.getName();
						if (name != null) {
							acceptor.addPosition(node.getOffset(), name.length() + 1, DefaultHighlightingConfiguration.KEYWORD_ID);
						}
					}
				} else if (element instanceof MarkupCommand) {
					MarkupCommand markupCommand = (MarkupCommand)element;
					String name = markupCommand.getCommand();
					if (name != null) {
						acceptor.addPosition(node.getOffset(), name.length() + 1, DefaultHighlightingConfiguration.KEYWORD_ID);
					}
				}
			}
		}
	}

}
