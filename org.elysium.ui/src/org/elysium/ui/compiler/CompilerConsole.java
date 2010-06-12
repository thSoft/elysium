package org.elysium.ui.compiler;

import java.text.MessageFormat;
import org.eclipse.core.resources.IFile;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.util.ConsoleFactory;
import org.eclipse.util.ConsoleUtils;

/**
 * Console for the LilyPond compiler's output.
 */
public class CompilerConsole extends MessageConsole {

	private final MessageConsoleStream defaultStream = newMessageStream();

	private final MessageConsoleStream metaStream = newMessageStream();

	/**
	 * The color of the meta messages.
	 */
	private static final Color META_COLOR = new Color(Display.getDefault(), 0, 128, 0);

	private CompilerConsole(String name) {
		super(name, null);
		metaStream.setColor(META_COLOR);
	}

	/**
	 * Prints a line of message to the console.
	 */
	public void print(String line) {
		defaultStream.println(line);
	}

	/**
	 * Prints a line of meta message to the console.
	 */
	public void printMeta(String line) {
		metaStream.println(line);
	}

	private static final ConsoleFactory<CompilerConsole> FACTORY = new ConsoleFactory<CompilerConsole>() {

		@Override
		public CompilerConsole create(String name) {
			return new CompilerConsole(name);
		}

	};

	/**
	 * Returns the console corresponding to the given file and action.
	 */
	public static CompilerConsole get(IFile file) {
		if (file == null) {
			return null;
		}
		String path = file.getFullPath().toString();
		String name = MessageFormat.format("LilyPond Compiler [{0}]", path);
		return ConsoleUtils.getConsole(name, FACTORY);
	}

	// TODO ability to cancel

}
