package org.lilypond;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.lilypond.internal.LilyPondActivator;
import org.lilypond.score.PdfResourceChangeListener;
import org.osgi.framework.BundleContext;

/**
 * Controls the plug-in life cycle.
 */
public class Activator extends LilyPondActivator {

	public static final String PLUGIN_ID = "org.eclipse.lilypond.ui"; //$NON-NLS-1$

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(new PdfResourceChangeListener(), IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path.
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	/**
	 * Logs an exception with a message.
	 */
	public static void logError(String message, Throwable throwable) {
		getInstance().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, message, throwable));
	}

}
