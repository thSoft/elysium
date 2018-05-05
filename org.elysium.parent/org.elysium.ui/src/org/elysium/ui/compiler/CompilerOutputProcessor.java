package org.elysium.ui.compiler;

import javax.util.process.OutputProcessor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.views.pdf.PdfAnnotation;
import org.eclipse.util.TextEditorUtils;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.console.LilyPondConsole;
import org.elysium.ui.compiler.problems.ProblemHyperlinkAdder;
import org.elysium.ui.compiler.problems.ProblemParser;
import org.elysium.ui.markers.MarkerAttributes;
import org.elysium.ui.markers.MarkerTypes;

/**
 * Processes the output of the LilyPond compiler.
 */
public class CompilerOutputProcessor implements OutputProcessor {

	/**
	 * The problem parser for the file being compiled.
	 */
	private final ProblemParser problemParser;

	/**
	 * The console to which the compiler's output is written.
	 */
	private final LilyPondConsole console;

	public CompilerOutputProcessor(IFile file, LilyPondConsole console) {
		this.console = console;
		this.problemParser=new ProblemParser(file);
	}

	@Override
	public void processOutput(String line) {
		console.print(line);
		IMarker problemMarker = problemParser.parse(line);
		final PdfAnnotation wsExternalIssue =problemParser.getWorkspaceExternalIssue();
		if (problemMarker != null) {
			// If file already contains problem, delete it
			try {
				IMarker[] existingProblemMarkers = problemMarker.getResource().findMarkers(MarkerTypes.LILYPOND_PROBLEM, false, IResource.DEPTH_ZERO);
				for (IMarker existingProblemMarker : existingProblemMarkers) {
					if (!existingProblemMarker.equals(problemMarker) && line.equals(existingProblemMarker.getAttribute(MarkerAttributes.COMPILER_OUTPUT.name()))) {
						problemMarker.delete();
						problemMarker = existingProblemMarker;
						break;
					}
				}
			} catch (CoreException e) {
				Activator.logError("Couldn't query existing problem markers, there may be duplicate problem markers", e);
			}
			// Add hyperlink in any case
			ProblemHyperlinkAdder.add(console, problemMarker, line);
		} else if(wsExternalIssue != null) {
			IHyperlink hyperlink=new IHyperlink() {
				
				@Override
				public void linkExited() {}
				
				@Override
				public void linkEntered() {}
				
				@Override
				public void linkActivated() {
					//TODO if we are really good, we could add an annotation
					//corresponding to the issue to the editor just opened
					TextEditorUtils.revealPosition(wsExternalIssue.fileURI, wsExternalIssue.lineNumber, wsExternalIssue.columnNumber, 1);
				}
			};
			ProblemHyperlinkAdder.add(console, hyperlink, line);
		}
	}

}
