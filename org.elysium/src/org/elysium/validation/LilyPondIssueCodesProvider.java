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

public class LilyPondIssueCodesProvider extends IssueSeveritiesProvider{

	private LoadingCache<Resource, List<String>> cache = CacheBuilder.newBuilder().expireAfterAccess(3, TimeUnit.SECONDS)
			.maximumSize(4).build(new CacheLoader<Resource, List<String>>(){
				@Override
				public List<String> load(Resource key) throws Exception {
					@SuppressWarnings("restriction")
					String value=getValuesProvider().getPreferenceValues(key).getPreference(IssueCodes.UNKNOWN_VARIABLE_IGNORES_KEY);
					return ImmutableList.copyOf(value.split("\n"));
				}
			});

	public boolean ignoreUnknownVariable(EObject context, String variable){
		return cache.getUnchecked(context.eResource()).contains(variable);
	}
}
