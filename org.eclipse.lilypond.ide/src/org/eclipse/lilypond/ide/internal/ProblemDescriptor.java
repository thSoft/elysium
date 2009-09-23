package org.eclipse.lilypond.ide.internal;

import org.eclipse.core.resources.IFile;

/**
 * A simple data structure describing a LilyPond problem.
 */
public class ProblemDescriptor {

	public IFile file;

	public int severity;

	public String message;

	public int lineNumber;

	public int columnNumber;

}
