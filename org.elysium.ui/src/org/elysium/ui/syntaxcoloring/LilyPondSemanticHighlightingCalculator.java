package org.elysium.ui.syntaxcoloring;

import static org.elysium.ui.syntaxcoloring.LilyPondHighlightingConfiguration.COMMAND_ID;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.SpecialCommand;
import org.elysium.lilypond.UnparsedCommand;

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
							highlight(acceptor, node, name);
						}
					}
				} else if (element instanceof UnparsedCommand) {
					UnparsedCommand unparsedCommand = (UnparsedCommand)element;
					String name = unparsedCommand.getCommand();
					if (name != null) {
						highlight(acceptor, node, name);
					}
				} else if (element instanceof SpecialCommand) {
					SpecialCommand specialCommand = (SpecialCommand)element;
					String keyword = specialCommand.getKeyword();
					if (keyword != null) {
						highlight(acceptor, node, keyword);
					}
				}
			}
		}
	}

	private static void highlight(IHighlightedPositionAcceptor acceptor, AbstractNode node, String name) {
		acceptor.addPosition(node.getOffset(), name.length() + 1, COMMAND_ID);
	}

}
