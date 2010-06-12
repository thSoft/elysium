package org.elysium.test;

import static org.eclipse.xtext.junit.util.IResourcesSetupUtil.addNature;
import static org.eclipse.xtext.junit.util.IResourcesSetupUtil.cleanWorkspace;
import static org.eclipse.xtext.junit.util.IResourcesSetupUtil.createFile;
import static org.eclipse.xtext.junit.util.IResourcesSetupUtil.waitForAutoBuild;
import static org.junit.Assert.assertEquals;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.xtext.junit.util.IResourcesSetupUtil;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.elysium.LilyPondConstants;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Parser {

	private static final String PROJECT_NAME = "test";

	private static final String FOLDER_NAME = "test";

	private static final String FOLDER_PATH = PROJECT_NAME + "/" + FOLDER_NAME;

	private static final String FILE_NAME = "test";

	private static final String FILE_PATH = FOLDER_PATH + "/" + FILE_NAME + "." + LilyPondConstants.EXTENSION;

	private static IProject createXtextProject(String name) throws Exception {
		IProject project = IResourcesSetupUtil.createProject(name);
		addNature(project.getProject(), XtextProjectHelper.NATURE_ID);
		return project;
	}

	@BeforeClass
	public static void init() throws Exception {
		createXtextProject(PROJECT_NAME);
	}

	@After
	public void delete() throws Exception {
		ResourcesPlugin.getWorkspace().getRoot().findMember(FOLDER_PATH).delete(true, new NullProgressMonitor());
	}

	@AfterClass
	public static void done() throws Exception {
		cleanWorkspace();
	}

	private void isValid(String contents) throws Exception {
		IFile file = createFile(FILE_PATH, contents);
		waitForAutoBuild();
		assertEquals(0, file.findMarkers(EValidator.MARKER, true, IResource.DEPTH_INFINITE).length);
	}

	@Test
	public void simple() throws Exception {
		isValid("{ c' }");
	}

}
