package org.elysium.ui.labeling;

import java.text.MessageFormat;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.elysium.lilyPond.Assignment;

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

	public String text(Assignment assignment) {
		return assignment.getName();
	}

}
