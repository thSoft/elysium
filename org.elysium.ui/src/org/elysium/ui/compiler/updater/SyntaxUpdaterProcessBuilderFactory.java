package org.elysium.ui.compiler.updater;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorPart;
import org.eclipse.util.EditorUtils;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;
import org.elysium.ui.compiler.updater.preferences.SyntaxUpdaterPreferenceConstants;

/**
 * Creates a process builder to update the syntax of the given file.
 */
public class SyntaxUpdaterProcessBuilderFactory {

	private SyntaxUpdaterProcessBuilderFactory() {
	}

	public static ProcessBuilder get(IFile file) {
		IPreferenceStore preferenceStore = Activator.getInstance().getPreferenceStore();
		ProcessBuilder processBuilder = new ProcessBuilder();
		List<String> command = new ArrayList<String>();
		{
			IPath path = new Path(preferenceStore.getString(CompilerPreferenceConstants.LILYPOND_PATH.name()));
			path = path.removeLastSegments(1);
			path = path.append("convert-ly"); //$NON-NLS-1$
			String executablePath = path.toOSString();
			command.add(executablePath);

			IEditorPart editor = EditorUtils.getEditorWithFile(file);
			if (editor == null) {
				command.add("--edit"); //$NON-NLS-1$
			}

			if (preferenceStore.getBoolean(SyntaxUpdaterPreferenceConstants.FORCE_CURRENT_VERSION.name())) {
				command.add("--current-version"); //$NON-NLS-1$
			}
		}
		processBuilder.command(command);
		return processBuilder;
	}

}
