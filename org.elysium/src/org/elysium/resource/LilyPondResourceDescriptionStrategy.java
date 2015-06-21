package org.elysium.resource;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.LilyPond;

/**
 * Exports {@link EObjectDescription}s from LilyPond files. If these haven't
 * changed, the file doesn't have to be recompiled.
 */
public class LilyPondResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Override
	//only root assignmnets are visible to the outside
	//TODO: please confirm that index is not needed for click and point; for me it worked without the user data!
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (getQualifiedNameProvider() == null) {
			return false;
		}
		if(eObject instanceof LilyPond){
			String recompileIndicatorHash=getRecompileIndicatorHash((LilyPond)eObject);
			HashMap<String, String> userData=new HashMap<String, String>();
			userData.put("recompileHash", recompileIndicatorHash);
			acceptor.accept(EObjectDescription.create(eObject.eResource().getURI().toString(), eObject, userData));
			return true;
		}else if(eObject instanceof Assignment){
			acceptor.accept(EObjectDescription.create(getQualifiedNameProvider().getFullyQualifiedName(eObject), eObject));
			return false;
		}else{
			return false;
		}
	}

	//this could be more sophisticated; e.g. consider only semantic changes
	private String getRecompileIndicatorHash(LilyPond eObject) {
		return ""+NodeModelUtils.findActualNodeFor(eObject).getText().hashCode();
	}
}
