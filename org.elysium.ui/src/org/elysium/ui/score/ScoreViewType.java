package org.elysium.ui.score;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.views.file.FileView;
import org.eclipse.ui.views.file.IFileViewType;
import org.eclipse.ui.views.pdf.PdfViewPage;
import org.eclipse.ui.views.pdf.PdfViewType;
import org.eclipse.util.ResourceUtils;
import org.eclipse.util.UiUtils;
import org.elysium.ui.Activator;

/**
 * Shows the PDF file compiled from a LilyPond source file.
 */
public class ScoreViewType extends PdfViewType {

	public static final String ID = Activator.getId() + ".views.Score"; //$NON-NLS-1$

	/**
	 * Returns the score file compiled from the given source file.
	 */
	@Override
	public IFile getFile(IFile sourceFile) {
		return ResourceUtils.replaceExtension(sourceFile, EXTENSION);
	}

	public static IFile getScoreFile() {
		IWorkbenchPage workbenchPage = UiUtils.getWorkbenchPage();
		if (workbenchPage != null) {
			for (IViewReference viewReference : workbenchPage.getViewReferences()) {
				IViewPart view = viewReference.getView(false);
				if (view instanceof FileView) {
					FileView fileView = (FileView)view;
					IFileViewType<?> type = fileView.getType();
					if (type instanceof ScoreViewType) {
						ScoreViewType scoreViewType = (ScoreViewType) type;
						PdfViewPage page = scoreViewType.getPage();
						if (page != null) {
							return page.getFile();
						}
					}
				}
			}
		}
		return null;
	}

}
