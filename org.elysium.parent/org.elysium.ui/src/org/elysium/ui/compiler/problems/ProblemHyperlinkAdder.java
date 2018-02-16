package org.elysium.ui.compiler.problems;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.FindReplaceDocumentAdapter;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioningListener;
import org.eclipse.jface.text.IRegion;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.util.MarkerHyperlink;
import org.elysium.ui.Activator;

/**
 * Adds a line of hyperlink to a text console when its document is partitioned
 * for the first time.
 */
public class ProblemHyperlinkAdder implements IDocumentPartitioningListener {

	private final TextConsole console;

	private final IHyperlink hyperlink;

	private final String line;

	private ProblemHyperlinkAdder(TextConsole console, IHyperlink hyperlink, String line) {
		this.console = console;
		this.hyperlink = hyperlink;
		this.line = line;
	}

	@Override
	public void documentPartitioningChanged(IDocument document) {
		try {
			// Search for first occurence of line where there's no hyperlink yet
			FindReplaceDocumentAdapter finder = new FindReplaceDocumentAdapter(console.getDocument());
			int searchOffset = 0;
			boolean searchComplete = false;
			IRegion region = null;
			do {
				region = finder.find(searchOffset, line, true, true, false, false);
				if ((region != null) && (console.getHyperlink(region.getOffset()) != null)) {
					searchOffset = region.getOffset() + 1;
				} else {
					searchComplete = true;
				}
			} while (!searchComplete);
			if (region != null) {
				// Add hyperlink
				console.addHyperlink(hyperlink, region.getOffset(), region.getLength());
			}
			// Ensure the hyperlink is added exactly once
			document.removeDocumentPartitioningListener(this);
		} catch (BadLocationException e) {
			Activator.logError("Console was empty, trying to add problem hyperlink again", e);
		}
	}

	/**
	 * Creates a hyperlink pointing to the location of the given problem and adds
	 * it to the problem message in the compiler console of the problematic file.
	 */
	public static void add(TextConsole console, IMarker problemMarker, String line) {
		MarkerHyperlink hyperlink = new MarkerHyperlink(problemMarker);
		// Add hyperlink when its text is already processed in a job by the console's document partitioner
		ProblemHyperlinkAdder hyperlinkAdder = new ProblemHyperlinkAdder(console, hyperlink, line);
		console.getDocument().addDocumentPartitioningListener(hyperlinkAdder);
	}

}
