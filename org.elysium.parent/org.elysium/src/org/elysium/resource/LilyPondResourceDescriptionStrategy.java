package org.elysium.resource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.DefaultReferenceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.inject.Provider;

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

	@Override
	public boolean createReferenceDescriptions(EObject from, URI exportedContainerURI,
			IAcceptor<IReferenceDescription> acceptor) {
		if(from instanceof LilyPond) {
			addCachedIncludesToReferenceDescriptions((XtextResource)from.eResource(), acceptor);
		}

		return super.createReferenceDescriptions(from, exportedContainerURI, acceptor);
	}

	private void addCachedIncludesToReferenceDescriptions(XtextResource resource, IAcceptor<IReferenceDescription> acceptor) {
		String allIncludes = resource.getCache().get("allIncludes", resource, new Provider<String>() {
			@Override
			public String get() {
				return "";//value should already have been provided by LilyPondImportUriGlobalScopeProvider
			}
		});
		if(!allIncludes.isEmpty()) {
			URI resourceURI = resource.getURI();
			List<String> uris = Splitter.on('\n').splitToList(allIncludes);
			for (String uri : uris) {
				//EReference null is marker for include
				DefaultReferenceDescription desc = new DefaultReferenceDescription(resourceURI, URI.createURI(uri), null, -1, null);
				acceptor.accept(desc);
			}
		}
		
	}
}
