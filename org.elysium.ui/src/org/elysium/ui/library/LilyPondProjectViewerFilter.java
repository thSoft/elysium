package org.elysium.ui.library;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.elysium.ui.Activator;
import org.elysium.ui.project.LilyPondNature;

public class LilyPondProjectViewerFilter extends ViewerFilter {

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (element instanceof IProject) {
			IProject project = (IProject)element;
			try {
				return (project.getNature(LilyPondNature.ID) == null);
			} catch (CoreException e) {
				Activator.logError("Can't get project nature", e);
			}
		}
		return true;
	}

}
