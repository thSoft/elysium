package org.elysium.ui.refactoring;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.elysium.LilyPondConstants;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.importuri.LilyPondResolvedUri;
import org.elysium.ui.refactoring.LilyPondImportUri.Type;

class LilyPondRefactoringInjects {

	@Inject
	private IResourceDescriptions index;
	@Inject
	private LilyPondImportUriResolver uriResolver;
	@Inject
	private ILilyPondPathProvider pathProvider;
	@Inject
	private IPreferenceStoreAccess preferenceStoreAccess;

	//TODO use resourceSetProvider?
//	@Inject
//	private IResourceSetProvider resourceSetProvider;
	private ResourceSet refactoringResourceSet;

	public ResourceSet getResourceSet(){
		if(refactoringResourceSet==null){
			refactoringResourceSet=new XtextResourceSet();
		}
		return refactoringResourceSet;
	}

	public boolean getPreference(String refactoringPreferenceKey) {
		return preferenceStoreAccess.getPreferenceStore().getBoolean(refactoringPreferenceKey);
	}

	public Iterable<IResourceDescription> getAllResourceDescriptions() {
		return index.getAllResourceDescriptions();
	}

	public LilyPondImportUri resolveImportUri(URI baseURI, String importUri) {
		LilyPondResolvedUri resolved=uriResolver.resolve(baseURI, importUri);
		Type type;
		if(!resolved.isResolved()) {
			type=Type.unresolved;
		} else {
			boolean absolute=LilyPondImportUriResolver.isAbsolute(importUri, LilyPondConstants.IS_WINDOWS);
			if(absolute) {
				type=Type.absolute;
			}else {
				java.net.URI baseOnlyresolved = LilyPondImportUriResolver.saferResolve(java.net.URI.create(baseURI.toString()), importUri, LilyPondConstants.IS_WINDOWS);
				if(resolved.get().equals(baseOnlyresolved.toString())) {
					type=Type.relative;
				} else {
					type=Type.searchPath;
				}
			}
		}
		return new LilyPondImportUri(importUri, resolved.get(), type);
	}

	public List<String> getSearchPaths() {
		return IterableExtensions.toList(pathProvider.getSearchPaths());
	}

	public boolean isSource(IFile file){
		return isSource(file.getFileExtension());
	}

	public boolean isSource(String fileExtension) {
		return LilyPondConstants.EXTENSIONS.contains(fileExtension);
	}

	public boolean isCompiled(IFile file) {
		return LilyPondConstants.COMPILED_EXTENSIONS.contains(file.getFileExtension());	
	}

	public boolean isLinked(IResource resource) {
		return resource.isLinked(IResource.CHECK_ANCESTORS);
	}
}
