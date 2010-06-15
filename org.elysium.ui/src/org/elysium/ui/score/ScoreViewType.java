package org.elysium.ui.score;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.pdf.PdfViewType;
import org.eclipse.util.ResourceUtils;

/**
 * Shows the PDF file compiled from a LilyPond source file.
 */
public class ScoreViewType extends PdfViewType {

	/**
	 * Returns the score file compiled from the given source file.
	 */
	public static IFile getScoreFile(IFile sourceFile) {
		return ResourceUtils.replaceExtension(sourceFile, EXTENSION);
	}

}
