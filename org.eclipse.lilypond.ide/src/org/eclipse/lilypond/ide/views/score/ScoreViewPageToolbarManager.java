package org.eclipse.lilypond.ide.views.score;

import java.text.MessageFormat;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.lilypond.ide.Activator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * Manages the contributions to a score view page's toolbar.
 */
public class ScoreViewPageToolbarManager {

	private final ScoreViewPage score;

	private static final String ICON_PATH = "icons/toolbars/Score/";

	private static final String ID_PREFIX = ".toolbars.Score.";

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
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "FirstPage.png"));
		}

		@Override
		public void run() {
			score.setPage(1);
		}

	}

	public class PreviousPageAction extends Action {

		public PreviousPageAction() {
			setToolTipText("Go To Previous Page");
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "PreviousPage.png"));
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
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "NextPage.png"));
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
			setImageDescriptor(Activator.getImageDescriptor(ICON_PATH + "LastPage.png"));
		}

		@Override
		public void run() {
			score.setPage(score.getPageCount());
		}

	}

	public class CurrentPageContribution extends ControlContribution {

		private Text text;

		public CurrentPageContribution() {
			super(Activator.PLUGIN_ID + ID_PREFIX + "currentPage");
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
			super(Activator.PLUGIN_ID + ID_PREFIX + "pageCount");
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

}
