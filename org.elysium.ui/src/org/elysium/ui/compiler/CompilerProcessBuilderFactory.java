package org.elysium.ui.compiler;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.IPreferenceStore;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

/**
 * Creates a process builder to compile the given file.
 */
public class CompilerProcessBuilderFactory {

	public static ProcessBuilder get(IFile file, boolean printPages) {
		IPreferenceStore preferenceStore = Activator.getInstance().getPreferenceStore();
		ProcessBuilder processBuilder = new ProcessBuilder();
		List<String> command = new ArrayList<String>();
		{
			String executablePath = preferenceStore.getString(CompilerPreferenceConstants.LILYPOND_PATH.name());
			command.add(executablePath);

			boolean deleteIntermediateFiles = preferenceStore.getBoolean(CompilerPreferenceConstants.DELETE_INTERMEDIATE_FILES.name());
			command.add(OptionBuilder.build("delete-intermediate-files", deleteIntermediateFiles)); //$NON-NLS-1$

			boolean pointAndClick = preferenceStore.getBoolean(CompilerPreferenceConstants.POINT_AND_CLICK.name());
			command.add(OptionBuilder.build("point-and-click", pointAndClick)); //$NON-NLS-1$

			command.add(OptionBuilder.build("print-pages", printPages)); //$NON-NLS-1$

			boolean verbose = preferenceStore.getBoolean(CompilerPreferenceConstants.VERBOSE.name());
			if (verbose) {
				command.add("--verbose"); //$NON-NLS-1$
			}
		}
		processBuilder.command(command);
		return processBuilder;
	}

	/**
	 * Builds textual LilyPond command-line arguments to assign its internal
	 * program options.
	 */
	public static class OptionBuilder {

		public static String build(String name, boolean value) {
			StringBuilder stringBuilder = new StringBuilder("-d"); //$NON-NLS-1$
			if (!value) {
				stringBuilder.append("no-"); //$NON-NLS-1$
			}
			stringBuilder.append(name);
			return stringBuilder.toString();
		}

	}

}