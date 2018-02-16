package org.elysium.ui.compiler.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.util.EditorUtils;
import org.elysium.ui.compiler.LilyPondBuilder;
import com.google.common.collect.Sets;

public class RecompileEditedHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile currentlyOpenFile = EditorUtils.getCurrentlyOpenFile();
		if (currentlyOpenFile != null) {
			LilyPondBuilder.compile(Sets.newHashSet(currentlyOpenFile));
		}
		return null;
	}

}
