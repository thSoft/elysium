package org.elysium.scoping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;
import org.eclipse.xtext.scoping.impl.LoadOnDemandResourceDescriptions;
import org.eclipse.xtext.scoping.impl.ResourceDescriptionBasedScope;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.elysium.lilyPond.Include;
import org.elysium.lilyPond.LilyPondFactory;
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
	public IScope getScope(EObject context, EReference reference) {
		final LinkedHashSet<URI> uniqueImportURIs = getImportedUris(context);
		IResourceDescriptions descriptions = getResourceDescriptions(context, uniqueImportURIs);
		ArrayList<URI> newArrayList = Lists.newArrayList(uniqueImportURIs);
		Collections.reverse(newArrayList);
		IScope scope = IScope.NULLSCOPE;
		for (URI u : newArrayList) {
			scope = createLazyResourceScope(scope, u, descriptions, reference);
		}
		return scope;
	}

	protected LinkedHashSet<URI> getImportedUris(final EObject context) {
		return getCache().get(ImportUriGlobalScopeProvider.class.getName(), context.eResource(), new Provider<LinkedHashSet<URI>>() {

			@Override
			public LinkedHashSet<URI> get() {
				Set<Resource> resources = getAllImportedResources(context.eResource());

				Include include = LilyPondFactory.eINSTANCE.createInclude();
				include.setImportURI("init.ly"); //$NON-NLS-1$
				String initImportUriString = getImportUriResolver().resolve(include);
				URI initImportUri = URI.createURI(initImportUriString);
				Resource initResource = new ResourceSetImpl().getResource(initImportUri, true);
				resources.addAll(getAllImportedResources(initResource));

				LinkedHashSet<URI> result = new LinkedHashSet<URI>();
				for (Resource resource : resources) {
					result.add(resource.getURI());
				}
				return result;
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
					result.addAll(getAllImportedResources(importedResource));
				}
			}
		}
		return result;
	}

	public IResourceDescriptions getResourceDescriptions(EObject ctx, Collection<URI> importUris) {
		IResourceDescriptions result = getResourceDescriptions(ctx);
		LoadOnDemandResourceDescriptions demandResourceDescriptions = getLoadOnDemandDescriptions().get();
		demandResourceDescriptions.initialize(result, importUris, ctx.eResource());
		return demandResourceDescriptions;
	}

	protected IScope createLazyResourceScope(IScope parent, final URI uri, final IResourceDescriptions descriptions, final EReference reference) {
		IResourceDescription description = descriptions.getResourceDescription(uri);
		if (description == null) {
			return parent;
		}
		return new ResourceDescriptionBasedScope(parent, description, reference.getEReferenceType());
	}

}
