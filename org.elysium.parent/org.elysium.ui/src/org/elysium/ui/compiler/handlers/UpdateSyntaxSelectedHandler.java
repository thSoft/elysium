package org.elysium.ui.compiler.handlers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.util.EditorUtils;
import org.eclipse.util.ResourceUtils;
import org.elysium.LilyPondConstants;
import org.elysium.ui.compiler.SyntaxUpdaterJob;

public class UpdateSyntaxSelectedHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Set<IFile> files = new HashSet<IFile>();
		IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		ISelection selection = activePage.getSelection();
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
					if(isSyntaxUpdateSupported(file)){
						files.add(file);	
					}
				}
			}
		} else {
			IFile file=EditorUtils.getCurrentlyOpenFile();
			if(isSyntaxUpdateSupported(file)){
				files.add(file);	
			}
		}
		if(!files.isEmpty()) {
			new SyntaxUpdaterJob(files).schedule();
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if(selection instanceof TextSelection) {
			IFile file=EditorUtils.getCurrentlyOpenFile();
			return isSyntaxUpdateSupported(file);
		}else if(selection instanceof StructuredSelection) {
			Iterator<?> iterator = ((StructuredSelection) selection).iterator();
			while(iterator.hasNext()) {
				if(isSyntaxUpdateSupported(iterator.next())) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isSyntaxUpdateSupported(Object object) {
		if(object instanceof IContainer) {
			IContainer container = (IContainer)object;
			try {
				for (IResource member : container.members()) {
					if(isSyntaxUpdateSupported(member)) {
						return true;
					}
				}
			} catch (CoreException e) {
				//ignore
			}
		} else if(object instanceof IFile) {
			if(LilyPondConstants.EXTENSIONS.contains(((IFile)object).getFileExtension())){
				return true;
			}
		}
		return false;
	}
}
