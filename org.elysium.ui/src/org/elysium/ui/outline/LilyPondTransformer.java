package org.elysium.ui.outline;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;
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
public class LilyPondTransformer extends AbstractDeclarativeSemanticModelTransformer {

	public boolean consumeNode(LilyPond lilyPond) {
		return false;
	}

	public boolean consumeNode(Scheme scheme) {
		SchemeExpression value = scheme.getValue();
		return ((value != null) && (value.getValue() instanceof SchemeList));
	}

	public List<EObject> getChildren(Scheme scheme) {
		return NO_CHILDREN;
	}

	public boolean consumeNode(Text text) {
		return false;
	}

	public boolean consumeNode(Number number) {
		return false;
	}

	public boolean consumeNode(Reference reference) {
		return reference.getAssignment().getName() != null;
	}

	public boolean consumeNode(UnparsedCommand unparsedCommand) {
		return false;
	}

	public List<EObject> getChildren(UnparsedBlock unparsedBlock) {
		return NO_CHILDREN;
	}

	public boolean consumeNode(MarkupBody markupBody) {
		return false;
	}

	public List<EObject> getChildren(BlockCommand blockCommand) {
		return blockCommand.getBlock().eContents();
	}

	public List<EObject> getChildren(OutputDefinition outputDefinition) {
		return outputDefinition.getBlock().eContents();
	}

	public boolean consumeNode(Pitch pitch) {
		return false;
	}

	public List<EObject> getChildren(Pitch pitch) {
		return NO_CHILDREN;
	}

}
