package org.elysium.ui.compiler;

import static org.eclipse.core.resources.IResource.DEPTH_ZERO;
import static org.elysium.ui.markers.MarkerTypes.OUTDATED;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.util.process.OutputProcessor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.util.EditorUtils;
import org.eclipse.util.UiUtils;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.outdated.OutdatedDecorator;
import org.elysium.ui.compiler.updater.SyntaxUpdaterOutputProcessor;
import org.elysium.ui.compiler.updater.SyntaxUpdaterProcessBuilderFactory;
import org.elysium.ui.compiler.updater.preferences.SyntaxUpdaterPreferenceConstants;

/**
 * A job in which a file is compiled.
 */
public class CompilerJob extends Job {

	/**
	 * The file being compiled.
	 */
	private final IFile file;
	private final boolean executeLilyPondCompile;
	private static final AtomicBoolean modifyLilyPondPathQuestionDialogIsOpen=new AtomicBoolean(false);


	public CompilerJob(IFile file, boolean executeLilyPondCompile) {
		super(MessageFormat.format("Compiling {0}", file.getFullPath().toString()));
		setProperty(IProgressConstants.ICON_PROPERTY, Activator.getImageDescriptor("icons/compiler/Command.png")); //$NON-NLS-1$
		this.file = file;
		this.executeLilyPondCompile=executeLilyPondCompile;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		IStatus returnStatus=Status.OK_STATUS;
		monitor.beginTask("LilyPond Compilation: "+file.getName(), 4);
		boolean fullCompile=LilyPondConstants.EXTENSION.equals(file.getFileExtension()) && executeLilyPondCompile;
		CompilerConsole console = CompilerConsole.get(file);
		try {
			checkCancelled(monitor);
			console.setMonitor(monitor);
			console.clearConsole();
			console.firePropertyChange(this, IConsoleConstants.P_CONSOLE_OUTPUT_COMPLETE, null, false);

			long start = System.currentTimeMillis();
			preprocess(monitor, console);

			checkCancelled(monitor);
			if (fullCompile){
				monitor.subTask("prepare LilyPond processing");
				ProcessBuilder processBuilder = CompilerProcessBuilderFactory.get(file);
				prepareProcessBuilder(processBuilder);

				OutputProcessor outputProcessor = new CompilerOutputProcessor(file, console);
				monitor.worked(1);
				monitor.subTask("LilyPond processing");
				try {
					CancellableProcessUtils.runCancellableProcess(processBuilder, outputProcessor, monitor, "compile "+file.getName());
				} catch (IOException e) {
					handleInvalidExecutablePath();
				}
			}
			monitor.worked(1);

			postprocess(monitor);
			if(fullCompile){
				long stop = System.currentTimeMillis();

				float executionTimeInSeconds = (stop - start) / 1000f;
				console.printMeta(MessageFormat.format("LilyPond terminated in {0} seconds.", executionTimeInSeconds));
			}
			console.firePropertyChange(this, IConsoleConstants.P_CONSOLE_OUTPUT_COMPLETE, null, true);
			scheduleProjectRefresh();
			monitor.done();
		} catch(OperationCanceledException e){
			console.printMeta("Workspace build stopped by user");
			returnStatus=Status.CANCEL_STATUS;
		}catch (Exception e) {
			Activator.logError("Workspace build interrupted", e);
			returnStatus=Status.CANCEL_STATUS;
		}
		console.setMonitor(null);
		return returnStatus;
	}

