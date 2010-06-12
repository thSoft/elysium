package org.elysium.ui.mainfile.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.elysium.ui.mainfile.MainFile;

/**
 * Sets the selected file as the main file.
 */
public class SetAsMainFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if ((selection != null) && (selection instanceof IStructuredSelection)) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object element = structuredSelection.getFirstElement();
			if (element instanceof IFile) {
				IFile file = (IFile)element;
				MainFile.set(file);
			}
		}
		return null;
	}

}
