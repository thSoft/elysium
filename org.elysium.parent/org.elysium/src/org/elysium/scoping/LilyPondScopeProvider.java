package org.elysium.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Block;
import org.elysium.lilypond.SchemeBlock;
import org.elysium.lilypond.UnparsedBlock;

/**
 * Scoping definition for the LilyPond language.
 * Assignments within blocks are locally visible within that block
 * 
 * root assignmets are dealt with in the named delegate LilyPondSimpleLocalScopeProvider
 */
public class LilyPondScopeProvider extends AbstractDeclarativeScopeProvider {

	private IScope createAssignmentBlockScope(EObject block, EReference ref){
		List<Assignment> defs=new ArrayList<Assignment>();
		for (EObject element : block.eContents()) {
			if(element instanceof Assignment){
				defs.add((Assignment)element);
			}
		}
		return Scopes.scopeFor(defs, getScope(block.eContainer(), ref));
	}

	public IScope scope_Assignment(UnparsedBlock context, EReference ref){
		return createAssignmentBlockScope(context, ref);
	}

	public IScope scope_Assignment(Block context, EReference ref){
		return createAssignmentBlockScope(context, ref);
	}

	public IScope scope_Assignment(SchemeBlock context, EReference ref){
		return createAssignmentBlockScope(context, ref);
	}
}
