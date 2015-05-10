package org.elysium.importuri;

import static com.google.common.collect.Iterables.transform;

import java.io.File;
import java.io.FileFilter;
import java.net.URI;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

import com.google.common.base.Function;
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
		}
		return importUri;
	}

	private static LoadingCache<String, URI> defaultSearchUriCache=CacheBuilder.newBuilder().maximumSize(3).build(new CacheLoader<String, URI>(){
		@Override
		public URI load(String key) throws Exception {
			URI lilypondUri = stringToUri(key);
			File f=new File(lilypondUri.resolve("../share/lilypond/"));
			if (f.isDirectory()){
				for (File subDir : f.listFiles()) {
					if(subDir.isDirectory()){
						File[] candidates = subDir.listFiles(new FileFilter() {
							@Override
							public boolean accept(File pathname) {
								return pathname.getName().equals("ly");
							}
						});
						if(candidates.length>0){
							return candidates[0].toURI();
						}
					}
				}
			}
			URI defaultSearchUri = lilypondUri.resolve("../share/lilypond/current/ly/"); //$NON-NLS-1$
			return defaultSearchUri;
		}
	});

	public static URI getDefaultSearchUri(String lilypondPath) {
		return defaultSearchUriCache.getUnchecked(lilypondPath);
	}

	private static URI stringToUri(String lilypondPath) {
		return new File(lilypondPath).toURI();
	}

}
