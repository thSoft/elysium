package org.elysium.ui.compiler;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.preference.IPreferenceStore;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.UiLilyPondPathProvider;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

import com.google.common.collect.Lists;

/**
 * Creates a process builder to compile the given file.
 */
public class CompilerProcessBuilderFactory {

	public static ProcessBuilder get(IFile file) {
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

			boolean verbose = preferenceStore.getBoolean(CompilerPreferenceConstants.VERBOSE.name());
			if (verbose) {
				command.add("--verbose"); //$NON-NLS-1$
			}

			command.add("-drelative-includes"); //$NON-NLS-1$

			command.add(OptionBuilder.build("midi-extension", LilyPondConstants.AUDIO_EXTENSION)); //$NON-NLS-1$ // On Windows, the default extension is "mid"

			for (String searchPath : UiLilyPondPathProvider.getTheSearchPaths()) {
				command.add(MessageFormat.format("--include={0}", searchPath)); //$NON-NLS-1$
			}

			command.addAll(Lists.newArrayList(preferenceStore.getString(CompilerPreferenceConstants.COMMAND_LINE.name()).split("\\n")));
		}
		processBuilder.command(command);
		processBuilder.redirectErrorStream(true);
		return processBuilder;
	}

	/**
	 * Builds textual LilyPond command-line arguments to assign its internal
	 * program options.
	 */
	public static class OptionBuilder {

		public static String build(String name, boolean value) {
			StringBuilder stringBuilder = getPrefix();
			if (!value) {
				stringBuilder.append("no-"); //$NON-NLS-1$
			}
			stringBuilder.append(name);
			return stringBuilder.toString();
		}

		public static String build(String name, String value) {
			StringBuilder stringBuilder = getPrefix();
			stringBuilder.append(name);
			stringBuilder.append("="); //$NON-NLS-1$
			stringBuilder.append(value);
			return stringBuilder.toString();
		}

		private static StringBuilder getPrefix() {
			return new StringBuilder("-d"); //$NON-NLS-1$
		}

	}

	public static void prepareProcessBuilder(ProcessBuilder processBuilder, IFile file) {
		File directory = file.getLocation().removeLastSegments(1).toFile();
		processBuilder.directory(directory);

		List<String> command = processBuilder.command();
		String filename = file.getName();
		command.add(filename);

		Map<String, String> environment = processBuilder.environment();
		Locale locale = Locale.getDefault();
		environment.put("LANG", locale.toString()+".UTF-8"); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
