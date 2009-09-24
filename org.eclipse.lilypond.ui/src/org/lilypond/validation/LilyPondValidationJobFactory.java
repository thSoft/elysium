package org.lilypond.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.xtext.concurrent.IStateAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.core.editor.utils.DefaultValidationJobFactory;
import org.eclipse.xtext.ui.core.editor.utils.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;

/**
 * Creates LilyPond validation jobs.
 */
public class LilyPondValidationJobFactory extends DefaultValidationJobFactory {

	@Override
	public ValidationJob create(IStateAccess<XtextResource> xtextDocument, IFile iFile, CheckMode checkMode, boolean deleteOldMarkers) {
		return new LilyPondValidationJob(getXtextResourceChecker(), xtextDocument, iFile, checkMode, deleteOldMarkers);
	}

}
