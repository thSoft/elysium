package org.elysium.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.util.ProjectUtils;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * Contains LilyPond-specific Xtext editor customizations.
 */
public class LilyPondEditorCallback extends AbstractDirtyStateAwareEditorCallback {

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		// Add the Xtext nature to a project when editing a contained Xtext resource without asking
		IResource resource = editor.getResource();
		if ((resource != null) && resource.getProject().isAccessible()) {
			try {
				ProjectUtils.addBuilder(resource.getProject(), XtextProjectHelper.NATURE_ID);
			} catch (CoreException e) {
				Activator.logError("Error while adding Xtext nature", e);
			}
		}
	}

}
