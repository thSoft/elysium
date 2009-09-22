package org.eclipse.lilypond.ide.internal;

import java.text.MessageFormat;
import javax.util.process.OutputProcessor;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.util.ConsoleUtils;

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

	public CompilerOutputProcessor(IFile file) {
		this.file = file;
		console = initConsole();
		messageStream = console.newMessageStream();
	}

	public void processOutput(String line) {
		messageStream.println(line);
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

}
