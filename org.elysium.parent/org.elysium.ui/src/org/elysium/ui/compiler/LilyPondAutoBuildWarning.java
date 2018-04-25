package org.elysium.ui.compiler;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.INodeChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.NodeChangeEvent;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.core.runtime.preferences.IPreferenceNodeVisitor;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.elysium.ui.Activator;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

//checks auto build preference value and warns if deactivated
//see AutoBuildJob
public class LilyPondAutoBuildWarning {

	private static LilyPondAutoBuildWarning INSTANCE;
	private AutoBuildPreferenceListener listener = new AutoBuildPreferenceListener();
	boolean showWarning = true;
	private IEclipsePreferences prefs;

	private LilyPondAutoBuildWarning() {
		try {
			IPreferencesService service = Platform.getPreferencesService();
			service.getRootNode().accept(listener);
			service.getRootNode().addNodeChangeListener(listener);
		} catch (BackingStoreException e) {
			Activator.logError("error while initializing 'auto build off' warning", e);
		}
	}

	public static LilyPondAutoBuildWarning getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new LilyPondAutoBuildWarning();
		}
		return INSTANCE;
	}

	public void maybeShowWarning() {
		if (showWarning) {
			boolean autoBuildIsOff = !Platform.getPreferencesService().getBoolean(ResourcesPlugin.PI_RESOURCES,
					ResourcesPlugin.PREF_AUTO_BUILDING, true, null);
			if (autoBuildIsOff) {
				String title = "Automatic build is disabled!";
				String message = "Elysium cannot function properly if automatic build is disabled.\n"
						+ "Automatic LilyPond compilation can be can be disabled separately on the LilyPond preference page.";
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				if (prefs != null) {
					message = message + "\n\nEnable automatic build?";
					boolean doEnable = MessageDialog.openQuestion(shell, title, message);
					if (doEnable) {
						prefs.putBoolean(ResourcesPlugin.PREF_AUTO_BUILDING, true);
					}
				} else {
					MessageDialog.openWarning(shell, title, message);
				}
			}
			showWarning = false;
		}
	}

	private class AutoBuildPreferenceListener
			implements IPreferenceNodeVisitor, INodeChangeListener, IPreferenceChangeListener {
		@Override
		public boolean visit(IEclipsePreferences node) throws BackingStoreException {
			maybeAddListener(node);
			return true;
		}

		@Override
		public void added(NodeChangeEvent event) {
			Preferences pref = event.getChild();
			if (pref instanceof IEclipsePreferences) {
				maybeAddListener((IEclipsePreferences) pref);
			}
		}

		private void maybeAddListener(IEclipsePreferences pref) {
			if (ResourcesPlugin.PI_RESOURCES.equals(pref.name())) {
				if (pref.absolutePath().startsWith("/instance")) {
					pref.addPreferenceChangeListener(this);
					prefs = pref;
				}
			}
		}

		@Override
		public void removed(NodeChangeEvent event) {
		}

		@Override
		public void preferenceChange(PreferenceChangeEvent event) {
			if (ResourcesPlugin.PREF_AUTO_BUILDING.equals(event.getKey())) {
				if (event.getNewValue() != null && !Boolean.parseBoolean(event.getNewValue().toString())) {
					showWarning = true;
				}
			}
		}
	}
}
