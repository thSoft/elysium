package org.elysium.ui.mainfile.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.util.FileSelectionDialog;
import org.elysium.LilyPondConstants;
import org.elysium.ui.mainfile.MainFile;

/**
 * Lets the user choose the main file by browsing the workspace.
 */
public class SelectMainFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		FileSelectionDialog dialog = new FileSelectionDialog(HandlerUtil.getActiveShell(event), new String[] { LilyPondConstants.EXTENSION });
		dialog.setTitle("Main File");
		dialog.setMessage("Select the main file:");
		IFile file = dialog.selectFile();
		if (file != null) {
			MainFile.set(file);
		}
		return null;
	}

}
