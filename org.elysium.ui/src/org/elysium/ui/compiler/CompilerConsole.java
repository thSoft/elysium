package org.elysium.ui.compiler;

import java.text.MessageFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.internal.WorkbenchImages;
import org.eclipse.ui.internal.console.ConsoleMessages;
import org.eclipse.ui.internal.console.IOConsolePage;
import org.eclipse.ui.internal.progress.ProgressMessages;
import org.eclipse.ui.part.IPageBookViewPage;
import org.eclipse.util.ConsoleFactory;
import org.eclipse.util.ConsoleUtils;

/**
 * Console for the LilyPond compiler's output.
 */
@SuppressWarnings("restriction")
public class CompilerConsole extends MessageConsole {

	private final MessageConsoleStream defaultStream = newMessageStream();

	private final MessageConsoleStream metaStream = newMessageStream();

	private Action cancelAction;
	private Action closeConsoleAction;

	private IProgressMonitor monitor;
	private IConsoleView view;
	private boolean viewDiscarded=false;

	/**
	 * The color of the meta messages.
	 */
	private static final Color META_COLOR = new Color(Display.getDefault(), 0, 128, 0);

	private CompilerConsole(String name) {
		super(name, null);
		metaStream.setColor(META_COLOR);
		initCancelAction();
		initCloseConsoleAction();

	}

	/**
	 * Prints a line of message to the console.
	 */
	public void print(String line) {
		print(defaultStream, line);
	}

	/**
	 * Prints a line of meta message to the console.
	 */
	public void printMeta(String line) {
		print(metaStream, line);
	}

	private void print(MessageConsoleStream stream, String line){
		if(view==null || !view.isPinned()){
			ConsoleUtils.showConsole(this);
		}
		if(!viewDiscarded){
			stream.println(line);
		}
	}

	private static final ConsoleFactory<CompilerConsole> FACTORY = new ConsoleFactory<CompilerConsole>() {

		@Override
		public CompilerConsole create(String name) {
			return new CompilerConsole(name);
		}

	};

	/**
	 * Returns the console corresponding to the given file and action.
	 */
	public static CompilerConsole get(IFile file) {
		if (file == null) {
			return null;
		}
		String path = file.getFullPath().toString();
		String name = MessageFormat.format("LilyPond Compiler [{0}]", path);
		return ConsoleUtils.getConsole(name, FACTORY);
	}

	private void initCancelAction(){
		cancelAction = new Action(ProgressMessages.ProgressView_CancelAction) {
			@Override
			public void run() {
				if(monitor!=null){
					monitor.setCanceled(true);
					setMonitor(null);
				}
			}
		};
		ImageDescriptor id = WorkbenchImages.getWorkbenchImageDescriptor("/elcl16/progress_stop.png"); //$NON-NLS-1$
		if (id != null) {
			cancelAction.setImageDescriptor(id);
		}
		id = WorkbenchImages.getWorkbenchImageDescriptor("/dlcl16/progress_stop.png"); //$NON-NLS-1$
		if (id != null) {
			cancelAction.setDisabledImageDescriptor(id);
		}
		cancelAction.setEnabled(false);
	}

	private void initCloseConsoleAction(){
		closeConsoleAction = new Action(ConsoleMessages.CloseConsoleAction_0) {
			@Override
			public void run() {
				viewDiscarded=true;
				ConsolePlugin.getDefault().getConsoleManager().removeConsoles(new IConsole[]{CompilerConsole.this});
			}
		};
		ImageDescriptor id = WorkbenchImages.getWorkbenchImageDescriptor("/elcl16/progress_rem.png"); //$NON-NLS-1$
		if (id != null) {
			closeConsoleAction.setImageDescriptor(id);
		}
	}

	void setMonitor(IProgressMonitor monitor) {
		cancelAction.setEnabled(monitor!=null);
		this.monitor = monitor;
	}

	@Override
	public IPageBookViewPage createPage(IConsoleView view) {
		IOConsolePage result = new IOConsolePage(this, view){
			@Override
			protected void configureToolBar(IToolBarManager mgr) {
				super.configureToolBar(mgr);
				mgr.appendToGroup(IConsoleConstants.LAUNCH_GROUP, cancelAction);
				mgr.appendToGroup(IConsoleConstants.LAUNCH_GROUP, closeConsoleAction);
			}
		};
		this.view=view;
		result.setReadOnly();
		return result;
	}
	
}
