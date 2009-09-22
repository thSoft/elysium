package org.eclipse.lilypond.ide.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.lilypond.ide.Activator;
import org.eclipse.lilypond.ide.PreferenceConstants;

/**
 * Creates the process which invokes <code>lilypond</code> with the appropriate
 * source file and command line options.
 */
public class CompilerProcessBuilderFactory {

	public static ProcessBuilder create(IFile file) {
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		ProcessBuilder result = new ProcessBuilder();
		{
			File directory = file.getParent().getLocation().toFile();
			result.directory(directory);

			List<String> command = new ArrayList<String>();
			{
				String executablePath = preferenceStore.getString(PreferenceConstants.LILYPOND_PATH.name());
				command.add(executablePath);

				boolean deleteIntermediateFiles = preferenceStore.getBoolean(PreferenceConstants.DELETE_INTERMEDIATE_FILES.name());
				if (deleteIntermediateFiles) {
					command.add("-ddelete-intermediate-files"); //$NON-NLS-1$
				}

				String filename = file.getName();
				command.add(filename);
			}
			result.command(command);
		}
		return result;
	}

}
