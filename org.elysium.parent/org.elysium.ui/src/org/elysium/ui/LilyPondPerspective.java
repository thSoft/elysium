package org.elysium.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.util.EditorUtils;

/**
 * Perspective for LilyPond-oriented workflows.
 */
public class LilyPondPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// See plugin.xml
	}

	public static List<IFile> getAllOpenDirtyFiles(){
		List<IFile> result=new ArrayList<>();
		IEditorReference[] editors = EditorUtils.getOpenEditors();
		for (IEditorReference ref : editors) {
			if(ref.isDirty()) {
				try {
					IFile file = ResourceUtil.getFile(ref.getEditorInput());
					result.add(file);
				} catch (PartInitException e) {
					//ignore
				}
			}
		}
		return result;
	}

}
