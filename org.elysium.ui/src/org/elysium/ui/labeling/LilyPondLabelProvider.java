package org.elysium.ui.labeling;

import java.text.MessageFormat;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.elysium.lilyPond.ArbitraryCommand;
import org.elysium.lilyPond.Block;
import org.elysium.lilyPond.Expression;
import org.elysium.lilyPond.LilyPond;
import org.elysium.lilyPond.Scheme;
import org.elysium.lilyPond.SchemeExpression;
import org.elysium.lilyPond.SchemeList;
import org.elysium.lilyPond.SchemeText;
import org.elysium.lilyPond.SimpleBlock;
import org.elysium.lilyPond.SpecialCommand;
import org.elysium.lilyPond.Text;

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

	public String text(Block block) {
		String label = (block instanceof SimpleBlock ? "{ }" : "<< >>"); //$NON-NLS-1$ //$NON-NLS-2$
		List<Expression> siblings = null;
		Block parentBlock = block.getParentBlock();
		if (parentBlock != null) {
			siblings = parentBlock.getExpressions();
		} else {
			LilyPond parentLilyPond = block.getParentLilyPond();
			if (parentLilyPond != null) {
				siblings = parentLilyPond.getExpressions();
			}
		}
		if (siblings != null) {
			int nodeIndex = siblings.indexOf(block);
			boolean acceptCommands = true;
			for (int i = nodeIndex - 1; i >= 0; i--) {
				Expression sibling = siblings.get(i);
				if ((sibling instanceof ArbitraryCommand) && acceptCommands) {
					ArbitraryCommand command = (ArbitraryCommand)sibling;
					String commandKeyword = command.getKeyword();
					if (commandKeyword.equals("\\new")) { //$NON-NLS-1$
						Expression context = siblings.get(i + 1);
						if (context instanceof Text) {
							String contextName = ((Text)context).getValue();
							label = MessageFormat.format("{0} {1} {2}", commandKeyword, contextName, label); //$NON-NLS-1$
							acceptCommands = false;
							nodeIndex = i;
						}
					} else if (block instanceof SimpleBlock) {
						label = MessageFormat.format("{0} {1}", commandKeyword, label); //$NON-NLS-1$
						acceptCommands = false;
						nodeIndex = i;
					}
				} else if (sibling instanceof Text) {
					Text text = (Text)sibling;
					if ((i >= 1) && text.getValue().equals("=") && (i == nodeIndex - 1) && !(siblings.get(i + 1) instanceof Text)) { //$NON-NLS-1$
						Expression assignmentId = siblings.get(i - 1);
						if (assignmentId instanceof Text) {
							Text assignmentIdText = (Text)assignmentId;
							label = MessageFormat.format("{0} = {1}", assignmentIdText.getValue(), label); //$NON-NLS-1$
							break;
						}
					}
				} else if (sibling instanceof Block) {
					break;
				}
			}
		}
		return label;
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
		// TODO search for assignment
	}

	public String text(SpecialCommand specialCommand) {
		return specialCommand.getKeyword();
	}

}
