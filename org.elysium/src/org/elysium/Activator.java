package org.elysium;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	private static Activator instance;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
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

}
