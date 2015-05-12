package org.elysium.importuri;

import static com.google.common.collect.Iterables.transform;

import java.io.File;
import java.net.URI;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Resolves importURIs by first searching in LilyPond's default include path.
 */
public class LilyPondImportUriResolver extends ImportUriResolver {

	@Inject
	private ILilyPondPathProvider lilyPondPathProvider;

	@Override
	public String resolve(EObject object) {
		String importUri = super.resolve(object);
		if (importUri != null) {
			List<URI> searchUris = Lists.newArrayList(transform(lilyPondPathProvider.getSearchPaths(), new Function<String, URI>() {

				@Override
				public URI apply(String path) {
					return stringToUri(path);
				}

			}));

			String lilypondPath = lilyPondPathProvider.getLilyPondPath();
			URI defaultSearchUri = getDefaultSearchUri(lilypondPath);
			searchUris.add(defaultSearchUri);

			for (URI searchUri : searchUris) {
				URI resolvedImportUri = searchUri.resolve(importUri);
				File importedFile = new File(resolvedImportUri);
				if (importedFile.exists()) {
					return resolvedImportUri.toString();
				}
			}
			return getFileUriOutsideWorkspace(object, importUri).or(importUri);
		}
		return importUri;
	}

	private Optional<String> getFileUriOutsideWorkspace(EObject context, String importUri){
		if(importUri.contains("..")){
			org.eclipse.emf.common.util.URI currentResourceUri = context.eResource().getURI();
			if(currentResourceUri!=null && currentResourceUri.isPlatform()){
				File currentResourceAsFile = new File(Platform.getLocation()+currentResourceUri.toPlatformString(false));
				if (currentResourceAsFile.exists()) {
					URI resolvedImportUri = currentResourceAsFile.toURI().resolve(importUri);
					IWorkspaceRoot workspaceRoot= ResourcesPlugin.getWorkspace().getRoot();
					IFile[] importedFileFoundInWorkspace = workspaceRoot.findFilesForLocationURI(resolvedImportUri);
					if(importedFileFoundInWorkspace.length==0){
						File importedFile = new File(currentResourceAsFile.toURI().resolve(importUri));
						if (importedFile.exists()) {
							return Optional.of(resolvedImportUri.toString());
						}
					}
				}
			}
		}
		return Optional.absent();
	}

	public static URI getDefaultSearchUri(String lilypondPath) {
		URI lilypondUri = stringToUri(lilypondPath);
		URI defaultSearchUri = lilypondUri.resolve("../share/lilypond/current/ly/"); //$NON-NLS-1$ // TODO first existing directory instead of 'current'
		return defaultSearchUri;
	}

	private static URI stringToUri(String lilypondPath) {
		return new File(lilypondPath).toURI();
	}

}
