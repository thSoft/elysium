package org.elysium.resource;

import static com.google.common.collect.Iterables.transform;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class LilyPondResourceDescription extends DefaultResourceDescription {

	public LilyPondResourceDescription(Resource resource, IQualifiedNameProvider nameProvider) {
		super(resource, nameProvider);
	}

	@Override
	protected List<IEObjectDescription> computeExportedObjects() {
		if (!getResource().isLoaded()) {
			try {
				getResource().load(null);
			} catch (IOException e) {
				return Collections.<IEObjectDescription>emptyList();
			}
		}
		Iterable<EObject> contents = new Iterable<EObject>() {

			@Override
			public Iterator<EObject> iterator() {
				return EcoreUtil.getAllProperContents(getResource(), true);
			}

		};
		Iterable<IEObjectDescription> result = transform(contents, new Function<EObject, IEObjectDescription>() {

			@Override
			public IEObjectDescription apply(EObject from) {
				return createIEObjectDescription(from);
			}

		});
		Iterable<IEObjectDescription> filter = Iterables.filter(result, Predicates.notNull());
		return Lists.newArrayList(filter);
	}

	@Override
	protected IEObjectDescription createIEObjectDescription(EObject from) {
		if (getNameProvider() == null) {
			return null;
		}
		String qualifiedName = getNameProvider().getQualifiedName(from);
		if (qualifiedName == null) {
			qualifiedName = "";
		}
		Map<String, String> userData = Maps.newHashMap();
		for (EAttribute attribute : from.eClass().getEAllAttributes()) {
			Object value = from.eGet(attribute);
			userData.put(attribute.getName(), value == null ? "" : value.toString());
		}
		return EObjectDescription.create(qualifiedName, from, userData);
	}

}
