package org.elysium.ui.outline;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;
import org.elysium.lilypond.Expression;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.Number;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.Scheme;
import org.elysium.lilypond.SchemeExpression;
import org.elysium.lilypond.SchemeList;
import org.elysium.lilypond.Text;

/**
 * Transforms the structure of LilyPond outline nodes.
 */
public class LilyPondTransformer extends AbstractDeclarativeSemanticModelTransformer {

	public boolean consumeNode(LilyPond lilyPond) {
		return false;
	}

	public boolean consumeNode(Scheme scheme) {
		SchemeExpression value = scheme.getValue();
		return ((value != null) && !value.isQuoted() && (value.getValue() instanceof SchemeList));
	}

	public List<EObject> getChildren(Scheme scheme) {
		return NO_CHILDREN;
	}

	public boolean consumeNode(Expression expression) {
		return !((expression instanceof Text) || (expression instanceof Number));
	}

	public boolean consumeNode(Reference reference) {
		return reference.getAssignment().getName() != null;
	}

}
