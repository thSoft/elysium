package org.elysium.ui.mainfile;

import org.eclipse.core.resources.IFile;

/**
 * A listener which is notified when the main file is changed.
 */
public interface MainFileListener {

	void handleMainFileChanged(IFile oldMainFile);

}
