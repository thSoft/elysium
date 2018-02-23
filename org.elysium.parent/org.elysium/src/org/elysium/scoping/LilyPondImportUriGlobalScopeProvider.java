package org.elysium.scoping;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilypondFactory;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Handles implicitly included files: initialization file and transitive
 * includes.
 */
public class LilyPondImportUriGlobalScopeProvider extends AbstractGlobalScopeProvider {

	@Inject
	private ImportUriResolver importUriResolver;

	public ImportUriResolver getImportUriResolver() {
		return importUriResolver;
	}

	public void setImportUriResolver(ImportUriResolver importResolver) {
		this.importUriResolver = importResolver;
	}

	@Inject
	private Provider<LoadOnDemandResourceDescriptions> loadOnDemandDescriptions;

	public Provider<LoadOnDemandResourceDescriptions> getLoadOnDemandDescriptions() {
		return loadOnDemandDescriptions;
	}

	public void setLoadOnDemandDescriptions(Provider<LoadOnDemandResourceDescriptions> loadOnDemandDescriptions) {
		this.loadOnDemandDescriptions = loadOnDemandDescriptions;
	}

	@Inject
	private IResourceScopeCache cache;

	public IResourceScopeCache getCache() {
		return cache;
	}

	public void setCache(IResourceScopeCache cache) {
		this.cache = cache;
	}

	@Override
	protected IScope getScope(Resource resource, boolean ignoreCase, EClass type, Predicate<IEObjectDescription> filter) {
		final LinkedHashSet<URI> uniqueImportUris = getImportedUris(resource);
		IResourceDescriptions descriptions = getResourceDescriptions(resource, uniqueImportUris);
		List<URI> urisAsList = Lists.newArrayList(uniqueImportUris);
		Collections.reverse(urisAsList);
		IScope scope = IScope.NULLSCOPE;
		for (URI uri : urisAsList) {
			if(!ignoreImportUri(uri)) {
				scope = createLazyResourceScope(scope, uri, descriptions, type, filter, ignoreCase);
			}
		}
		return scope;
	}

	private boolean ignoreImportUri(URI uri) {
		String extension = uri.fileExtension();
		return !LilyPondConstants.EXTENSIONS.contains(extension);
	}

	private static final String[] DEFAULT_INCLUDES = {
		"init.ly", //$NON-NLS-1$
		"declarations-init.ly" //$NON-NLS-1$
	};

	protected ResourceSet getResourceSetForImportUriCollection(){
		return new XtextResourceSet();
	}

	protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
		return getCache().get(ImportUriGlobalScopeProvider.class.getName(), resource, new Provider<LinkedHashSet<URI>>() {

			@Override
			public LinkedHashSet<URI> get() {
				Set<String> alreadyProcessedImportUriStrings=new HashSet<String>();
				Set<Resource> resources = getAllImportedResources(resource, alreadyProcessedImportUriStrings);
				LinkedHashSet<URI> result = getUris(resources);
				result.addAll(getDefaultIncludes());
				return result;
			}
		});
	}

	private LinkedHashSet<URI> getUris(Collection<Resource> resources){
		LinkedHashSet<URI> result = new LinkedHashSet<URI>();
		for (Resource resource : resources) {
			result.add(resource.getURI());
		}
		return result;
	}

	private static LinkedHashSet<URI> ALL_DEFAULT_INCLUDES=null;

	private LinkedHashSet<URI> getDefaultIncludes(){
		if(ALL_DEFAULT_INCLUDES==null){
			Set<String> alreadyProcessedImportUriStrings=new HashSet<String>();
			Set<Resource> resources=new LinkedHashSet<Resource>();
			ResourceSet rs=getResourceSetForImportUriCollection();
			for (String defaultInclude : DEFAULT_INCLUDES) {
				include(resources, defaultInclude, alreadyProcessedImportUriStrings, rs);
			}
			ALL_DEFAULT_INCLUDES=getUris(resources);
		}
		return ALL_DEFAULT_INCLUDES;
	}

	private void include(Set<Resource> resources, String importUri, Set<String> alreadyProcessedImportUriStrings, ResourceSet rs) {
		Include include = LilypondFactory.eINSTANCE.createInclude();
		include.setImportURI(importUri);
		String initImportUriString = getImportUriResolver().apply(include);
		if(!alreadyProcessedImportUriStrings.contains(initImportUriString)){
			URI initImportUri = URI.createURI(initImportUriString);
			Resource initResource;
			try {
				initResource = rs.getResource(initImportUri, true);
				resources.add(initResource);
				resources.addAll(getAllImportedResources(initResource, alreadyProcessedImportUriStrings));
			} catch (Exception e) {
				throw new RuntimeException(MessageFormat.format("Please make sure your LilyPond installation is valid and its location is specified correctly.", initImportUri.toFileString()), e);
			}
		}
	}

	/**
	 * Returns all resources which are (even indirectly) included in the given
	 * resource.
	 */
	protected Set<Resource> getAllImportedResources(Resource resource, Set<String> alreadyProcessedImportUriStrings) {
		Set<Resource> result = new HashSet<Resource>();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if(object instanceof Include){
				String importUriString = getImportUriResolver().apply(object);
				if (importUriString != null && !alreadyProcessedImportUriStrings.contains(importUriString)) {
					alreadyProcessedImportUriStrings.add(importUriString);
					Resource importedResource = EcoreUtil2.getResource(resource, importUriString);
					if (importedResource != null) {
						result.add(importedResource);
						if (resource != importedResource) {
							result.addAll(getAllImportedResources(importedResource, alreadyProcessedImportUriStrings));
						}
					}
				}
			}
		}
		return result;
	}

	public IResourceDescriptions getResourceDescriptions(Resource resource, Collection<URI> importUris) {
		IResourceDescriptions result = getResourceDescriptions(resource);
		LoadOnDemandResourceDescriptions demandResourceDescriptions = getLoadOnDemandDescriptions().get();
		demandResourceDescriptions.initialize(result, importUris, resource);
		return demandResourceDescriptions;
	}

	protected IResourceDescription getResourceDescriptionForUri(URI uri, IResourceDescriptions descriptions){
		return descriptions.getResourceDescription(uri);
	}

	protected IScope createLazyResourceScope(IScope parent, final URI uri, final IResourceDescriptions descriptions, EClass type, final Predicate<IEObjectDescription> filter, boolean ignoreCase) {
		try {
			IResourceDescription description=getResourceDescriptionForUri(uri, descriptions);
			return SelectableBasedScope.createScope(parent, description, filter, type, ignoreCase);
		}catch(IllegalStateException e) {
			return parent;
		}
	}
}
