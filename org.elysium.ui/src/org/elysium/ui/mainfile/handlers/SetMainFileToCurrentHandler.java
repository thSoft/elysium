package org.elysium.ui.mainfile.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.util.EditorUtils;
import org.elysium.ui.mainfile.MainFile;

/**
 * Sets the main file to the currently open file.
 */
public class SetMainFileToCurrentHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile currentlyOpenFile = EditorUtils.getCurrentlyOpenFile();
		if (currentlyOpenFile != null) {
			MainFile.set(currentlyOpenFile);
		}
		return null;
	}

}
