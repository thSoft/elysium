package org.eclipse.lilypond.ide.internal;

import java.io.IOException;
import java.text.MessageFormat;
import javax.util.process.ProcessUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.lilypond.ide.Activator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.progress.IProgressConstants;

/**
 * Compiles a given file in a job because it can take a long time.
 */
public class CompilerJob extends Job {

	/**
	 * The file being compiled.
	 */
	private final IFile file;

	/**
	 * The builder of the compiler process.
	 */
	private final ProcessBuilder processBuilder;

	/**
	 * The processor of the compiler's output.
	 */
	private final CompilerOutputProcessor outputProcessor;

	/**
	 * The stream where the messages about the compilation are written.
	 */
	private final MessageConsoleStream metaStream;

	/**
	 * The color of the text in <code>metaStream</code>.
	 */
	private static final Color META_COLOR = new Color(Display.getDefault(), 0, 128, 0);

	public CompilerJob(IFile file) {
		super(MessageFormat.format("Compiling {0}...", file.getFullPath().toString()));
		setProperty(IProgressConstants.ICON_PROPERTY, Activator.getImageDescriptor("icons/jobs/Compile.png")); //$NON-NLS-1$
		this.file = file;
		processBuilder = CompilerProcessBuilderFactory.create(file);
		outputProcessor = new CompilerOutputProcessor(file);
		metaStream = outputProcessor.getConsole().newMessageStream();
		metaStream.setColor(META_COLOR);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			long start = System.currentTimeMillis();
			ProcessUtils.runProcess(processBuilder, outputProcessor);
			long stop = System.currentTimeMillis();

			float executionTimeInSeconds = (stop - start) / 1000f;
			metaStream.print(MessageFormat.format("LilyPond terminated in {0} seconds.", executionTimeInSeconds));

			file.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (IOException e) {
			handleInvalidExecutablePath();
		} catch (InterruptedException e) {
			Activator.logError("Compiler process interrupted, try to compile again", e);
		} catch (CoreException e) {
			Activator.logError("Couldn't refresh project, please refresh manually", e);
		}
		return Status.OK_STATUS;
	}

	/**
	 * Informs the user that the executable path may be invalid and makes it
	 * possible to correct it.
	 */
	private void handleInvalidExecutablePath() {
		final Display display = Display.getDefault();
		display.asyncExec(new Runnable() { // Run in UI thread

			public void run() {
				Shell shell = display.getActiveShell();
				if (MessageDialog.openQuestion(shell, "Warning", "The LilyPond executable path seems to be invalid. Do you want to edit it?")) {
					String preferencePageId = Activator.PLUGIN_ID + ".preferencePages.execution"; //$NON-NLS-1$
					PreferenceDialog preferenceDialog = PreferencesUtil.createPreferenceDialogOn(shell, preferencePageId, null, null);
					if (preferenceDialog != null) {
						preferenceDialog.open();
					}
				}
			}

		});
	}

	@Override
	public boolean belongsTo(Object family) {
		if (family instanceof Family) {
			Family compilerJobFamily = (Family)family;
			return file.equals(compilerJobFamily.file);
		} else {
			return false;
		}
	}

	/**
	 * The job family identifying compiler jobs by the compiled file.
	 */
	public static class Family {

		public final IFile file;

		public Family(IFile file) {
			this.file = file;
		}

	}

}
