package org.elysium.ui.compiler.updater;

import java.text.MessageFormat;
import java.util.Collection;

import javax.util.process.OutputProcessor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.util.EditorUtils;
import org.eclipse.util.UiUtils;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.CancellableProcessUtils;
import org.elysium.ui.compiler.CompilerProcessBuilderFactory;
import org.elysium.ui.compiler.console.LilyPondConsole;

/**
 * A job in which the syntax of a collection of files is updated.
 */
public class SyntaxUpdaterJob extends Job {

	/**
	 * The files being updated.
	 */
	private final Collection<IFile> files;


	public SyntaxUpdaterJob(Collection<IFile> files) {
		super("Syntax update");
		setProperty(IProgressConstants.ICON_PROPERTY, Activator.getImageDescriptor("icons/compiler/Command.png")); //$NON-NLS-1$
		if(files == null || files.isEmpty()) {
			throw new IllegalArgumentException("no files provided");
		}
		this.files = files;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		IStatus returnStatus=Status.OK_STATUS;
		monitor.beginTask("Syntax update", files.size());
		LilyPondConsole console = LilyPondConsole.getSyntaxUpdateConsole();
		try {
			console.setMonitor(monitor);
			console.clearConsole();
			console.firePropertyChange(this, IConsoleConstants.P_CONSOLE_OUTPUT_COMPLETE, null, false);
			long start = System.currentTimeMillis();
			for (IFile file : files) {
				if(monitor.isCanceled()) {
					throw new OperationCanceledException();
				}
				monitor.subTask(file.getName());
				maybeCloseFileAndUpdateSyntax(monitor, console, file);
				monitor.worked(1);
			}

			long stop = System.currentTimeMillis();

			float executionTimeInSeconds = (stop - start) / 1000f;
			console.printMeta(MessageFormat.format("Syntax update in {0} seconds.", executionTimeInSeconds));
			console.firePropertyChange(this, IConsoleConstants.P_CONSOLE_OUTPUT_COMPLETE, null, true);
			monitor.done();
		} catch(OperationCanceledException e){
			console.printMeta("Syntax update stopped by user");
			returnStatus=Status.CANCEL_STATUS;
		}catch (Exception e) {
			Activator.logError("Syntax update interrupted", e);
			returnStatus=Status.CANCEL_STATUS;
		}
		console.setMonitor(null);
		return returnStatus;
	}

	private void maybeCloseFileAndUpdateSyntax(final IProgressMonitor monitor, final LilyPondConsole console, final IFile file) {
		final IEditorPart editor = EditorUtils.getEditorWithFile(file);
		if (editor != null) {
			// If the file is open then reopen it
			Display.getDefault().syncExec(new Runnable() { // Editor operations must happen in UI thread

				@Override
				public void run() {
					ISelection selection=null;
					if(editor instanceof AbstractTextEditor) {
						selection=((AbstractTextEditor) editor).getSelectionProvider().getSelection();
					}
					IWorkbenchPage workbenchPage = UiUtils.getWorkbenchPage();
					workbenchPage.closeEditor(editor, true);
					updateSyntax(monitor, console, file);
					try {
						IEditorPart openedEditor = IDE.openEditor(workbenchPage, file);
						if(openedEditor instanceof AbstractTextEditor && selection!=null && selection instanceof TextSelection) {
							TextSelection textSelection = (TextSelection)selection;
							((AbstractTextEditor) openedEditor).selectAndReveal(textSelection.getOffset(),0);
						}
					} catch (PartInitException e) {
						Activator.logError("Couldn't refresh editor, try to reopen it", e);
					}
				}

			});
		} else {
			updateSyntax(monitor, console, file);
		}
	}

	private void updateSyntax(IProgressMonitor monitor, LilyPondConsole console, IFile file) {
		try {
			ProcessBuilder processBuilder = SyntaxUpdaterProcessBuilderFactory.get(file);
			CompilerProcessBuilderFactory.prepareProcessBuilder(processBuilder, file);

			OutputProcessor outputProcessor = new SyntaxUpdaterOutputProcessor(console);

			CancellableProcessUtils.runCancellableProcess(processBuilder, outputProcessor, monitor, "update syntax "+file.getName());
		} catch (Exception e) {
			Activator.logError("Couldn't update syntax", e);
		}
	}
}