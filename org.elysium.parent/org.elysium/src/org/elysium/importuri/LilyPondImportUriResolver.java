package org.elysium.importuri;

import static com.google.common.collect.Iterables.transform;

import java.io.File;
import java.io.FileFilter;
import java.net.URI;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.elysium.LilyPondConstants;

import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Resolves importURIs by first searching in LilyPond's default include path.
 */
public class LilyPondImportUriResolver extends ImportUriResolver {

	@Inject
	private ILilyPondPathProvider lilyPondPathProvider;

	public static boolean isAbsolute(String uriString, boolean isWindows) {
		if(Strings.isNullOrEmpty(uriString)) {
			return false;
		}else if(isWindows) {
			return new File(uriString).isAbsolute();
		} else {
			return uriString.startsWith("/") || uriString.startsWith("file:/");//$NON-NLS-1$//$NON-NLS-2$
		}
	}

	@Override
	public String resolve(EObject object) {
		LilyPondResolvedUri typed = typedResolve(object);
		return typed.get();
	}

	public LilyPondResolvedUri typedResolve(EObject object) {
		String importUri = super.resolve(object);
		if (importUri != null) {
			org.eclipse.emf.common.util.URI currentResourceURI=null;
			if(object.eResource() != null){
				currentResourceURI = object.eResource().getURI();
				if(currentResourceURI.isPlatform() && Platform.isRunning()) {
					//find absolute location of including file
					String platformString = currentResourceURI.toPlatformString(true);
					Path path = new Path(platformString);
					IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					if(file.exists()) {
						IPath absoluteLocation = file.getLocation();
						currentResourceURI=org.eclipse.emf.common.util.URI.createFileURI(absoluteLocation.toFile().getAbsolutePath());
					}
				}
			}
			LilyPondResolvedUri resolved = resolve(currentResourceURI, importUri);
			return resolved;
		}
		return LilyPondResolvedUri.unresolved(importUri);
	}

	public LilyPondResolvedUri resolve(org.eclipse.emf.common.util.URI resourceURI, String importUri){
		List<URI> searchUris = Lists.newArrayList(transform(lilyPondPathProvider.getSearchPaths(), new Function<String, URI>() {
			@Override
			public URI apply(String path) {
				return stringToUri(path);
			}
		}));
		String lilypondPath = lilyPondPathProvider.getLilyPondPath();
		URI defaultSearchUri = getDefaultSearchUri(lilypondPath);
		searchUris.add(defaultSearchUri);
		if(resourceURI!=null) {
			searchUris.add(URI.create(resourceURI.toString()));
		}

		for (URI searchUri : searchUris) {
			URI resolvedImportUri = saferResolve(searchUri, importUri, LilyPondConstants.IS_WINDOWS);
			if(resolvedImportUri.isAbsolute()) {
				File importedFile = new File(resolvedImportUri);
				if (importedFile.exists()) {
					return new LilyPondResolvedUri(resolvedImportUri.toString());
				}
			}
		}
		return LilyPondResolvedUri.unresolved(importUri);
	}

	public static URI saferResolve(URI base, String importUri, boolean isWindows) {
		URI resolvedImportUri = base.resolve(org.eclipse.emf.common.util.URI.encodeOpaquePart(importUri, true));
		if(isWindows) {
			if(resolvedImportUri.getScheme()!=null && !"file".equals(resolvedImportUri.getScheme())){
				return URI.create("file:/"+resolvedImportUri.toString());//$NON-NLS-1$
			}
		}else if(isAbsolute(importUri, isWindows)){
			String importUriToUse=importUri;
			if(importUri.startsWith("/")) {//$NON-NLS-1$
				importUriToUse="file:"+importUri;//$NON-NLS-1$
			}
			return URI.create(org.eclipse.emf.common.util.URI.encodeOpaquePart(importUriToUse, true));
		}
		return resolvedImportUri;
	}

	public static URI getDefaultSearchUri(String lilypondPath) {
		return defaultSearchUriCache.getUnchecked(lilypondPath);
	}

	private static LoadingCache<String, URI> defaultSearchUriCache=CacheBuilder.newBuilder().maximumSize(3).build(new CacheLoader<String, URI>(){
		@Override
		public URI load(String key) throws Exception {
			URI lilypondUri = stringToUri(key);
			URI shareBaseUri=lilypondUri.resolve("../share/lilypond/");//$NON-NLS-1$
			final String lyDirectoryName="ly";//$NON-NLS-1$
			File f=new File(shareBaseUri);
			if (f.isDirectory()){
				for (File subDir : f.listFiles()) {
					if(subDir.isDirectory()){
						File[] candidates = subDir.listFiles(new FileFilter() {
							@Override
							public boolean accept(File pathname) {
								return pathname.getName().equals(lyDirectoryName);
							}
						});
						if(candidates.length>0){
							return candidates[0].toURI();
						}
					}
				}
			}
			URI defaultSearchUri = shareBaseUri.resolve("current/"+lyDirectoryName+"/"); //$NON-NLS-1$ //$NON-NLS-2$
			return defaultSearchUri;
		}
	});

	private static URI stringToUri(String lilypondPath) {
		return new File(lilypondPath).toURI();
	}

}
