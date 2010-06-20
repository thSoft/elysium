package org.elysium.ui.score;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.file.Activator;
import org.eclipse.ui.views.pdf.PdfViewType;
import org.eclipse.util.ResourceUtils;

/**
 * Shows the PDF file compiled from a LilyPond source file.
 */
public class ScoreViewType extends PdfViewType {

	public static final String ID = Activator.getId() + ".views.Score"; //$NON-NLS-1$

	/**
	 * Returns the score file compiled from the given source file.
	 */
	public static IFile getScoreFile(IFile sourceFile) {
		return ResourceUtils.replaceExtension(sourceFile, EXTENSION);
	}

}