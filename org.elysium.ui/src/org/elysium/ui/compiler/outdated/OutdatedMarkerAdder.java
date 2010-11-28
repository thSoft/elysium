package org.elysium.ui.compiler.outdated;

import static org.eclipse.core.resources.IMarker.MESSAGE;
import static org.eclipse.core.resources.IResource.DEPTH_ZERO;
import static org.eclipse.core.resources.IResourceDelta.CHANGED;
import static org.eclipse.core.resources.IResourceDelta.CONTENT;
import static org.elysium.ui.compiler.LilyPondBuilder.addAllIncludingFiles;
import static org.elysium.ui.markers.MarkerTypes.OUTDATED;
import static org.elysium.ui.markers.MarkerTypes.UP_TO_DATE;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;

/**
 * Adds outdated markers to LilyPond files when their contents changed.
 */
public class OutdatedMarkerAdder implements IResourceChangeListener {

	private static final IResourceDeltaVisitor VISITOR = new IResourceDeltaVisitor() {

		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			if ((resource instanceof IFile) && LilyPondConstants.EXTENSIONS.contains(resource.getFileExtension()) && (delta.getKind() == CHANGED)) {
				// Add marker to the file and all including files when its content changed
				if ((delta.getFlags() & CONTENT) != 0) {
					Set<IFile> files = new HashSet<IFile>();
					files.add((IFile)resource);
					addAllIncludingFiles(files);
					for (IFile file : files) {
						if ((file.findMarkers(OUTDATED, false, DEPTH_ZERO).length == 0) && (file.findMarkers(UP_TO_DATE, false, DEPTH_ZERO).length == 0)) {
							IMarker outdatedMarker = file.createMarker(OUTDATED);
							outdatedMarker.setAttribute(MESSAGE, "This file has been changed since it was compiled");
							// Refresh decorator
							OutdatedDecorator outdatedDecorator = OutdatedDecorator.getInstance();
							if (outdatedDecorator != null) {
								outdatedDecorator.refresh(file);
							}
						}
					}
				}
			}
			return true;
		}

	};

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		try {
			event.getDelta().accept(VISITOR);
		} catch (CoreException e) {
			Activator.logError("Couldn't add LilyPond outdated markers", e);
		}
	}

}
