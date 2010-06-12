package org.elysium.ui.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.elysium.ui.Activator;

/**
 * Decorates projects with LilyPond nature.
 */
public class LilyPondProjectDecorator extends BaseLabelProvider implements ILightweightLabelDecorator {

	private static final ImageDescriptor ICON = Activator.getImageDescriptor("icons/project/Nature.png"); //$NON-NLS-1$

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if (element instanceof IProject) {
			IProject project = (IProject)element;
			try {
				if (project.hasNature(LilyPondNature.ID)) {
					decoration.addOverlay(ICON, IDecoration.TOP_LEFT);
				}
			} catch (CoreException e) {
				Activator.logError("Couldn't determine LilyPond nature", e);
			}
		}
	}

}
