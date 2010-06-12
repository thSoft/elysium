package org.elysium.ui.wizard;

import java.text.MessageFormat;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.util.ProjectUtils;
import org.eclipse.util.UiUtils;
import org.eclipse.xtext.util.StringInputStream;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.LilyPondBuilder;
import org.elysium.ui.project.LilyPondNature;
import org.elysium.ui.version.LilyPondVersion;

/**
 * New project wizard for creating LilyPond projects.
 */
public class NewLilyPondProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	private WizardNewProjectCreationPage projectCreationPage;

	@Override
	public void addPages() {
		projectCreationPage = new WizardNewProjectCreationPage("project"); //$NON-NLS-1$
		projectCreationPage.setTitle("New LilyPond project");
		projectCreationPage.setMessage("Create a new LilyPond project.");
		projectCreationPage.setImageDescriptor(Activator.getImageDescriptor("icons/wizard/Header.png")); //$NON-NLS-1$
		addPage(projectCreationPage);
	}

	private static final String TEMPLATE = "\\version \"{0}\"\n\n\\relative c'' '{\n\tc\n}'"; // XXX avoid MessageFormat-escaping

	private static String getTemplate() {
		return MessageFormat.format(TEMPLATE, LilyPondVersion.get());
	}

	@Override
	public boolean performFinish() {
		IProject project = projectCreationPage.getProjectHandle();
		try {
			if (projectCreationPage.useDefaults()) {
				project.create(new NullProgressMonitor());
			} else {
				IProjectDescription description = ResourcesPlugin.getWorkspace().newProjectDescription(project.getName());
				description.setLocation(projectCreationPage.getLocationPath());
				project.create(description, new NullProgressMonitor());
			}
			project.open(new NullProgressMonitor());
			ProjectUtils.addNatures(project, LilyPondNature.ID);
			if (project.members().length == 1) { // XXX how to exclude .project from members?
				IFile file = project.getFile("score.ly");
				file.create(new StringInputStream(getTemplate()), false, new NullProgressMonitor());
				IDE.openEditor(UiUtils.getWorkbenchPage(), file);
			} else {
				// If project was imported, just parse
				project.setPersistentProperty(LilyPondBuilder.DO_NOT_PRINT_PAGES, ""); //$NON-NLS-1$
			}
			BasicNewProjectResourceWizard.updatePerspective(configurationElement);
		} catch (CoreException e) {
			Activator.logError("Couldn't create LilyPond project", e);
		}
		return true;
	}

	private IConfigurationElement configurationElement;

	@Override
	public void setInitializationData(IConfigurationElement configurationElement, String propertyName, Object data) throws CoreException {
		this.configurationElement = configurationElement;
	}

}
