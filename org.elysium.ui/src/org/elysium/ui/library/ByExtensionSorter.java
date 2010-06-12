package org.elysium.ui.library;

import java.text.Collator;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

/**
 * Sorts resources by extension first, then by name, ignoring case.
 */
public class ByExtensionSorter extends ViewerSorter {

	public ByExtensionSorter() {
	}

	public ByExtensionSorter(Collator collator) {
		super(collator);
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		IResource resource1 = (IResource)e1;
		IResource resource2 = (IResource)e2;
		String extension1 = resource1.getFileExtension();
		if (extension1 == null) {
			extension1 = ""; //$NON-NLS-1$
		}
		String extension2 = resource2.getFileExtension();
		if (extension2 == null) {
			extension2 = ""; //$NON-NLS-1$
		}
		int result = extension1.compareToIgnoreCase(extension2);
		if (result == 0) {
			return resource1.getName().compareToIgnoreCase(resource2.getName());
		} else {
			return result;
		}
	}

}
