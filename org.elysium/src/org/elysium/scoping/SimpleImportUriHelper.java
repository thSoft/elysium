package org.elysium.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

class SimpleImportUriHelper implements
		LilyPondImportUriHelper {

	@Override
	public ResourceSet getResourceSetForImportUriCollection() {
		return new ResourceSetImpl();
	}

	@Override
	public IResourceDescription getResourceDescriptionForUri(URI uri,
			IResourceDescriptions index) {
		return index.getResourceDescription(uri);
	}
}
