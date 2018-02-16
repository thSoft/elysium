package org.elysium.ui.syntaxcoloring;

import static org.elysium.ui.syntaxcoloring.LilyPondHighlightingConfiguration.COMMAND_ID;

import javax.util.collections.IterableIterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.SpecialCommand;
import org.elysium.lilypond.StringIndication;
import org.elysium.lilypond.UnparsedCommand;

/**
 * Assigns semantic highlighting styles to ranges of text based on LilyPond
 * nodes.
 */
public class LilyPondSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if (resource != null) {
			EObject root = resource.getParseResult().getRootASTElement();
			if (root != null) {
				for (EObject element : new IterableIterator<EObject>(root.eAllContents())) {
					if(cancelIndicator.isCanceled()){
						return;
					}
					if (element instanceof Reference) {
						Reference reference = (Reference)element;
						Assignment assignment = reference.getAssignment();
						if (assignment != null) {
							String name = assignment.getName();
							if (name != null) {
								highlight(acceptor, element, name);
							}
						}
					} else if (element instanceof UnparsedCommand) {
						UnparsedCommand unparsedCommand = (UnparsedCommand)element;
						String name = unparsedCommand.getCommand();
						if (name != null) {
							highlight(acceptor, element, name);
						}
					} else if (element instanceof SpecialCommand) {
						SpecialCommand specialCommand = (SpecialCommand)element;
						String keyword = specialCommand.getKeyword();
						if (keyword != null) {
							highlight(acceptor, element, keyword);
						}
					} else if (element instanceof StringIndication) {
						StringIndication stringIndication = (StringIndication)element;
						int stringNumber = stringIndication.getString();
						highlight(acceptor, element, String.valueOf(stringNumber));
					}
				}
			}
		}
	}

	private static void highlight(IHighlightedPositionAcceptor acceptor, EObject element, String name) {
		acceptor.addPosition(NodeModelUtils.getNode(element).getOffset(), name.length() + 1, COMMAND_ID);
	}

}
