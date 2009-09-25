package org.eclipse.lilypond.ide.internal;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;
import javax.util.process.OutputProcessor;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioningListener;
import org.eclipse.lilypond.ide.Activator;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.util.ConsoleUtils;
import org.eclipse.util.DocumentUtils;
import org.eclipse.util.TextEditorHyperlink;
import org.lilypond.markers.LilyPondProblemMarker;

/**
 * Processes the output of <code>lilypond</code>.
 */
public class CompilerOutputProcessor implements OutputProcessor {

	/**
	 * The file being compiled.
	 */
	private final IFile file;

	/**
	 * The console corresponding to the file's compilation process.
	 */
	private final MessageConsole console;

	/**
	 * The stream where the compiler's output is written.
	 */
	private final MessageConsoleStream messageStream;

	/**
	 * The character offset of the current line in the console.
	 */
	private int offset = 0;

	/**
	 * LilyPond counts column numbers based on this tab width value.
	 */
	public static final int LILYPOND_TAB_WIDTH = 8;

	/**
	 * The files which contain problems.
	 */
	private final Set<IFile> filesWithProblem = new HashSet<IFile>();

	public CompilerOutputProcessor(IFile file) {
		this.file = file;
		console = initConsole();
		messageStream = console.newMessageStream();
	}

	public void processOutput(String line) {
		messageStream.println(line);

		ProblemDescriptor problem = ProblemParser.parse(file, line);
		if (problem != null) {
			IHyperlink hyperlink = createHyperlinkFromProblem(problem);
			// The hyperlink must be added only when its text is already processed in a job by the console's document partitioner
			HyperlinkAdder hyperlinkAdder = new HyperlinkAdder(console, hyperlink, offset, line.length());
			console.getDocument().addDocumentPartitioningListener(hyperlinkAdder);

			createMarkerFromProblem(problem);

			// If a new file with a problem is detected, ensure that its markers will be removed
			IFile fileWithProblem = problem.file;
			if (!filesWithProblem.contains(fileWithProblem)) {
				filesWithProblem.add(fileWithProblem);
				try {
					IDocument document = DocumentUtils.getDocumentFromFile(fileWithProblem);
					document.addDocumentListener(new MarkerRemover(fileWithProblem));
				} catch (CoreException e) {
					Activator.logError("Can't access file", e);
				}
			}
		}

		offset += line.length() + 1;
	}

	// Console handling

	/**
	 * Obtains and initializes the appropriate console.
	 */
	private MessageConsole initConsole() {
		String consoleName = MessageFormat.format("LilyPond Compiler Output [{0}]", file.getFullPath().toString());
		MessageConsole console = ConsoleUtils.getConsole(consoleName);
		console.clearConsole();

		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IConsoleView consoleView = (IConsoleView)page.findView(IConsoleConstants.ID_CONSOLE_VIEW);
		consoleView.display(console);

		return console;
	}

	public MessageConsole getConsole() {
		return console;
	}

	// Hyperlink creation

	/**
	 * Creates a console hyperlink from a problem descriptor.
	 */
	private static IHyperlink createHyperlinkFromProblem(ProblemDescriptor problem) {
		IFileEditorInput editorInput = new FileEditorInput(problem.file);
		TextEditorHyperlink result = new TextEditorHyperlink(editorInput, problem.lineNumber, problem.columnNumber);
		result.setTabWidth(LILYPOND_TAB_WIDTH);
		return result;
	}

	/**
	 * Adds a hyperlink to a text console when its document is partitioned for the
	 * first time.
	 */
	private class HyperlinkAdder implements IDocumentPartitioningListener {

		private final TextConsole console;

		private final IHyperlink hyperlink;

		private final int offset;

		private final int lineLength;

		public HyperlinkAdder(TextConsole console, IHyperlink hyperlink, int offset, int lineLength) {
			this.console = console;
			this.hyperlink = hyperlink;
			this.offset = offset;
			this.lineLength = lineLength;
		}

		public void documentPartitioningChanged(IDocument document) {
			try {
				document.removeDocumentPartitioningListener(this);
				console.addHyperlink(hyperlink, offset, lineLength);
			} catch (BadLocationException e) {
				Activator.logError("Incorrect location calculation", e);
			}
		}

	}

	// Marker creation

	/**
	 * Creates a resource marker from a problem descriptor.
	 */
	private static IMarker createMarkerFromProblem(ProblemDescriptor problem) {
		IMarker result = null;
		try {
			result = problem.file.createMarker(LilyPondProblemMarker.TYPE);
			result.setAttribute(IMarker.SEVERITY, problem.severity);
			result.setAttribute(IMarker.MESSAGE, problem.message);
			result.setAttribute(IMarker.LINE_NUMBER, problem.lineNumber + 1);
			result.setAttribute(LilyPondProblemMarker.COLUMN_NUMBER, problem.columnNumber + 1);
			IDocument document = DocumentUtils.getDocumentFromFile(problem.file);
			int charOffset = DocumentUtils.getOffsetOfPosition(document, problem.lineNumber, problem.columnNumber, LILYPOND_TAB_WIDTH);
			result.setAttribute(IMarker.CHAR_START, charOffset);
			result.setAttribute(IMarker.CHAR_END, charOffset);
		} catch (CoreException e) {
			Activator.logError("Couldn't create problem marker", e);
		} catch (BadLocationException e) {
			Activator.logError("Incorrect location calculation", e);
		}
		return result;
	}

}
