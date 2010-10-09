package org.elysium.ui.compiler.handlers;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.util.ResourceUtils;
import org.elysium.LilyPondConstants;
import org.elysium.ui.compiler.LilyPondBuilder;

public class RecompileSelectedHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Set<IFile> files = new HashSet<IFile>();
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		if ((selection != null) && (selection instanceof IStructuredSelection)) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			for (Object element : structuredSelection.toArray()) {
				Set<IFile> containedFiles = new HashSet<IFile>();
				if (element instanceof IFile) {
					containedFiles.add((IFile)element);
				} else if (element instanceof IContainer) {
					IContainer container = (IContainer)element;
					containedFiles.addAll(ResourceUtils.getAllFiles(container));
				}
				for (IFile file : containedFiles) {
					if (LilyPondConstants.EXTENSIONS.contains(file.getFullPath().getFileExtension())) {
						files.add(file);
					}
				}
			}
		}
		LilyPondBuilder.compile(files);
		return null;
	}

}
