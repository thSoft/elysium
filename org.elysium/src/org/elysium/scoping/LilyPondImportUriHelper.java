package org.elysium.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

import com.google.inject.ImplementedBy;

@ImplementedBy(SimpleImportUriHelper.class)
public interface LilyPondImportUriHelper {

	ResourceSet getResourceSetForImportUriCollection();

	IResourceDescription getResourceDescriptionForUri(URI uri, IResourceDescriptions index);
}
