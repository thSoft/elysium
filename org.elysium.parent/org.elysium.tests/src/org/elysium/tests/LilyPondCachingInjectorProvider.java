package org.elysium.tests;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.elysium.LilyPondRuntimeModule;
import org.elysium.scoping.LilyPondImportUriGlobalScopeProvider;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class LilyPondCachingInjectorProvider extends LilyPondInjectorProvider {

	@Override
	protected LilyPondRuntimeModule createRuntimeModule() {
		return new org.elysium.LilyPondRuntimeModule(){
			@Override
			public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
					return LilyPondTestImportUriGlobalScopeProvider.class;
			}
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return LilyPondCachingInjectorProvider.class
						.getClassLoader();
			}
		};
	}

	/**
	 * In order to speed up integration tests, a single resource set is used for determining transitive includes.
	 * This ensures, that the same default include need not be loaded multiple times.
	 * In a similar fashion linking speed is increased by caching the resource descriptions used for calculating
	 * global scopes. The expire policy is not strictly required, but it makes explicit that URIs processed more often
	 * should be kept. That way the caching mechanism prefers default includes over those needed only for a 
	 * particular integration test case. The 10 seconds are arbitrary but should be sufficient to keep default
	 * includes in memory between two distinct integration tests.
	 * */
	private static class LilyPondTestImportUriGlobalScopeProvider extends LilyPondImportUriGlobalScopeProvider{
		private static ResourceSet resourceSet=new ResourceSetImpl();
		private static Cache<URI,IResourceDescription> resourceDescriptionCacheMap=CacheBuilder.newBuilder()
				.maximumSize(50).expireAfterAccess(10, TimeUnit.SECONDS).build();

		@Override
		public ResourceSet getResourceSetForImportUriCollection() {
			return resourceSet;
		}

		@Override
		public IResourceDescription getResourceDescriptionForUri(final URI uri, final IResourceDescriptions index) {
			try {
				IResourceDescription result = resourceDescriptionCacheMap.get(uri, new Callable<IResourceDescription>(){
					@Override
					public IResourceDescription call() throws Exception {
						return index.getResourceDescription(uri);
					}
				});
				return result;
			} catch (ExecutionException e) {
				throw new IllegalStateException(e);
			}
		}
	}
}
