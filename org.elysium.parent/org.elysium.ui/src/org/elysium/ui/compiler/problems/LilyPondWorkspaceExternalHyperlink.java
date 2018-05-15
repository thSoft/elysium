package org.elysium.ui.compiler.problems;

import java.net.URI;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.IHyperlink;
import org.eclipse.util.DocumentUtils;
import org.eclipse.util.EditorUtils;
import org.eclipse.util.TextEditorUtils;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.elysium.LilyPondConstants;
import org.elysium.ui.LilyPondXtextEditor;

class LilyPondWorkspaceExternalHyperlink implements IHyperlink{

	//types from org.eclipse.ui.editors plugin.xml
	private static final String ERROR_ANNOTATION = "org.eclipse.ui.workbench.texteditor.error";
	private static final String WARNING_ANNOTATION = "org.eclipse.ui.workbench.texteditor.warning";

	private URI file;
	private int line;
	private int column;
	private String message;
	private int severity;
	private List<LilyPondWorkspaceExternalHyperlink> allFileIssues;

	public LilyPondWorkspaceExternalHyperlink(URI file, int line, int column, String message, int severity) {
		this.file = file;
		this.line = line;
		this.column = column;
		this.message = message;
		this.severity = severity;
	}

	@Override
	public void linkEntered() {}

	@Override
	public void linkExited() {}

	@Override
	public void linkActivated() {
		TextEditorUtils.revealPosition(file, line, column, 1);
		IEditorPart editor = EditorUtils.getActiveEditor();
		if(editor instanceof LilyPondXtextEditor) {
			addAnnotations((LilyPondXtextEditor)editor);
		}
	}

	private void addAnnotations(LilyPondXtextEditor editor) {
		IAnnotationModel annotationModel = ((LilyPondXtextEditor) editor).getInternalSourceViewer()
				.getAnnotationModel();
		boolean annotationsPresent = IteratorExtensions.size(annotationModel.getAnnotationIterator()) > 0;
		if (!annotationsPresent) {
			IXtextDocument document = editor.getDocument();
			for (LilyPondWorkspaceExternalHyperlink issue : allFileIssues) {
				String type = ERROR_ANNOTATION;
				if (issue.severity == IMarker.SEVERITY_WARNING) {
					type = WARNING_ANNOTATION;
				}
				int offset;
				try {
					offset = DocumentUtils.getOffsetOfPosition(document, issue.line, issue.column,
							LilyPondConstants.TAB_WIDTH);
					annotationModel.addAnnotation(new Annotation(type, false, issue.message), new Position(offset, 0));
				} catch (BadLocationException e) {
					// ignore
				}
			}
		}
	}

	public void setFileLinks(List<LilyPondWorkspaceExternalHyperlink> allFileLinkes) {
		allFileIssues=allFileLinkes;
	}
}
