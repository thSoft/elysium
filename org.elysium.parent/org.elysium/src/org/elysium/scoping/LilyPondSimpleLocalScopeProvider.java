package org.elysium.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;
import org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider;
import org.elysium.lilypond.Assignment;

/**
 * the default simple local scope provider implementation makes everything named within a resource referrable
 * this is not the case for LilyPond files 
 */
public class LilyPondSimpleLocalScopeProvider extends SimpleLocalScopeProvider{

	@Override
	//only root assignmets are visible - assignments within blocks are dealt with in LilyPondScopeProvider
	protected ISelectable getAllDescriptions(Resource resource) {
		List<Assignment> assignments=new ArrayList<Assignment>();
		if(!resource.getContents().isEmpty()){
			EList<EObject> candidates = resource.getContents().get(0).eContents();
			for (EObject eObject : candidates) {
				if(eObject instanceof Assignment){
					assignments.add((Assignment)eObject);
				}
			}
		}
		Iterable<IEObjectDescription> allDescriptions = Scopes.scopedElementsFor(assignments, getNameProvider());
		return new MultimapBasedSelectable(allDescriptions);
	}
}
