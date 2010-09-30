package org.elysium.ui.outline;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;
import org.elysium.lilyPond.LilyPond;
import org.elysium.lilyPond.Scheme;
import org.elysium.lilyPond.SchemeExpression;
import org.elysium.lilyPond.SchemeList;
import org.elysium.lilyPond.SimpleMusic;

/**
 * Transforms the structure of LilyPond outline nodes.
 */
public class LilyPondTransformer extends AbstractDeclarativeSemanticModelTransformer {

	public boolean consumeNode(LilyPond lilyPond) {
		return false;
	}

	public boolean consumeNode(Scheme scheme) {
		SchemeExpression value = scheme.getValue();
		return ((value != null) && !value.isQuoted() && (value.getValue() instanceof SchemeList));
	}

	public List<EObject> getChildren(Scheme scheme) {
		return NO_CHILDREN;
	}

	@Override
	public boolean consumeNode(EObject object) {
		return !(object instanceof SimpleMusic);
	}

}
