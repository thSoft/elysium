package org.elysium.resource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;

import com.google.common.base.Joiner;

/**
 * Exports {@link EObjectDescription}s from LilyPond files. If these haven't
 * changed, the file doesn't have to be recompiled.
 */
public class LilyPondResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	@Override
	//only root assignments are visible to the outside
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (getQualifiedNameProvider() == null) {
			return false;
		}
		if(eObject instanceof LilyPond){
			String recompileIndicatorHash=getRecompileIndicatorHash((LilyPond)eObject);
			Map<String, String> userData=new HashMap<String, String>();
			userData.put("recompileHash", recompileIndicatorHash);
			addIncludeUserData((LilyPond)eObject, userData);
			acceptor.accept(EObjectDescription.create(eObject.eResource().getURI().toString(), eObject, userData));
			return true;
		}else if(eObject instanceof Assignment){
			acceptor.accept(EObjectDescription.create(getQualifiedNameProvider().getFullyQualifiedName(eObject), eObject));
			return false;
		}else{
			return false;
		}
	}

	//TODO: more sophisticated recompile indicator
	//using click and point positions; see pull request #84 
	private String getRecompileIndicatorHash(LilyPond eObject) {
		return ""+NodeModelUtils.findActualNodeFor(eObject).getText().hashCode();
	}

	private void addIncludeUserData(LilyPond root, Map<String, String> userData){
		Set<String>directInclues=new HashSet<String>();
		boolean hasVariableInclude=false;
		List<Include>includes=EcoreUtil2.getAllContentsOfType(root, Include.class);
		for (Include include : includes) {
			if(include.getImportURI()!=null){
				directInclues.add(include.getImportURI());
			}else if(include.getCommand()!=null){
				hasVariableInclude=true;
			}
		}
		userData.put("includes", Joiner.on('\n').join(directInclues));
		userData.put("variableInclude", ""+hasVariableInclude);
	}
}