	private void scheduleProjectRefresh(){
		Job refreshJob = new Job("refresh project") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					file.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
				} catch (CoreException e) {
					Activator.logError("Couldn't refresh project, please refresh manually", e);
				}
				return Status.OK_STATUS;
			}
		};
		refreshJob.setRule(null);
		refreshJob.schedule();
	}

	private void checkCancelled(IProgressMonitor monitor){
		if(monitor.isCanceled()){
			throw new OperationCanceledException();
		}
	}

	private void prepareProcessBuilder(ProcessBuilder processBuilder) {
		File directory = file.getParent().getLocation().toFile();
		processBuilder.directory(directory);

		List<String> command = processBuilder.command();
		String filename = file.getName();
		command.add(filename);

		Map<String, String> environment = processBuilder.environment();
		Locale locale = Locale.getDefault();
		environment.put("LANG", locale.toString()); //$NON-NLS-1$
	}

	private void preprocess(final IProgressMonitor monitor, final CompilerConsole console) {
		checkCancelled(monitor);
		monitor.subTask("updating syntax");
		// Update syntax if enabled
		boolean updateSyntax = Activator.getInstance().getPreferenceStore().getBoolean(SyntaxUpdaterPreferenceConstants.UPDATE_SYNTAX.name());
		if (updateSyntax) {
			final IEditorPart editor = EditorUtils.getEditorWithFile(file);
			if (editor != null) {
				// If the file is open then reopen it
				Display.getDefault().syncExec(new Runnable() { // Editor operations must happen in UI thread

					@Override
					public void run() {
						IWorkbenchPage workbenchPage = UiUtils.getWorkbenchPage();
						workbenchPage.closeEditor(editor, true);
						updateSyntax(monitor, console);
						try {
							IDE.openEditor(workbenchPage, file);
						} catch (PartInitException e) {
							Activator.logError("Couldn't refresh editor, try to reopen it", e);
						}
					}

				});
			} else {
				updateSyntax(monitor, console);
				try {
					file.refreshLocal(0, monitor);
				} catch (CoreException e) {
					Activator.logError("Couldn't refresh file, try to refresh it manually", e);
				}
			}
		}
		// Delete problem markers
		try {
			file.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_ZERO);
		} catch (CoreException e) {
			Activator.logError("Couldn't delete problem markers", e);
		}
		monitor.worked(1);
	}

	private void updateSyntax(IProgressMonitor monitor, CompilerConsole console) {
		try {
			ProcessBuilder processBuilder = SyntaxUpdaterProcessBuilderFactory.get(file);
			prepareProcessBuilder(processBuilder);
			List<String> command = processBuilder.command();
			command.add(command.size() - 1, "--edit"); //$NON-NLS-1$

			OutputProcessor outputProcessor = new SyntaxUpdaterOutputProcessor(console);

			CancellableProcessUtils.runCancellableProcess(processBuilder, outputProcessor, monitor, "update syntax "+file.getName());
		} catch (Exception e) {
			Activator.logError("Couldn't update syntax before compiling", e);
		}
	}

	private void postprocess(IProgressMonitor monitor) {
		checkCancelled(monitor);
		monitor.subTask("clean up");
		try {
			removeOutdatedMarker(file);
		} catch (CoreException e) {
			Activator.logError("Couldn't remove outdated markers", e);
		}
		monitor.worked(1);
	}

	public static void removeOutdatedMarker(IFile file) throws CoreException {
		file.deleteMarkers(OUTDATED, true, DEPTH_ZERO);
		OutdatedDecorator outdatedDecorator = OutdatedDecorator.getInstance();
		if (outdatedDecorator != null) {
			outdatedDecorator.refresh(file);
		}
	}

	/**
	 * Informs the user that the executable path may be invalid and makes it
	 * possible to correct it.
	 */
	private void handleInvalidExecutablePath() {
		Display.getDefault().asyncExec(new Runnable() { // A dialog can be opened only in UI thread

			@Override
			public void run() {
				Shell shell = Display.getDefault().getActiveShell();
				if(!modifyLilyPondPathQuestionDialogIsOpen.get()){
					modifyLilyPondPathQuestionDialogIsOpen.set(true);
					if (MessageDialog.openQuestion(shell, "Warning", "The LilyPond executable path seems to be invalid. Do you want to edit it?")) {
						String preferencePageId = Activator.getId() + ".preferencePages.Compiler"; //$NON-NLS-1$
						PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(shell, preferencePageId, null, null);
						if (preferenceDialog != null) {
							preferenceDialog.open();
						}
					}
					modifyLilyPondPathQuestionDialogIsOpen.set(false);
				}
			}

		});
	}

	@Override
	public boolean belongsTo(Object family) {
		if (family instanceof CompilerJob) {
			CompilerJob that = (CompilerJob)family;
			return file.equals(that.file);
		} else {
			return false;
		}
	}
}