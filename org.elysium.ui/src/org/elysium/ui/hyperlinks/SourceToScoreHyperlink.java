package org.elysium.ui.hyperlinks;

import org.eclipse.ui.views.pdf.PdfAnnotation;
import org.eclipse.ui.views.pdf.PdfViewPage;
import org.eclipse.xtext.ui.editor.hyperlinking.AbstractHyperlink;

/**
 * A hyperlink that links from a source region to a score region.
 */
public class SourceToScoreHyperlink extends AbstractHyperlink {

	private final PdfViewPage pdfViewPage;

	private final PdfAnnotation pdfAnnotation;

	public SourceToScoreHyperlink(PdfViewPage pdfViewPage, PdfAnnotation pdfAnnotation) {
		super();
		this.pdfViewPage = pdfViewPage;
		this.pdfAnnotation = pdfAnnotation;
	}

	@Override
	public void open() {
		pdfViewPage.highlightAnnotation(pdfAnnotation);
	}

}
