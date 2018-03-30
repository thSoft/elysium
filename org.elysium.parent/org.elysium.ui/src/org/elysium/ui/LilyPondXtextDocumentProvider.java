package org.elysium.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class LilyPondXtextDocumentProvider extends XtextDocumentProvider {

	@Override
	protected void updateCache(IURIEditorInput input) throws CoreException {
		//prevent XtextDocumentProvider from turning read-only input to read-write input
		URIInfo info= (URIInfo) getElementInfo(input);
		if (info != null) {
			info.updateCache= false;
		}
	}
}
