package org.eclipse.lilypond.ide.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.lilypond.ide.Activator;

/**
 * Removes the problem markers created from the LilyPond output from a file when
 * it is edited for the first time.
 */
public class MarkerRemover implements IDocumentListener {

	private final IFile file;

	public MarkerRemover(IFile file) {
		this.file = file;
	}

	public void documentChanged(DocumentEvent event) {
		deleteMarkers(file);
		event.fDocument.removeDocumentListener(this);
	}

	public void documentAboutToBeChanged(DocumentEvent event) {
	}

	public static void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			Activator.logError("Couldn't delete markers", e);
		}
	}

}
