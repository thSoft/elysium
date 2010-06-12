package org.elysium.ui.score;

import java.util.Collections;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.views.file.FileViewSource;
import org.eclipse.ui.views.pdf.PdfView;
import org.eclipse.util.ResourceUtils;
import org.elysium.ui.Activator;
import org.elysium.ui.markers.MarkerTypes;
import org.elysium.ui.score.hyperlinks.ScoreToSourceHyperlink;

/**
 * A view showing the PDF file compiled from a LilyPond source file.
 */
public class ScoreView extends PdfView {

	private static final String ID_SUFFIX = ".views.Score"; //$NON-NLS-1$

	/**
	 * Returns the score file compiled from the given source file.
	 */
	public static IFile getScoreFile(IFile sourceFile) {
		return ResourceUtils.replaceExtension(sourceFile, EXTENSIONS);
	}

	@Override
	protected String getErrorMessage() {
		return "No score found.\nCompile the LilyPond source to see the score.\nMake sure the \\layout block exists besides the \\midi block.";
	}

	@Override
	public String getId() {
		return Activator.getId() + ID_SUFFIX;
	}

	@Override
	public List<FileViewSource> getSources() {
		List<FileViewSource> sources = super.getSources();
		Collections.addAll(sources, new CurrentScoreViewSource(), new MainFileScoreViewSource());
		return sources;
	}

	public void refreshHyperlinks() {
		IFile file = getFile();
		if (file != null) {
			try {
				IMarker[] scoreToSourceMarkers = file.findMarkers(MarkerTypes.SCORE_TO_SOURCE, false, IResource.DEPTH_ZERO);
				for (IMarker marker : scoreToSourceMarkers) {
					new ScoreToSourceHyperlink(getPage(), marker);
				}
			} catch (CoreException e) {
				Activator.logError("Couldn't query score-to-source markers", e);
			}
		}
	}

}
