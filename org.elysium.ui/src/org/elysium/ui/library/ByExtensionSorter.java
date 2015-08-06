package org.elysium.ui.library;

import java.text.Collator;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

import com.google.common.base.Strings;

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
		if ((e1 instanceof IResource) && (e2 instanceof IResource)) {
			IResource resource1 = (IResource)e1;
			IResource resource2 = (IResource)e2;
			String extension1 = Strings.nullToEmpty(resource1.getFileExtension());
			String extension2 = Strings.nullToEmpty(resource2.getFileExtension());
			int result = extension1.compareToIgnoreCase(extension2);
			if (result == 0) {
				String name1 = Strings.nullToEmpty(resource1.getName());
				String name2 = Strings.nullToEmpty(resource2.getName());
				return name1.compareToIgnoreCase(name2);
			} else {
				return result;
			}
		} else {
			return 0;
		}
	}

}
