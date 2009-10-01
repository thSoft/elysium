package org.eclipse.lilypond.ide.views.score;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.util.PageBookViewBase;

/**
 * A view showing the PDF file compiled from the currently edited LilyPond
 * source file.
 */
public class ScoreView extends PageBookViewBase {

	public static final String ID = "org.eclipse.lilypond.ide.views.Score"; //$NON-NLS-1$

	private static IPathEditorInput getPathEditorInput(IWorkbenchPart part) {
		if (part instanceof IEditorPart) {
			IEditorPart editor = (IEditorPart)part;
			IEditorInput editorInput = editor.getEditorInput();
			if (editorInput instanceof IPathEditorInput) {
				return (IPathEditorInput)editorInput;
			}
		}
		return null;
	}

	@Override
	protected boolean isImportant(IWorkbenchPart part) {
		IPathEditorInput pathEditorInput = getPathEditorInput(part);
		return (pathEditorInput != null) && (pathEditorInput.getPath().getFileExtension().equals("ly")); //$NON-NLS-1$
	}

	@Override
	protected PageRec doCreatePage(IWorkbenchPart part) {
		if (isImportant(part)) {
			String filename = getPathEditorInput(part).getPath().removeFileExtension().addFileExtension("pdf").toOSString(); //$NON-NLS-1$
			ScoreViewPage page = new ScoreViewPage(filename);
			return createPage(part, page);
		} else {
			return null;
		}
	}

	@Override
	protected void doDestroyPage(IWorkbenchPart part, PageRec pageRecord) {
		((ScoreViewPage)pageRecord.page).closeFile();
		super.doDestroyPage(part, pageRecord);
	}

}
