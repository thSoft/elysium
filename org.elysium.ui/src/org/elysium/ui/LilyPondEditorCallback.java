package org.elysium.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;
import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import com.google.inject.Inject;

/**
 * Contains LilyPond-specific Xtext editor customizations.
 */
public class LilyPondEditorCallback extends AbstractDirtyStateAwareEditorCallback {

	@Inject
	private ToggleXtextNatureAction toggleNature;

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		// Add the Xtext nature to a project when editing a contained Xtext resource without asking
		IResource resource = editor.getResource();
		if ((resource != null) && !toggleNature.hasNature(resource.getProject()) && resource.getProject().isAccessible()) {
			toggleNature.toggleNature(resource.getProject());
		}
	}

}
