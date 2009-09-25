package org.eclipse.lilypond.ide.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.lilypond.ide.Activator;
import org.lilypond.markers.LilyPondProblemMarker;

/**
 * Removes the problem markers created from the LilyPond output from a file when
 * it is changed for the first time.
 */
public class MarkerRemover implements IDocumentListener {

	private final IFile file;

	public MarkerRemover(IFile file) {
		this.file = file;
	}

	public void documentChanged(DocumentEvent event) {
		event.fDocument.removeDocumentListener(this);
		// Markers must be deleted in a workspace job because the workspace would be locked otherwise
		new WorkspaceJob("Removing LilyPond problems...") {

			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				deleteMarkers(file, LilyPondProblemMarker.TYPE);
				return Status.OK_STATUS;
			}

		}.schedule();
	}

	public void documentAboutToBeChanged(DocumentEvent event) {
	}

	public static void deleteMarkers(IFile file, String type) {
		try {
			file.deleteMarkers(type, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			Activator.logError("Couldn't delete markers", e);
		}
	}

}
