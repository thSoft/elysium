package org.elysium.ui.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.elysium.ui.Activator;

/**
 * LilyPond project nature.
 */
public class LilyPondNature implements IProjectNature {

	public static final String ID = Activator.getId() + ".natures.LilyPond"; //$NON-NLS-1$

	@Override
	public void configure() throws CoreException {
	}

	@Override
	public void deconfigure() throws CoreException {
	}

	private IProject project;

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

}
