package org.elysium.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.junit.validation.ValidatorTester;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.elysium.LilyPondStandaloneSetup;
import org.elysium.scoping.LilyPondImportUriGlobalScopeProvider;
import org.elysium.validation.LilyPondJavaValidator;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.inject.Guice;
import com.google.inject.Injector;

@RunWith(BlockJUnit4ClassRunner.class)
public abstract class LilyPondTest extends AbstractXtextTests {

	@Inject
	protected ValidatorTester<LilyPondJavaValidator> tester;

	/**
	 * By default a caching version of the GlobalScopeProvider is used.
	 * Return false if you want the "production" implementation to be used. 
	 * */
	protected boolean useCachingImportUriGlobalScopeProvider(){
		return true;
	}

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		with(new LilyPondStandaloneSetup(){
			public Injector createInjector() {
				return Guice.createInjector(new org.elysium.LilyPondRuntimeModule(){
					@Override
					public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
						if(useCachingImportUriGlobalScopeProvider()){
							return LilyPondTestImportUriGlobalScopeProvider.class;
						}else{
							return super.bindIGlobalScopeProvider();
						}
					}
				});
			}
		});
		injectMembers(this);
	}

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
