package org.elysium.ui.hyperlinks;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.findReferences.TargetURICollector;
import org.eclipse.xtext.findReferences.TargetURIs;

public class LilyPondTargetUriCollector extends TargetURICollector {

	@Override
	protected void doAdd(EObject object, TargetURIs targetURIs) {
		super.doAdd(object, targetURIs);
		Set<URI> uris = targetURIs.asSet();
		for (URI uri : uris) {
			//if target URI is file uri, it may still be opened in an editor with platform uri
			//so check if file exists in workspace and add as search URI
			if(uri.isFile()) {
				String fragment = uri.fragment();
				//TODO similar findFilesForLocationURI for file URIS is now used in LilyPondProposalProvider, LilyPondHyperlinkHelper, LilyPondLanguageSpecificURIEditorOpener and here
				IFile[] files = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocationURI(java.net.URI.create(uri.toString()));
				for (IFile iFile : files) {
					if(iFile.exists()) {
						URI uriToAdd = URI.createPlatformResourceURI(iFile.getFullPath().toString(), true);
						if(fragment!=null) {
							uriToAdd=uriToAdd.appendFragment(fragment);
						}
						targetURIs.addURI(uriToAdd);
					}
				}
			}
		}
	}
}
