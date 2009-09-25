package org.lilypond.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.util.EditorUtils;
import org.eclipse.xtext.concurrent.IStateAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.core.editor.IXtextResourceChecker;
import org.eclipse.xtext.ui.core.editor.utils.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;
import org.lilypond.markers.LilyPondProblemMarker;

/**
 * Customized validation job for the LilyPond language.
 */
public class LilyPondValidationJob extends ValidationJob {

	/**
	 * Indicates that the validation job must not run.
	 */
	private boolean forbiddenToRun;

	public LilyPondValidationJob(IXtextResourceChecker xtextResourceChecker, IStateAccess<XtextResource> xtextDocument, IFile iFile, CheckMode checkMode, boolean deleteOldMarkers) {
		super(xtextResourceChecker, xtextDocument, iFile, checkMode, deleteOldMarkers);
		Display.getDefault().asyncExec(new Runnable() { // The active editor can be queried only in UI thread

			public void run() {
				// Don't validate if the Xtext editor was just opened
				forbiddenToRun = !EditorUtils.getActiveEditor().isDirty() && (getCheckMode() == CheckMode.FAST_ONLY);
			}

		});
	}

	@Override
	public boolean belongsTo(Object family) {
		// A LilyPond validation job needs to be identifiable by its family
		return LilyPondValidationJob.class.getName().equals(family);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if (forbiddenToRun) {
			return Status.OK_STATUS;
		} else {
			try {
				// Validation problems overwrite compilation problems
				getFile().deleteMarkers(LilyPondProblemMarker.TYPE, true, IResource.DEPTH_INFINITE);
			} catch (CoreException e) {
				e.printStackTrace();
			}
			return super.run(monitor);
		}
	}

}
