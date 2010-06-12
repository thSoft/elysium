package org.elysium.ui.mainfile.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.elysium.ui.mainfile.MainFile;

/**
 * Unsets the main file.
 */
public class UnsetMainFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		MainFile.unset();
		return null;
	}

}
