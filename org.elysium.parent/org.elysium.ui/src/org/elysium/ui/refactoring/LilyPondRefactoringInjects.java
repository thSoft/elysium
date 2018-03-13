package org.elysium.ui.refactoring;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.elysium.LilyPondConstants;
import org.elysium.importuri.ILilyPondPathProvider;
import org.elysium.importuri.LilyPondImportUri;
import org.elysium.importuri.LilyPondImportUri.Type;
import org.elysium.importuri.LilyPondImportUriResolver;
import org.elysium.importuri.LilyPondResolvedUri;
import org.elysium.ui.preferences.LilyPondRefactoringPreferencePage;

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

	public boolean warnSearchPathAffected(){
		return preferenceStoreAccess.getPreferenceStore().getBoolean(LilyPondRefactoringPreferencePage.REFACTORING_WARN_SEARCHPATH);
	}

	public boolean warnVariableInclude(){
		return preferenceStoreAccess.getPreferenceStore().getBoolean(LilyPondRefactoringPreferencePage.REFACTORING_WARN_VARIABLE_INCLUDE);
	}

	public Iterable<IResourceDescription> getAllResourceDescriptions() {
		return index.getAllResourceDescriptions();
	}

	public LilyPondImportUri resolveImportUri(URI baseURI, String importUri) {
		LilyPondResolvedUri resolved=uriResolver.resolve(baseURI, importUri);
		//TODO this is temporary, so that compile works
		//LilyPondUri needs to be replaced
		return new LilyPondImportUri(importUri, resolved.get(), Type.relative, true);
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
}
