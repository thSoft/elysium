package org.elysium.ui.compiler.handlers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
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
import org.elysium.ui.compiler.LilyPondBuilder;

public class RecompileSelectedHandler extends AbstractHandler {

	@Inject
	private Provider<LilyPondBuilder> builder;

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
					if (isLilyPondFile(file)) {
						files.add(file);
					}
				}
			}
		} else {
			IFile file=EditorUtils.getCurrentlyOpenFile();
			if(isLilyPondFile(file)){
				files.add(file);	
			}
		}
		builder.get().compile(files);
		return null;
	}

	private boolean isLilyPondFile(IFile file){
		return file!=null && LilyPondConstants.EXTENSIONS.contains(file.getFileExtension());
	}

	@Override
	public boolean isEnabled() {
		ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().getSelection();
		if(selection instanceof TextSelection) {
			IFile file=EditorUtils.getCurrentlyOpenFile();
			return file!=null && isLilyPondFile(file);
		}else if(selection instanceof StructuredSelection) {
			Iterator<?> iterator = ((StructuredSelection) selection).iterator();
			while(iterator.hasNext()) {
				if(isRecompilable(iterator.next())) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isRecompilable(Object object) {
		if(object instanceof IContainer) {
			return true;
		} else if(object instanceof IFile) {
			if(isLilyPondFile((IFile)object)){
				return true;
			}
		}
		return false;
	}
}
