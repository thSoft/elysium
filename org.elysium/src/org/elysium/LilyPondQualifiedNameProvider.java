package org.elysium;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.SimpleNameProvider;

/**
 * Provides names for all LilyPond objects to enable detecting whether semantic
 * model changed at build.
 */
public class LilyPondQualifiedNameProvider extends SimpleNameProvider {

	@Override
	public String getQualifiedName(EObject obj) {
		String result = super.getQualifiedName(obj);
		return result == null ? EcoreUtil.getURI(obj).toString() : result;
	}

}
