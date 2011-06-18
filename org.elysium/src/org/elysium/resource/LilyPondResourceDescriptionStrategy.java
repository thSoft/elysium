package org.elysium.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

public class LilyPondResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (getQualifiedNameProvider() == null) {
			return false;
		}
		QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObject);
		if (qualifiedName == null) {
			qualifiedName = QualifiedName.create(EcoreUtil.getURI(eObject).fragment());
		}
		acceptor.accept(EObjectDescription.create(qualifiedName, eObject));
		return true;
	}

}
