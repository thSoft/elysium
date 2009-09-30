package org.eclipse.lilypond.ide.views.score;

import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URISyntaxException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.util.ImageUtils;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.Page;
import org.jpedal.PdfDecoder;
import org.jpedal.exception.PdfException;
import org.jpedal.objects.acroforms.rendering.AcroRenderer;
import org.jpedal.objects.raw.FormObject;
import org.jpedal.objects.raw.PdfArrayIterator;
import org.jpedal.objects.raw.PdfDictionary;
import org.jpedal.objects.raw.PdfObject;

/**
 * A PDF viewer with LilyPond-specific extensions.
 */
public class ScoreViewPage extends Page {

	private ScrolledComposite mainControl;

	private Composite outerContainer;

	private Composite innerContainer;

	private Label pdfDisplay;

	private Composite hyperlinks;

	@Override
	public void createControl(Composite parent) {
		mainControl = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL);
		mainControl.setExpandHorizontal(true);
		mainControl.setExpandVertical(true);
		mainControl.getVerticalBar().setIncrement(mainControl.getVerticalBar().getIncrement() * 4);
		mainControl.getHorizontalBar().setIncrement(mainControl.getHorizontalBar().getIncrement() * 4);

		outerContainer = new Composite(mainControl, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		outerContainer.setLayout(layout);
		mainControl.setContent(outerContainer);

		innerContainer = new Composite(outerContainer, SWT.NONE);
		innerContainer.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));

		hyperlinks = new Composite(innerContainer, SWT.NO_BACKGROUND);

		pdfDisplay = new Label(innerContainer, SWT.CENTER);

		reload();
	}

	@Override
	public Control getControl() {
		return mainControl;
	}

	@Override
	public void setFocus() {
	}

	protected void handlePdfException() {
		clearHyperlinks();
		pdfDisplay.setText("No score found.\nCompile the LilyPond source to see the score.\nMake sure the \\layout block exists besides the \\midi block.");
		refreshLayout();
	}

	protected final PdfDecoder pdfDecoder = new PdfDecoder();

	public void redraw() {
		if (pdfDecoder.isOpen()) {
			try {
				pdfDecoder.setPageParameters(zoom, getPage());
				BufferedImage awtImage = pdfDecoder.getPageAsImage(getPage());
				Image swtImage = new Image(Display.getDefault(), ImageUtils.convertBufferedImageToImageData(awtImage));
				pdfDisplay.setImage(swtImage);
				refreshLayout();

				clearHyperlinks();
				createHyperlinks();
			} catch (PdfException e) {
				handlePdfException();
			}
		}
	}

	protected void refreshLayout() {
		Point size = pdfDisplay.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		pdfDisplay.setBounds(0, 0, size.x, size.y);
		hyperlinks.setBounds(0, 0, size.x, size.y);
		outerContainer.layout();
		mainControl.setMinSize(size);
	}

	protected void createHyperlinks() {
		float widthRatio = (float)pdfDisplay.getImage().getBounds().width / getPageWidth();
		float heightRatio = (float)pdfDisplay.getImage().getBounds().height / getPageHeight();

		AcroRenderer formRenderer = pdfDecoder.getFormRenderer();
		PdfArrayIterator annotations = formRenderer.getAnnotsOnPage(getPage());
		while (annotations.hasMoreTokens()) {
			String key = annotations.getNextValueAsString(true);
			Object rawObject = formRenderer.getFormDataAsObject(key);
			if ((rawObject != null) && (rawObject instanceof FormObject)) {
				FormObject formObject = (FormObject)rawObject;
				int subtype = formObject.getParameterConstant(PdfDictionary.Subtype);
				if (subtype == PdfDictionary.Link) {
					PdfObject anchor = formObject.getDictionary(PdfDictionary.A);
					try {
						URI uri = new URI(anchor.getTextStreamValue(PdfDictionary.URI));
						if (uri.getScheme().equals("textedit")) { //$NON-NLS-1$
							String[] sections = uri.getPath().split(":");
							String targetFilename = sections[0];
							int lineNumber = Integer.parseInt(sections[1]) - 1;
							int columnNumber = Integer.parseInt(sections[2]); // This column number is computed with 1 as tab width

							float[] rectangle = formObject.getFloatArray(PdfDictionary.Rect);
							float left = rectangle[0];
							float bottom = rectangle[1];
							float right = rectangle[2];
							float top = rectangle[3];
							left *= widthRatio;
							bottom = (getPageHeight() - bottom + 1) * heightRatio;
							right *= widthRatio;
							top = (getPageHeight() - top + 1) * heightRatio;
							float width = right - left;
							float height = bottom - top;

							Control scoreHyperlink = ScoreHyperlinkFactory.create(hyperlinks, targetFilename, lineNumber, columnNumber);
							scoreHyperlink.setBounds(new Rectangle((int)left, (int)top, (int)width, (int)height));
						}
					} catch (URISyntaxException e) {
						// Not valid URI
					}
				}
			}
		}
	}

	protected void clearHyperlinks() {
		for (Control oldHyperlink : hyperlinks.getChildren()) {
			oldHyperlink.dispose();
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

	public void closeFile() {
		pdfDecoder.closePdfFile();
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

	public int getPageHeight() {
		return pdfDecoder.getPdfPageData().getMediaBoxHeight(getPage());
	}

	public int getPageWidth() {
		return pdfDecoder.getPdfPageData().getMediaBoxWidth(getPage());
	}

}
