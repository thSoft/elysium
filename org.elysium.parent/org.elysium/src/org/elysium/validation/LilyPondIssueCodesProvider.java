package org.elysium.validation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.IssueSeveritiesProvider;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;

public class LilyPondIssueCodesProvider extends IssueSeveritiesProvider {

	/*
	 * Purpose of the cache is to reduce the number of calls to the preference
	 * store. As each resource will have its own IssueSeveritiesProvider, we
	 * could probably also work with a field initialized once.
	 * 
	 * maximumSize 4 is more or less arbitrary (size will be 0 or 1) without
	 * negative side effects
	 * 
	 * caching time 3 seconds after access ensures the desired cache hits when
	 * validating a resource but also using the latest preference values even if
	 * a file is open and the user did not choose the "clean build" option after
	 * changing the values (time(change preference) > 3s, time(validate) < 3s)
	 */
	private LoadingCache<Resource, List<String>> cache = CacheBuilder
			.newBuilder().expireAfterAccess(3, TimeUnit.SECONDS).maximumSize(4)
			.build(new CacheLoader<Resource, List<String>>() {
				@Override
				public List<String> load(Resource key) throws Exception {
					@SuppressWarnings("restriction")
					String value=getValuesProvider().getPreferenceValues(key).getPreference(IssueCodes.UNKNOWN_VARIABLE_IGNORES_KEY);
					return ImmutableList.copyOf(value.split("\n"));
				}
			});

	public boolean ignoreUnknownVariable(EObject context, String variable) {
		return cache.getUnchecked(context.eResource()).contains(variable);
	}
}
