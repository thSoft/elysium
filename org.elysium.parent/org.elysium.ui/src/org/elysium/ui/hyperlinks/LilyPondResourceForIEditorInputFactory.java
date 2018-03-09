package org.elysium.ui.hyperlinks;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.sourcelookup.containers.LocalFileStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;

import com.google.inject.Inject;

public class LilyPondResourceForIEditorInputFactory extends ResourceForIEditorInputFactory {

	@Inject
	private IResourceFactory resourceFactory;

	@Override
	protected Resource createResourceFor(IStorage storage) throws CoreException {
		IStorage storageToUse=storage;
		if(storageToUse instanceof IFile) {
			//turn workspace file into local file with absolute location
			IPath absoluteLocation = ((IFile)storageToUse).getLocation();
			storageToUse=new LocalFileStorage(absoluteLocation.toFile());
		}
		if(storageToUse instanceof LocalFileStorage) {
			//copy from super - file uri instead of platform uri
			ResourceSet resourceSet = getResourceSet(storageToUse);
			String absoluteLocation =  ((LocalFileStorage) storageToUse).getFile().getAbsolutePath();
			URI uri=org.eclipse.emf.common.util.URI.createFileURI(absoluteLocation);
			configureResourceSet(resourceSet, uri);
			URI uriForResource = uri; 
			if (!uri.isPlatform()) {
				uriForResource = resourceSet.getURIConverter().normalize(uri);
			}
			XtextResource resource = (XtextResource) resourceFactory.createResource(uriForResource);
			resourceSet.getResources().add(resource);
			resource.setValidationDisabled(isValidationDisabled(uri, storageToUse));
			return resource;
		} else {
			return super.createResourceFor(storageToUse);
		}
	}
}
