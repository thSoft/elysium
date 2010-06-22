package org.elysium.ui.compiler;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.util.process.OutputProcessor;
import javax.util.process.ProcessUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.progress.IProgressConstants;
import org.eclipse.util.ConsoleUtils;
import org.eclipse.util.EditorUtils;
import org.eclipse.util.UiUtils;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.outdated.OutdatedDecorator;
import org.elysium.ui.compiler.updater.SyntaxUpdaterOutputProcessor;
import org.elysium.ui.compiler.updater.SyntaxUpdaterProcessBuilderFactory;
import org.elysium.ui.compiler.updater.preferences.SyntaxUpdaterPreferenceConstants;
import org.elysium.ui.markers.MarkerTypes;

/**
 * A job in which a file is compiled.
 */
public class CompilerJob extends Job {

	/**
	 * The file being compiled.
	 */
	private final IFile file;

	/**
	 * The console where the compiler's output is printed.
	 */
	private final CompilerConsole console;

	/**
	 * The process in which the file is compiled.
	 */
	private Process process;

	public CompilerJob(IFile file) {
		super(MessageFormat.format("Compiling {0}", file.getFullPath().toString()));
		setProperty(IProgressConstants.ICON_PROPERTY, Activator.getImageDescriptor("icons/compiler/Command.png")); //$NON-NLS-1$
		this.file = file;
		console = CompilerConsole.get(file);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			console.clearConsole();
			ConsoleUtils.showConsole(console);

			long start = System.currentTimeMillis();
			preprocess();

			ProcessBuilder processBuilder = CompilerProcessBuilderFactory.get(file);
			prepareProcessBuilder(processBuilder);

			OutputProcessor outputProcessor = new CompilerOutputProcessor(file, console);
			try {
				process = ProcessUtils.runProcess(processBuilder, outputProcessor);
			} catch (IOException e) {
				handleInvalidExecutablePath();
			} catch (InterruptedException e) {
				Activator.logError("Processing interrupted, try to process again", e);
			}

			postprocess();
			long stop = System.currentTimeMillis();

			float executionTimeInSeconds = (stop - start) / 1000f;
			console.printMeta(MessageFormat.format("LilyPond terminated in {0} seconds.", executionTimeInSeconds));

			try {
				file.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			} catch (CoreException e) {
				Activator.logError("Couldn't refresh project, please refresh manually", e);
			}

			return Status.OK_STATUS;
		} catch (Exception e) {
			Activator.logError("Workspace build interrupted", e);
			return Status.CANCEL_STATUS;
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

	private void preprocess() {
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
						updateSyntax();
						try {
							IDE.openEditor(workbenchPage, file);
						} catch (PartInitException e) {
							Activator.logError("Couldn't refresh editor, try to reopen it", e);
						}
					}

				});
			} else {
				updateSyntax();
				try {
					file.refreshLocal(0, new NullProgressMonitor());
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
	}

	private void updateSyntax() {
		try {
			ProcessBuilder processBuilder = SyntaxUpdaterProcessBuilderFactory.get(file);
			prepareProcessBuilder(processBuilder);
			List<String> command = processBuilder.command();
			command.add(command.size() - 1, "--edit"); //$NON-NLS-1$

			OutputProcessor outputProcessor = new SyntaxUpdaterOutputProcessor(console);

			ProcessUtils.runProcess(processBuilder, outputProcessor);
		} catch (Exception e) {
			Activator.logError("Couldn't update syntax before compiling", e);
		}
	}

	private void postprocess() {
		try {
			file.deleteMarkers(MarkerTypes.OUTDATED, true, IResource.DEPTH_ZERO);
			OutdatedDecorator outdatedDecorator = OutdatedDecorator.getInstance();
			if (outdatedDecorator != null) {
				outdatedDecorator.refresh(file);
			}
		} catch (CoreException e) {
			Activator.logError("Couldn't delete outdated markers", e);
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
				if (MessageDialog.openQuestion(shell, "Warning", "The LilyPond executable path seems to be invalid. Do you want to edit it?")) {
					String preferencePageId = Activator.getId() + ".preferencePages.Compiler"; //$NON-NLS-1$
					PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(shell, preferencePageId, null, null);
					if (preferenceDialog != null) {
						preferenceDialog.open();
					}
				}
			}

		});
	}

	@Override
	protected void canceling() {
		super.canceling();
		if (process != null) {
			process.destroy();
		}
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
