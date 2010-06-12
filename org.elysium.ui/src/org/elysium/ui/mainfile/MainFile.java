package org.elysium.ui.mainfile;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.elysium.ui.Activator;

/**
 * Manages the main file, a designated file the score or audio of which can be
 * viewed independently from that of the file being edited.
 */
public class MainFile {

	private static IFile mainFile;

	/**
	 * Preference constant for storing the path of the main file.
	 */
	public static final String PREFERENCE = "MAIN_FILE"; //$NON-NLS-1$

	private static final Set<MainFileListener> listeners = new HashSet<MainFileListener>();

	/**
	 * Returns the main file. May return null.
	 */
	public static IFile get() {
		return mainFile;
	}

	/**
	 * Sets the main file to a specified file (which can be null).
	 */
	public static void set(IFile file) {
		IFile oldMainFile = mainFile;
		mainFile = file;
		// Persist value
		Activator.getInstance().getPreferenceStore().setValue(PREFERENCE, (file == null ? "" : file.getFullPath().toString())); //$NON-NLS-1$
		// Notify listeners
		for (MainFileListener listener : listeners) {
			listener.handleMainFileChanged(oldMainFile);
		}
	}

	/**
	 * Unsets the main file.
	 */
	public static void unset() {
		set(null);
	}

	/**
	 * Opens the main file.
	 */
	public static void open() {
		IFile mainFile = get();
		if (mainFile != null) {
			try {
				IDE.openEditor(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage(), mainFile);
			} catch (PartInitException e) {
				Activator.logError("Couldn't open main file", e);
			}
		}
	}

	/**
	 * Registers a main file change listener.
	 */
	public static void addListener(MainFileListener listener) {
		listeners.add(listener);
	}

	/**
	 * Unregisters a main file change listener.
	 */
	public static void removeListener(MainFileListener listener) {
		listeners.remove(listener);
	}

}
