package org.elysium.test;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.elysium.LilyPondStandaloneSetup;
import org.elysium.scoping.LilyPondImportUriHelper;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.google.inject.Guice;
import com.google.inject.Injector;

@RunWith(BlockJUnit4ClassRunner.class)
public abstract class LilyPondTest extends AbstractXtextTests {

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		with(new LilyPondStandaloneSetup(){
			public Injector createInjector() {
				return Guice.createInjector(new org.elysium.LilyPondRuntimeModule(){
					@SuppressWarnings("unused")
					public Class<? extends LilyPondImportUriHelper> bindTestImportUriHelper() {
						return CachingImportUriHelper.class;
					}
				});
			}
		});
		injectMembers(this);
	}

	//we cannot use a singleton binding because for each test case a new Injector is created... 
	private static class CachingImportUriHelper implements LilyPondImportUriHelper{
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
