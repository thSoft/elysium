package org.lilypond.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.xtext.concurrent.IStateAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.core.editor.IXtextResourceChecker;
import org.eclipse.xtext.ui.core.editor.utils.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;

/**
 * Customized validation job for the LilyPond language.
 */
public class LilyPondValidationJob extends ValidationJob {

	public LilyPondValidationJob(IXtextResourceChecker xtextResourceChecker, IStateAccess<XtextResource> xtextDocument, IFile iFile, CheckMode checkMode, boolean deleteOldMarkers) {
		super(xtextResourceChecker, xtextDocument, iFile, checkMode, deleteOldMarkers);
	}

	@Override
	public boolean belongsTo(Object family) {
		// A LilyPond validation job needs to be identifiable by its family
		return LilyPondValidationJob.class.getName().equals(family);
	}

}
