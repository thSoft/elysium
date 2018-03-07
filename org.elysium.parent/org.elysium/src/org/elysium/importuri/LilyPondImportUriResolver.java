package org.elysium.importuri;

import static com.google.common.collect.Iterables.transform;

import java.io.File;
import java.io.FileFilter;
import java.net.URI;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.elysium.LilyPondConstants;

import com.google.common.base.Function;
import com.google.common.base.Optional;
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
		String importUri = super.resolve(object);
		if (importUri != null) {
			org.eclipse.emf.common.util.URI currentResourceURI=null;
			if(object.eResource() != null){
				currentResourceURI = object.eResource().getURI();
			}
			LilyPondImportUri lilyPondUri = resolve(currentResourceURI, importUri);
			return lilyPondUri.getUri();
		}
		return importUri;
	}

	public LilyPondImportUri resolve(org.eclipse.emf.common.util.URI resourceURI, String importUri){
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
			URI resolvedImportUri = saferResolve(searchUri, importUri, LilyPondConstants.IS_WINDOWS);
			File importedFile = new File(resolvedImportUri);
			if (importedFile.exists()) {
				//TODO fileNameCasing is a problem here
				//TADA exists although file name is tada
				return potentialPlatformURI(resourceURI, importUri, resolvedImportUri.toString(), true);
			}
		}
		//TODO instead of resourceURI in platform we need absolute file location
		//TODO check whether search path or local file has precedence
		return getFileUriOutsideWorkspace(resourceURI, importUri).or(potentialPlatformURI(resourceURI, importUri, importUri, false));
	}

	//turn absolute uris that are actually located within the workspace into platform URIS
	private LilyPondImportUri potentialPlatformURI(org.eclipse.emf.common.util.URI resourceURI, String originalImportUri, String resolvedUriString, boolean fromSearchPath){
		String uriString=resolvedUriString;
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(resolvedUriString);
		LilyPondImportUri.Type type=fromSearchPath?LilyPondImportUri.Type.searchPath:LilyPondImportUri.Type.relative;
		boolean inWorkspace=true;
		if(Platform.isRunning() && !uri.isRelative()){
			if(isAbsolute(originalImportUri, LilyPondConstants.IS_WINDOWS)){
				type=LilyPondImportUri.Type.absolute;
			}
			String platformString = Platform.getLocation().toString();
			int index = uriString.indexOf(platformString);
			if(index>=0){
				String relative = uriString.substring(index+platformString.length()+1);
				uriString = org.eclipse.emf.common.util.URI.createPlatformResourceURI(relative, true).toString();
			}else{
				inWorkspace=false;
			}
		}
		return new LilyPondImportUri(originalImportUri, uriString, type, inWorkspace);
	}

	public static URI saferResolve(URI base, String importUri, boolean isWindows) {
		URI resolvedImportUri = base.resolve(org.eclipse.emf.common.util.URI.encodeOpaquePart(importUri, true));
		if(isWindows) {
			if(resolvedImportUri.getScheme()!=null && !"file".equals(resolvedImportUri.getScheme())){
				return URI.create("file:/"+resolvedImportUri.toString());//$NON-NLS-1$
			}
		}else if(isAbsolute(importUri, isWindows)){
			if(importUri.startsWith("/")) {//$NON-NLS-1$
				return URI.create("file:"+importUri);//$NON-NLS-1$
			}else{
				return URI.create(importUri);
			}
		}
		return resolvedImportUri;
	}

	private Optional<LilyPondImportUri> getFileUriOutsideWorkspace(org.eclipse.emf.common.util.URI currentResourceUri, String importUri){
		if(importUri.contains("..")){//$NON-NLS-1$
			if(currentResourceUri!=null && currentResourceUri.isPlatform()){
				File currentResourceAsFile = new File(Platform.getLocation()+currentResourceUri.toPlatformString(false));
				if (currentResourceAsFile.exists()) {
					URI resolvedImportUri = saferResolve(currentResourceAsFile.toURI(), importUri, LilyPondConstants.IS_WINDOWS);
					IWorkspaceRoot workspaceRoot= ResourcesPlugin.getWorkspace().getRoot();
					IFile[] importedFileFoundInWorkspace = workspaceRoot.findFilesForLocationURI(resolvedImportUri);
					if(importedFileFoundInWorkspace.length==0){
						File importedFile = new File(resolvedImportUri);
						if (importedFile.exists()) {
							return Optional.of(new LilyPondImportUri(importUri, resolvedImportUri.toString(), LilyPondImportUri.Type.relative, false));
						}
					}
				}
			}
		}
		return Optional.absent();
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
