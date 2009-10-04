package org.eclipse.lilypond.ide.views.score;

import java.text.MessageFormat;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.lilypond.ide.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Scrollable;
import org.eclipse.swt.widgets.Text;

/**
 * Manages the contributions to a score view page's toolbar.
 */
public class ScoreViewPageToolbarManager {

	protected final ScoreViewPage score;

	protected static final String ICON_PATH = "icons/toolbars/Score/"; //$NON-NLS-1$

	protected static final String ID_PREFIX = ".toolbars.Score."; //$NON-NLS-1$

	protected final FitToPageAction fitToPageAction = new FitToPageAction();

	public ScoreViewPageToolbarManager(ScoreViewPage score) {
		super();
		this.score = score;
		IToolBarManager toolBarManager = getToolBarManager();
		toolBarManager.add(new FirstPageAction());
		toolBarManager.add(new PreviousPageAction());
		toolBarManager.add(new CurrentPageContribution());
		toolBarManager.add(new PageCountContribution());
		toolBarManager.add(new NextPageAction());
		toolBarManager.add(new LastPageAction());
		toolBarManager.add(new Separator());
		toolBarManager.add(new ZoomOutAction());
		toolBarManager.add(new ZoomInAction());
		toolBarManager.add(new ZoomToActualSizeAction());
		toolBarManager.add(fitToPageAction);
	}

	protected IToolBarManager getToolBarManager() {
		return score.getSite().getActionBars().getToolBarManager();
	}

	public void refresh() {
		IToolBarManager toolBarManager = getToolBarManager();
		IContributionItem[] contributionItems = toolBarManager.getItems();
		for (IContributionItem contributionItem : contributionItems) {
			contributionItem.update();
			contributionItem.setVisible(score.isFileOpen());
		}
		toolBarManager.update(true);
	}

	public class FirstPageAction extends Action {

		public FirstPageAction() {
			setToolTipText("Go To First Page");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "FirstPage.png")); //$NON-NLS-1$
		}

		@Override
		public void run() {
			score.setPage(1);
		}

	}

	public class PreviousPageAction extends Action {

		public PreviousPageAction() {
			setToolTipText("Go To Previous Page");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "PreviousPage.png")); //$NON-NLS-1$
		}

		@Override
		public void run() {
			score.setPage(score.getPage() - 1);
		}

		@Override
		public boolean isEnabled() {
			return score.getPage() > 1;
		}

	}

	public class NextPageAction extends Action {

		public NextPageAction() {
			setToolTipText("Go To Next Page");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "NextPage.png")); //$NON-NLS-1$
		}

		@Override
		public void run() {
			score.setPage(score.getPage() + 1);
		}

		@Override
		public boolean isEnabled() {
			return score.getPage() < score.getPageCount();
		}

	}

	public class LastPageAction extends Action {

		public LastPageAction() {
			setToolTipText("Go To Last Page");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "LastPage.png")); //$NON-NLS-1$
		}

		@Override
		public void run() {
			score.setPage(score.getPageCount());
		}

	}

	public class CurrentPageContribution extends ControlContribution {

		private Text text;

		public CurrentPageContribution() {
			super(Activator.PLUGIN_ID + ID_PREFIX + "currentPage"); //$NON-NLS-1$
		}

		@Override
		protected int computeWidth(Control control) {
			return control.computeSize(20, SWT.DEFAULT).x;
		}

		@Override
		protected Control createControl(Composite parent) {
			text = new Text(parent, SWT.SINGLE | SWT.BORDER);
			text.setToolTipText("Current page");
			text.addVerifyListener(new VerifyListener() {

				public void verifyText(VerifyEvent event) {
					for (int i = 0; i < event.text.length(); i++) {
						if (!Character.isDigit(event.text.charAt(i))) {
							event.doit = false;
							return;
						}
					}
				}

			});
			text.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent event) {
					if ((event.keyCode == SWT.CR) && (text.getText().length() > 0)) {
						score.setPage(Integer.parseInt(text.getText()));
					}
				}

			});
			text.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseDown(MouseEvent e) {
					text.setFocus();
				}

			});
			update();
			return text;
		}

		@Override
		public void update() {
			if ((text != null) && !text.isDisposed()) {
				text.setText(String.valueOf(score.getPage()));
			}
		}

	}

	public class PageCountContribution extends ControlContribution {

		private Label label;

		public PageCountContribution() {
			super(Activator.PLUGIN_ID + ID_PREFIX + "pageCount"); //$NON-NLS-1$
		}

		@Override
		protected Control createControl(Composite parent) {
			label = new Label(parent, SWT.NONE);
			update();
			return label;
		}

		@Override
		public void update() {
			if ((label != null) && !label.isDisposed()) {
				label.setText(MessageFormat.format("/{0}", score.getPageCount()));
				label.setToolTipText("Page count");
			}
		}

	}

	protected static final float ZOOM_STEP = 0.25f;

	protected static final float ZOOM_IN_FACTOR = 1 + ZOOM_STEP;

	protected static final float ZOOM_OUT_FACTOR = 1 - ZOOM_STEP;

	public class ZoomOutAction extends Action {

		public ZoomOutAction() {
			setToolTipText("Zoom Out");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "ZoomOut.png")); //$NON-NLS-1$
		}

		@Override
		public void run() {
			fitToPageAction.setChecked(false);
			score.setZoom(getNewZoom());
		}

		private float getNewZoom() {
			return score.getZoom() * ZOOM_OUT_FACTOR;
		}

		@Override
		public boolean isEnabled() {
			return score.isZoomValid(getNewZoom());
		}

	}

	public class ZoomInAction extends Action {

		public ZoomInAction() {
			setToolTipText("Zoom In");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "ZoomIn.png")); //$NON-NLS-1$
		}

		@Override
		public void run() {
			fitToPageAction.setChecked(false);
			score.setZoom(getNewZoom());
		}

		private float getNewZoom() {
			return score.getZoom() * ZOOM_IN_FACTOR;
		}

		@Override
		public boolean isEnabled() {
			return score.isZoomValid(getNewZoom());
		}

	}

	public class ZoomToActualSizeAction extends Action {

		public ZoomToActualSizeAction() {
			setToolTipText("Zoom To Actual Size");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "ZoomToActualSize.png")); //$NON-NLS-1$
		}

		@Override
		public void run() {
			fitToPageAction.setChecked(false);
			score.setZoom(1);
		}

	}

	public class FitToPageAction extends Action {

		private final ControlListener resizeListener = new ControlAdapter() {

			@Override
			public void controlResized(ControlEvent e) {
				Scrollable scrollable = (Scrollable)score.getControl();
				float imageWidth = scrollable.getClientArea().width - scrollable.getVerticalBar().getSize().x;
				int pageWidth = score.getPageWidth();
				float widthRatio = imageWidth / pageWidth;
				float imageHeight = scrollable.getClientArea().height - scrollable.getHorizontalBar().getSize().y;
				int pageHeight = score.getPageHeight();
				float heightRatio = imageHeight / pageHeight;
				score.setZoom(Math.min(widthRatio, heightRatio));
			}

		};

		public FitToPageAction() {
			super(null, AS_CHECK_BOX);
			setToolTipText("Fit To Page");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "FitToPage.png")); //$NON-NLS-1$
		}

		@Override
		public void setChecked(boolean checked) {
			super.setChecked(checked);
			if (checked) {
				resizeListener.controlResized(null);
				score.getControl().addControlListener(resizeListener);
			} else {
				score.getControl().removeControlListener(resizeListener);
			}
		}

	}

}
