package org.eclipse.lilypond.ide.views.score;

import java.awt.image.BufferedImage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.util.ImageUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.Page;
import org.jpedal.PdfDecoder;
import org.jpedal.exception.PdfException;

/**
 * A PDF viewer with LilyPond-specific extensions.
 */
public class ScoreViewPage extends Page {

	private ScrolledComposite mainControl;

	private Label pdfDisplay;

	@Override
	public void createControl(Composite parent) {
		mainControl = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL);
		mainControl.setExpandHorizontal(true);
		mainControl.setExpandVertical(true);

		pdfDisplay = new Label(mainControl, SWT.CENTER);
		mainControl.setContent(pdfDisplay);

		reload();
	}

	@Override
	public Control getControl() {
		return mainControl;
	}

	@Override
	public void setFocus() {
		redraw();
	}

	protected void handlePdfException() {
		Rectangle clientArea = mainControl.getClientArea();
		mainControl.setMinSize(clientArea.width, clientArea.height);
		pdfDisplay.setText("No score found.\nCompile the LilyPond source to see the score.\nMake sure the \\layout block exists besides the \\midi block.");
	}

	protected final PdfDecoder pdfDecoder = new PdfDecoder();

	public void redraw() {
		if (pdfDecoder.isOpen()) {
			try {
				pdfDecoder.setPageParameters(zoom, getPage());
				BufferedImage awtImage = pdfDecoder.getPageAsImage(getPage());
				Image swtImage = new Image(Display.getDefault(), ImageUtils.convertBufferedImageToImageData(awtImage));
				pdfDisplay.setImage(swtImage);
				mainControl.setMinSize(awtImage.getWidth(), awtImage.getHeight());
			} catch (PdfException e) {
				handlePdfException();
			}
		}
	}

	private String filename;

	public ScoreViewPage(String filename) {
		this.filename = filename;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		try {
			pdfDecoder.openPdfFile(filename);
		} catch (PdfException e) {
			handlePdfException();
		}
		if (filename.equals(this.filename)) {
			setPage(getPage());
		} else {
			this.filename = filename;
			setPage(1);
		}
	}

	public void reload() {
		setFilename(getFilename());
	}

	private int page = 1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page > pdfDecoder.getPageCount()) {
			this.page = pdfDecoder.getPageCount();
		} else if (page < 1) {
			this.page = 1;
		} else {
			this.page = page;
		}
		redraw();
	}

	public int getPageCount() {
		return pdfDecoder.getPageCount();
	}

	private float zoom = 1;

}
