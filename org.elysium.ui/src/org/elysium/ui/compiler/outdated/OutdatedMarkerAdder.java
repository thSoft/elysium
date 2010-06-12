package org.elysium.ui.compiler.outdated;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.elysium.LilyPondConstants;
import org.elysium.ui.Activator;
import org.elysium.ui.compiler.LilyPondBuilder;
import org.elysium.ui.markers.MarkerTypes;

/**
 * Adds outdated markers to LilyPond files when their contents changed.
 */
public class OutdatedMarkerAdder implements IResourceChangeListener {

	private static final IResourceDeltaVisitor VISITOR = new IResourceDeltaVisitor() {

		@Override
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			if ((resource instanceof IFile) && Arrays.asList(LilyPondConstants.EXTENSIONS).contains(resource.getFileExtension()) && (delta.getKind() == IResourceDelta.CHANGED)) {
				// Add marker to the file and all including files when its content changed
				if ((delta.getFlags() & IResourceDelta.CONTENT) != 0) {
					IProject project = delta.getResource().getProject();
					Set<IFile> files = new HashSet<IFile>();
					files.add((IFile)resource);
					ResourceSet resourceSet = new ResourceSetImpl();
					LilyPondBuilder.addAllIncludingFiles(project, files, resourceSet);
					for (IFile file : files) {
						if (file.findMarkers(MarkerTypes.OUTDATED, false, IResource.DEPTH_ZERO).length == 0) {
							IMarker outdatedMarker = file.createMarker(MarkerTypes.OUTDATED);
							outdatedMarker.setAttribute(IMarker.MESSAGE, "This file has been changed since it was compiled. Enabling automatic compilation is recommended");
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
