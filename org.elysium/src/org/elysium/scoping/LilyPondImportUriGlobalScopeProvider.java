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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.util.IResourceScopeCache;
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
			scope = createLazyResourceScope(scope, uri, descriptions, type, filter, ignoreCase);
		}
		return scope;
	}

	protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
		return getCache().get(ImportUriGlobalScopeProvider.class.getName(), resource, new Provider<LinkedHashSet<URI>>() {

			@Override
			public LinkedHashSet<URI> get() {
				Set<Resource> resources = getAllImportedResources(resource);
				include(resources, "init.ly"); //$NON-NLS-1$
				include(resources, "declarations-init.ly"); //$NON-NLS-1$
				LinkedHashSet<URI> result = new LinkedHashSet<URI>();
				for (Resource resource : resources) {
					result.add(resource.getURI());
				}
				return result;
			}

			private void include(Set<Resource> resources, String importUri) {
				Include include = LilypondFactory.eINSTANCE.createInclude();
				include.setImportURI(importUri);
				String initImportUriString = getImportUriResolver().apply(include);
				URI initImportUri = URI.createURI(initImportUriString);
				Resource initResource;
				try {
					initResource = new ResourceSetImpl().getResource(initImportUri, true);
					resources.add(initResource);
					resources.addAll(getAllImportedResources(initResource));
				} catch (Exception e) {
					throw new RuntimeException(MessageFormat.format("Please make sure your LilyPond installation is valid and its location is specified correctly.", initImportUri.toFileString()), e);
				}
			}

		});
	}

	/**
	 * Returns all resources which are (even indirectly) included in the given
	 * resource.
	 */
	protected Set<Resource> getAllImportedResources(Resource resource) {
		Set<Resource> result = new HashSet<Resource>();
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			String importUriString = getImportUriResolver().apply(object);
			if (importUriString != null) {
				Resource importedResource = EcoreUtil2.getResource(resource, importUriString);
				if (importedResource != null) {
					result.add(importedResource);
					if (resource != importedResource) {
						result.addAll(getAllImportedResources(importedResource));
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

	protected IScope createLazyResourceScope(IScope parent, final URI uri, final IResourceDescriptions descriptions, EClass type, final Predicate<IEObjectDescription> filter, boolean ignoreCase) {
		IResourceDescription description = descriptions.getResourceDescription(uri);
		return SelectableBasedScope.createScope(parent, description, filter, type, ignoreCase);
	}

}
