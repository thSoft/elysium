package org.elysium.resource;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import com.google.common.collect.Maps;

/**
 * Exports {@link EObjectDescription}s from LilyPond files. If these haven't
 * changed, the file doesn't have to be recompiled.
 */
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
		Map<String, String> userData = Maps.newHashMap();
		for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			Object value = eObject.eGet(attribute);
			userData.put(attribute.getName(), value == null ? "" : value.toString());
		}
		acceptor.accept(EObjectDescription.create(qualifiedName, eObject, userData));
		return true;
	}

}
