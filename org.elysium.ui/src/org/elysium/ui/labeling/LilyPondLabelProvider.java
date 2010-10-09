package org.elysium.ui.labeling;

import java.text.MessageFormat;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.PropertyAssignment;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.Scheme;
import org.elysium.lilypond.SchemeExpression;
import org.elysium.lilypond.SchemeList;
import org.elysium.lilypond.SchemeText;
import org.elysium.lilypond.SimpleBlock;
import org.elysium.lilypond.SimultaneousBlock;
import org.elysium.lilypond.SpecialCommand;

/**
 * Provides texts and images for LilyPond outline nodes.
 */
public class LilyPondLabelProvider extends DefaultEObjectLabelProvider {

	public String text(EObject object) {
		return object.eClass().getName();
	}

	public String image(EObject object) {
		return MessageFormat.format("{0}.png", object.eClass().getName()); //$NON-NLS-1$
	}

	public String text(Scheme scheme) {
		String commandName = " "; //$NON-NLS-1$
		EList<SchemeExpression> expressions = ((SchemeList)scheme.getValue().getValue()).getExpressions();
		if (!expressions.isEmpty()) {
			SchemeExpression expression = expressions.get(0);
			if (expression.getValue() instanceof SchemeText) {
				SchemeText text = (SchemeText)expression.getValue();
				commandName = text.getValue();
			}
		}
		return MessageFormat.format("#({0})", commandName); //$NON-NLS-1$
	}

	public String text(Assignment assignment) {
		return assignment.getName();
	}

	public String text(PropertyAssignment propertyAssignment) {
		return propertyAssignment.getId();
	}

	public String text(SpecialCommand specialCommand) {
		return specialCommand.getKeyword();
	}

	public String text(Reference reference) {
		return "\\" + reference.getAssignment().getName(); //$NON-NLS-1$
	}

	public String text(SimpleBlock simpleBlock) {
		return "{ }"; //$NON-NLS-1$
	}

	public String text(SimultaneousBlock simultaneousBlock) {
		return "<< >>"; //$NON-NLS-1$
	}

}
