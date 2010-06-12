package org.elysium.ui.mainfile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.swt.widgets.Display;
import org.elysium.ui.Activator;

/**
 * Updates the main file if it has been deleted, renamed or moved.
 */
public class MainFileUpdater implements IResourceChangeListener {

	private static final IResourceDeltaVisitor VISITOR = new IResourceDeltaVisitor() {

		@Override
		public boolean visit(final IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			if (resource instanceof IFile) {
				IFile file = (IFile)resource;
				IFile mainFile = MainFile.get();
				if ((mainFile != null) && mainFile.equals(file) && delta.getKind() == IResourceDelta.REMOVED) {
					final boolean moved = ((delta.getFlags() & IResourceDelta.MOVED_TO) != 0);
					Display.getDefault().asyncExec(new Runnable() { // The main file change will be reflected in the UI

						@Override
						public void run() {
							if (moved) {
								IPath newPath = delta.getMovedToPath();
								IFile newFile = ResourcesPlugin.getWorkspace().getRoot().getFile(newPath);
								MainFile.set(newFile);
							} else {
								MainFile.unset();
							}
						}

					});
				}
			}
			return true;
		}

	};

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		try {
			event.getDelta().accept(VISITOR);
		} catch (CoreException e) {
			Activator.logError("Couldn't update main file", e);
		}
	}

}
