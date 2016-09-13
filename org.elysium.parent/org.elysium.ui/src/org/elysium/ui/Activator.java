package org.elysium.ui;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.elysium.ui.compiler.outdated.OutdatedMarkerAdder;
import org.elysium.ui.internal.ElysiumActivator;
import org.osgi.framework.BundleContext;

/**
 * Controls the plug-in life cycle.
 */
public class Activator extends ElysiumActivator {

	private static Activator instance;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		// Register resource change listeners
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new OutdatedMarkerAdder(), IResourceChangeEvent.POST_BUILD);
	}

	/**
	 * Returns the shared plug-in instance.
	 */
	public static Activator getInstance() {
		return instance;
	}

	/**
	 * Returns the plug-in's identifier.
	 */
	public static String getId() {
		return getInstance().getBundle().getSymbolicName();
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path.
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(getId(), path);
	}

	/**
	 * Logs an exception with a message.
	 */
	public static void logError(String message, Throwable throwable) {
		getInstance().getLog().log(new Status(IStatus.ERROR, getId(), message, throwable));
	}

}
