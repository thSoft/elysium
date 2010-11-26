package org.elysium.resource;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;

/**
 * Registers the customized {@link LilyPondResourceDescription}.
 */
public class LilyPondResourceDescriptionManager extends DefaultResourceDescriptionManager {

	@Override
	protected IResourceDescription internalGetResourceDescription(Resource resource, IQualifiedNameProvider nameProvider) {
		return new LilyPondResourceDescription(resource, nameProvider);
	}

}
