package org.elysium.ui.hyperlinks;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.importuri.LilyPondResolvedUri;
import org.elysium.lilypond.Include;

public class LilyPondEObjectHoverProvider extends DefaultEObjectHoverProvider {

	@Inject
	private LilyPondImportUriResolver resolver;

	@Override
	protected boolean hasHover(EObject o) {
		if(o instanceof Include) {
			return true;
		} 
		return super.hasHover(o);
	}

	@Override
	protected String getHoverInfoAsHtml(EObject o) {
		if(o instanceof Include) {
			Include include = (Include)o;
			if(include.getImportURI() != null) {
				LilyPondResolvedUri resolved = resolver.typedResolve(include);
				if(resolved.isResolved()) {
					return URI.decode(resolved.get());
				}
			}
		}
		return super.getHoverInfoAsHtml(o);
	}
}
