package org.elysium.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.elysium.lilypond.BlockCommand;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.MarkupBody;
import org.elysium.lilypond.Number;
import org.elysium.lilypond.OutputDefinition;
import org.elysium.lilypond.Pitch;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.Scheme;
import org.elysium.lilypond.SchemeExpression;
import org.elysium.lilypond.SchemeList;
import org.elysium.lilypond.Text;
import org.elysium.lilypond.UnparsedBlock;
import org.elysium.lilypond.UnparsedCommand;

/**
 * Transforms the structure of LilyPond outline nodes.
 */
public class LilyPondOutlineTreeProvider extends DefaultOutlineTreeProvider {

	protected void _createNode(IOutlineNode parentNode, LilyPond lilyPond) {
	}

	protected void _createNode(IOutlineNode parentNode, Scheme scheme) {
		SchemeExpression value = scheme.getValue();
		if ((value != null) && (value.getValue() instanceof SchemeList)) {
			createNode(parentNode, scheme);
		}
	}

	protected void _createChildren(Scheme scheme) {
	}

	protected void _createNode(IOutlineNode parentNode, Text text) {
	}

	protected void _createNode(IOutlineNode parentNode, Number number) {
	}

	protected void _createNode(IOutlineNode parentNode, Reference reference) {
		if (reference.getAssignment().getName() != null) {
			createNode(parentNode, reference);
		}
	}

	protected void _createNode(IOutlineNode parentNode, UnparsedCommand unparsedCommand) {
	}

	protected void _createChildren(IOutlineNode parentNode, UnparsedBlock unparsedBlock) {
	}

	protected void _createNode(IOutlineNode parentNode, MarkupBody markupBody) {
	}

	protected void _createChildren(IOutlineNode parentNode, BlockCommand blockCommand) {
		for (EObject element : blockCommand.getBlock().eContents()) {
			createNode(parentNode, element);
		}
	}

	protected void _createChildren(IOutlineNode parentNode, OutputDefinition outputDefinition) {
		for (EObject element : outputDefinition.getBlock().eContents()) {
			createNode(parentNode, element);
		}
	}

	protected void _createNode(IOutlineNode parentNode, Pitch pitch) {
	}

	protected void _createChildren(IOutlineNode parentNode, Pitch pitch) {
	}

}
