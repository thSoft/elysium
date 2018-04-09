package org.elysium.ui.compiler.console;

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
import org.eclipse.ui.internal.console.ConsoleMessages;
import org.eclipse.ui.internal.console.IOConsolePage;
import org.eclipse.ui.internal.progress.ProgressMessages;
import org.eclipse.ui.part.IPageBookViewPage;
import org.eclipse.util.ConsoleFactory;
import org.eclipse.util.ConsoleUtils;
import org.elysium.ui.Activator;

/**
 * Console for the LilyPond output.
 */
@SuppressWarnings("restriction")
public class LilyPondConsole extends MessageConsole {

	private final MessageConsoleStream defaultStream = newMessageStream();

	private final MessageConsoleStream metaStream = newMessageStream();

	private Action cancelAction;
	private Action closeConsoleAction;
	private Action closeAllFinishedAction;

	private IProgressMonitor monitor;
	private IConsoleView view;
	private boolean viewDiscarded=false;
	private boolean terminated=false;

	/**
	 * The color of the meta messages.
	 */
	private static final Color META_COLOR = new Color(Display.getDefault(), 0, 128, 0);

	private LilyPondConsole(String name) {
		super(name, null);
		metaStream.setColor(META_COLOR);
		initCancelAction();
		initCloseConsoleAction();
		initCloseAllFinishedAction();

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

	private static final ConsoleFactory<LilyPondConsole> FACTORY = new ConsoleFactory<LilyPondConsole>() {

		@Override
		public LilyPondConsole create(String name) {
			return new LilyPondConsole(name);
		}

	};

	/**
	 * Returns the LilyPond compiler console corresponding to the given file.
	 */
	public static LilyPondConsole getCompilerConsole(IFile file) {
		if (file == null) {
			return null;
		}
		String path = file.getFullPath().toString();
		String name = MessageFormat.format("LilyPond Compiler [{0}]", path);
		LilyPondConsole result = ConsoleUtils.getConsole(name, FACTORY);
		result.setTerminated(false);
		return result;
	}

	/**
	 * Returns the console for the syntax update action.
	 */
	public static LilyPondConsole getSyntaxUpdateConsole() {
		LilyPondConsole result = ConsoleUtils.getConsole("Syntax updater", FACTORY);
		result.setTerminated(false);
		return result;
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
		ImageDescriptor id = Activator.getImageDescriptor("icons/compiler/stop.png");//$NON-NLS-1$
		if (id != null) {
			cancelAction.setImageDescriptor(id);
		}
		id = Activator.getImageDescriptor("icons/compiler/stop_disabled.png"); //$NON-NLS-1$
		if (id != null) {
			cancelAction.setDisabledImageDescriptor(id);
		}
		cancelAction.setEnabled(false);
	}

	private void initCloseConsoleAction(){
		closeConsoleAction = new Action(ConsoleMessages.CloseConsoleAction_0) {
			@Override
			public void run() {
				close();
			}
		};
		ImageDescriptor id = Activator.getImageDescriptor("icons/compiler/remove.png");//$NON-NLS-1$
		if (id != null) {
			closeConsoleAction.setImageDescriptor(id);
		}
	}

	private void close(){
		viewDiscarded=true;
		ConsolePlugin.getDefault().getConsoleManager().removeConsoles(new IConsole[]{LilyPondConsole.this});
	}

	private void initCloseAllFinishedAction(){
		closeAllFinishedAction = new Action("Close all terminated") {//$NON-NLS-1$
			@Override
			public void run() {
				IConsole[] all = ConsolePlugin.getDefault().getConsoleManager().getConsoles();
				for (IConsole console : all) {
					if(console instanceof LilyPondConsole){
						LilyPondConsole compilerConsole = (LilyPondConsole) console;
						if(compilerConsole.isTerminated()){
							compilerConsole.close();
						}
					}
				}
			}
		};
		ImageDescriptor id = Activator.getImageDescriptor("icons/compiler/removeall.png");//$NON-NLS-1$
		if (id != null) {
			closeAllFinishedAction.setImageDescriptor(id);
		}
	}

	public void setMonitor(IProgressMonitor monitor) {
		cancelAction.setEnabled(monitor!=null);
		setTerminated(monitor==null);
		this.monitor = monitor;
	}

	private void setTerminated(boolean isTerminated){
		this.terminated=isTerminated;
	}

	private boolean isTerminated(){
		return terminated;
	}

	@Override
	public IPageBookViewPage createPage(IConsoleView view) {
		IOConsolePage result = new IOConsolePage(this, view){
			@Override
			protected void configureToolBar(IToolBarManager mgr) {
				super.configureToolBar(mgr);
				mgr.appendToGroup(IConsoleConstants.LAUNCH_GROUP, cancelAction);
				mgr.appendToGroup(IConsoleConstants.LAUNCH_GROUP, closeConsoleAction);
				mgr.appendToGroup(IConsoleConstants.LAUNCH_GROUP, closeAllFinishedAction);
			}
		};
		this.view=view;
		result.setReadOnly();
		return result;
	}
	
}
