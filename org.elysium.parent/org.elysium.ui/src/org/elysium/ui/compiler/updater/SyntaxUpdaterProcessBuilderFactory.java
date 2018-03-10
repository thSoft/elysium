package org.elysium.ui.compiler.updater;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;
import org.elysium.ui.compiler.updater.preferences.SyntaxUpdaterPreferenceConstants;

import com.google.common.collect.Lists;

/**
 * Creates a process builder to update the syntax of the given file.
 */
public class SyntaxUpdaterProcessBuilderFactory {

	private SyntaxUpdaterProcessBuilderFactory() {
	}

	public static ProcessBuilder get(IFile file) {
		IPreferenceStore preferenceStore = Activator.getInstance().getPreferenceStore();
		IPath path = new Path(preferenceStore.getString(CompilerPreferenceConstants.LILYPOND_PATH.name()));
		path = path.removeLastSegments(1);
		List<String> command;
		if(LilyPondConstants.IS_WINDOWS){
			command=createWindowsCommandBase(path);
		}else{
			command=createCommandBase(path);
		}

		if (preferenceStore.getBoolean(SyntaxUpdaterPreferenceConstants.FORCE_CURRENT_VERSION.name())) {
			command.add("--current-version"); //$NON-NLS-1$
		}
		ProcessBuilder processBuilder = new ProcessBuilder();
		processBuilder.command(command);
		return processBuilder;
	}

	private static List<String> createWindowsCommandBase(IPath lilyPondPath){
		ArrayList<String> result = new ArrayList<String>();
		String pythonExecutable="python.exe"; //$NON-NLS-1$
		IPath pythonPath = lilyPondPath.append(pythonExecutable);
		if(pythonPath.toFile().exists()) {
			result.add(pythonPath.toOSString());
		}else {
			result.add(pythonExecutable);
		}
		result.add(lilyPondPath.append("convert-ly.py").toOSString());//$NON-NLS-1$
		return result;
	}

	private static List<String> createCommandBase(IPath lilyPondPath){
		IPath convertPath = lilyPondPath.append("convert-ly"); //$NON-NLS-1$
		return Lists.newArrayList(convertPath.toOSString());
	}

}
