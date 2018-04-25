package org.elysium.ui.version;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.util.process.OutputProcessor;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.CancellableProcessUtils;
import org.elysium.ui.compiler.preferences.CompilerPreferenceConstants;

/**
 * Returns the version of LilyPond run by the user.
 */
public class LilyPondVersion {

	private LilyPondVersion() {
	}

	private static String VERSION = null;

	public static synchronized String get() {
		if(VERSION == null) {
			try {
				IPreferenceStore preferenceStore = Activator.getInstance().getPreferenceStore();
				ProcessBuilder processBuilder = new ProcessBuilder();
				List<String> command = new ArrayList<String>();
				{
					String executablePath = preferenceStore.getString(CompilerPreferenceConstants.LILYPOND_PATH.name());
					command.add(executablePath);
					command.add("-v"); //$NON-NLS-1$
				}
				processBuilder.command(command);
				OutputProcessor processor=new OutputProcessor() {
					
					@Override
					public void processOutput(String line) {
						maybeSetVersion(line);
					}
				};
				CancellableProcessUtils.runCancellableProcess(processBuilder, processor, new NullProgressMonitor(), "Get LilyPond version");
			} catch (Exception e) {
				Activator.logError("error while obtaining LilyPond version", e);
			} finally {
				maybeSetVersion("2.18.0");//$NON-NLS-1$
			}

		}
		return VERSION;
	}

	private static void maybeSetVersion(String line) {
		if(VERSION == null) {
			if(line.contains("LilyPond")) {//$NON-NLS-1$
				Pattern pattern = Pattern.compile(".* (\\d+(\\.\\d+)*).*");//$NON-NLS-1$
				Matcher matcher = pattern.matcher(line);
				if(matcher.matches() && matcher.groupCount()>1) {
					VERSION=matcher.group(1);
				}
			}
		}
	}
}