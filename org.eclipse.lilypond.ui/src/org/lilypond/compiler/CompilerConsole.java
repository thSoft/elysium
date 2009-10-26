package org.lilypond.compiler;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jface.text.IDocumentPartitioningListener;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.util.ConsoleFactory;

/**
 * Console for the LilyPond compiler's output.
 */
public class CompilerConsole extends MessageConsole {

	private final List<IDocumentPartitioningListener> documentPartitioningListeners = new ArrayList<IDocumentPartitioningListener>();

	public CompilerConsole(String name) {
		super(name, null);
	}

	public List<IDocumentPartitioningListener> getDocumentPartitioningListeners() {
		return documentPartitioningListeners;
	}

	public static final ConsoleFactory<CompilerConsole> FACTORY = new ConsoleFactory<CompilerConsole>() {

		public CompilerConsole create(String name) {
			return new CompilerConsole(name);
		}

	};

}
