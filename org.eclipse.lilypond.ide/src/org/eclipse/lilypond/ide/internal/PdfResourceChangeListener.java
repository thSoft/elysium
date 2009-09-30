package org.eclipse.lilypond.ide.internal;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.lilypond.ide.Activator;
import org.eclipse.lilypond.ide.views.score.ScoreView;
import org.eclipse.lilypond.ide.views.score.ScoreViewPage;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPage;

/**
 * Refreshes the pages of the Score view which display a PDF file that was
 * changed in the workspace.
 */
public class PdfResourceChangeListener implements IResourceChangeListener {

	private static class PdfUpdater implements IResourceDeltaVisitor {

		public final static IResourceDeltaVisitor INSTANCE = new PdfUpdater();

		public boolean visit(IResourceDelta delta) throws CoreException {
			final IResource resource = delta.getResource();
			if (resource.getName().endsWith(".pdf")) { //$NON-NLS-1$
				Display.getDefault().asyncExec(new Runnable() { // The Score view can be accessed only in UI thread

					public void run() {
						ScoreView scoreView = (ScoreView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ScoreView.ID);
						for (IPage page : scoreView.getPages()) {
							ScoreViewPage scoreViewPage = (ScoreViewPage)page;
							if (scoreViewPage.getFilename().equals(resource.getLocation().toOSString())) {
								scoreViewPage.reload();
							}
						}
					}

				});
			}
			return true;
		}
	}

	public void resourceChanged(IResourceChangeEvent event) {
		try {
			event.getDelta().accept(PdfUpdater.INSTANCE);
		} catch (CoreException e) {
			Activator.logError("Couldn't refresh the Score view, reopen the corresponding LilyPond source file", e);
		}
	}

}
