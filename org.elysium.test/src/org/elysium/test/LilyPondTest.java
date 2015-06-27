package org.elysium.test;

import java.util.HashMap;
import java.util.Map;

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
		private static Map<URI,IResourceDescription> resourceDescriptionMap=new HashMap<URI,IResourceDescription>();

		@Override
		public ResourceSet getResourceSetForImportUriCollection() {
			return resourceSet;
		}

		@Override
		public IResourceDescription getResourceDescriptionForUri(URI uri,
				IResourceDescriptions index) {
			IResourceDescription result=resourceDescriptionMap.get(uri);
			if(result==null){
				result=index.getResourceDescription(uri);
				resourceDescriptionMap.put(uri, result);
			}
			return result;
		}
	}
}
