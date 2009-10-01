package org.eclipse.lilypond.ide.views.score;

import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import org.eclipse.lilypond.ide.Activator;
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

	/**
	 * The root composite which provides scrolling.
	 */
	private ScrolledComposite mainControl;

	/**
	 * The composite which is responsible for the center alignment.
	 */
	private Composite outerContainer;

	/**
	 * The composite which contains the PDF and the hyperlink layer.
	 */
	private Composite innerContainer;

	/**
	 * The label displaying the current page of the PDF file or an error message
	 * if the PDF is missing.
	 */
	private Label pdfDisplay;

	/**
	 * The composite containing the point-and-click hyperlinks.
	 */
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

		pdfDisplay = new Label(innerContainer, SWT.CENTER);

		hyperlinks = new Composite(innerContainer, SWT.TRANSPARENT | SWT.NO_BACKGROUND); // Both styles are required for correct transparency
		hyperlinks.moveAbove(pdfDisplay);

		reload();
	}

	@Override
	public Control getControl() {
		return mainControl;
	}

	@Override
	public void setFocus() {
	}

	/**
	 * Handles the case of missing or unreadable PDF.
	 */
	protected void handlePdfException() {
		clearHyperlinks();
		pdfDisplay.setText("No score found.\nCompile the LilyPond source to see the score.\nMake sure the \\layout block exists besides the \\midi block.");
		refreshLayout();
	}

	/**
	 * The PDF engine which renders the pages.
	 */
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

	/**
	 * Whenever the page size changes, this method has to be called to achieve the
	 * correct layout.
	 */
	protected void refreshLayout() {
		Point size = pdfDisplay.computeSize(SWT.DEFAULT, SWT.DEFAULT);
		pdfDisplay.setBounds(0, 0, size.x, size.y);
		hyperlinks.setBounds(0, 0, size.x, size.y);
		outerContainer.layout();
		mainControl.setMinSize(size);
	}

	/**
	 * Creates point-and-click hyperlinks from the form annotations on the current
	 * page.
	 */
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
						byte[] uriDecodedBytes = anchor.getTextStreamValue(PdfDictionary.URI).getBytes("ISO-8859-1");
						URI uri = new URI(new String(uriDecodedBytes));
						if (uri.getScheme().equals("textedit")) { //$NON-NLS-1$
							String[] sections = uri.getPath().split(":"); //$NON-NLS-1$
							String targetFilename = (uri.getAuthority() == null ? "" : uri.getAuthority()) + sections[0]; //$NON-NLS-1$
							int lineNumber = Integer.parseInt(sections[1]) - 1;
							int columnNumber = Integer.parseInt(sections[2]); // This value is independent of tab width

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

							Control scoreHyperlink = new ScoreHyperlink(hyperlinks, targetFilename, lineNumber, columnNumber);
							scoreHyperlink.setBounds(new Rectangle((int)left, (int)top, (int)width, (int)height));
						}
					} catch (URISyntaxException e) {
						Activator.logError("Invalid hyperlink URI", e);
					} catch (UnsupportedEncodingException e) {
						Activator.logError("Programming error", e);
					} catch (ArrayIndexOutOfBoundsException e) {
						Activator.logError("Error while parsing hyperlink URI", e);
					}
				}
			}
		}
	}

	/**
	 * Removes all hyperlinks from the hyperlink layer.
	 */
	protected void clearHyperlinks() {
		for (Control oldHyperlink : hyperlinks.getChildren()) {
			oldHyperlink.dispose();
		}
	}

	/**
	 * The full path of the open PDF file in the local file system.
	 */
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

	/**
	 * The number of the currently viewed page, 1-based.
	 */
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

	/**
	 * Returns the number of pages in the PDF file.
	 */
	public int getPageCount() {
		return pdfDecoder.getPageCount();
	}

	/**
	 * The current zoom factor.
	 */
	private float zoom = 1;

	/**
	 * Returns the real, zoom-independent height of the current page in PostScript
	 * points.
	 */
	public int getPageHeight() {
		return pdfDecoder.getPdfPageData().getMediaBoxHeight(getPage());
	}

	/**
	 * Returns the real, zoom-independent width of the current page in PostScript
	 * points.
	 */
	public int getPageWidth() {
		return pdfDecoder.getPdfPageData().getMediaBoxWidth(getPage());
	}

}
