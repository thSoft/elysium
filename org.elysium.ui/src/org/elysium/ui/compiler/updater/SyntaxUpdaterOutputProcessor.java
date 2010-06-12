package org.elysium.ui.compiler.updater;

import javax.util.process.OutputProcessor;
import org.elysium.ui.compiler.CompilerConsole;

/**
 * Processes the output of the LilyPond syntax updater.
 */
public class SyntaxUpdaterOutputProcessor implements OutputProcessor {

	/**
	 * The console to which the syntax updater's output is written.
	 */
	private final CompilerConsole console;

	public SyntaxUpdaterOutputProcessor(CompilerConsole console) {
		super();
		this.console = console;
	}

	@Override
	public void processOutput(String line) {
		console.print(line);
	}

}
