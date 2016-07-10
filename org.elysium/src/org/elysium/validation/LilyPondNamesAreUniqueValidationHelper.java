package org.elysium.validation;

import java.util.Iterator;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.validation.INamesAreUniqueValidationHelper;
import org.eclipse.xtext.validation.IssueSeveritiesProvider;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.collect.Maps;

public class LilyPondNamesAreUniqueValidationHelper implements INamesAreUniqueValidationHelper {

	@Inject
	private IssueSeveritiesProvider levels;

	@Override
	public void checkUniqueNames(Iterable<IEObjectDescription> descriptions, ValidationMessageAcceptor acceptor) {
		checkUniqueNames(descriptions, null, acceptor);
	}

	/**
	 * <p>
	 * {@inheritDoc}
	 * </p>
	 * The cancel indicator will be queried everytime a description has been
	 * processed. It should provide a fast answer about its canceled state.
	 */
	@Override
	public void checkUniqueNames(Iterable<IEObjectDescription> descriptions, CancelIndicator cancelIndicator, ValidationMessageAcceptor acceptor) {
		Iterator<IEObjectDescription> iter = descriptions.iterator();
		if (!iter.hasNext()) {
			return;
		}
		Map<String, Map<QualifiedName, IEObjectDescription>> clusterToNames = Maps.newHashMap();
		while (iter.hasNext()) {
			IEObjectDescription description = iter.next();
			checkDescriptionForDuplicatedName(description, clusterToNames, acceptor);
			if ((cancelIndicator != null) && cancelIndicator.isCanceled()) {
				return;
			}
		}
	}

	protected void checkDescriptionForDuplicatedName(IEObjectDescription description, Map<String, Map<QualifiedName, IEObjectDescription>> clusterIdToName, ValidationMessageAcceptor acceptor) {
		EObject object = description.getEObjectOrProxy();
		QualifiedName qualifiedName = description.getName();
		String clusterType = getAssociatedClusterId(object);
		Map<QualifiedName, IEObjectDescription> nameToDescription = clusterIdToName.get(clusterType);
		if (nameToDescription == null) {
			nameToDescription = Maps.newHashMap();
			nameToDescription.put(qualifiedName, description);
			clusterIdToName.put(clusterType, nameToDescription);
		} else {
			if (nameToDescription.containsKey(qualifiedName)) {
				IEObjectDescription prevDescription = nameToDescription.get(qualifiedName);
				if (prevDescription != null) {
					createDuplicateNameError(prevDescription, acceptor);
					nameToDescription.put(qualifiedName, null);
				}
				createDuplicateNameError(description, acceptor);
			} else {
				nameToDescription.put(qualifiedName, description);
			}
		}
	}

	protected void createDuplicateNameError(IEObjectDescription description, ValidationMessageAcceptor acceptor) {
		EObject object = description.getEObjectOrProxy();
		EStructuralFeature feature = getNameFeature(object);
		String errorCode=getErrorCode();
		Severity severity=levels.getIssueSeverities(object.eResource()).getSeverity(errorCode);

		String errorMessage=getDuplicateNameErrorMessage(description, feature);
		switch (severity) {
		case ERROR:
			acceptor.acceptError(errorMessage, object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, errorCode);
			break;
		case WARNING:
			acceptor.acceptWarning(errorMessage, object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, errorCode);
			break;
		case INFO:
			acceptor.acceptInfo(errorMessage, object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, errorCode);
			break;
		default:
			break;
		}

	}

	/**
	 * Returns <code>null</code>. Clients may override if they desire to attach an
	 * error code to the created errors.
	 */
	protected String getErrorCode() {
		return IssueCodes.DUPLICATE_VARIABLE;
	}

	/**
	 * Build the error message for duplicated names. The default implementation
	 * will provider error messages of this form:
	 * <ul>
	 * <li>Duplicate Entity 'Sample'</li>
	 * <li>Duplicate Property 'Sample' in Entity 'EntityName'</li>
	 * </ul>
	 * If the container information will be helpful to locate the error or to
	 * understand the error it will be used, otherwise only the simple format will
	 * be build. Clients may override different methods that influence the error
	 * message.
	 * 
	 * @see #getNameFeature(EObject)
	 * @see #getTypeLabel(EClass)
	 * @see #getContainerForErrorMessage(EObject)
	 * @see #isContainerInformationHelpful(IEObjectDescription, String)
	 * @see #isContainerInformationHelpful(IEObjectDescription, EObject, String,
	 * EStructuralFeature)
	 */
	public String getDuplicateNameErrorMessage(IEObjectDescription description, EStructuralFeature feature) {
		EObject object = description.getEObjectOrProxy();
		String shortName = String.valueOf(feature != null ? object.eGet(feature) : "<unnamed>");
		StringBuilder result = new StringBuilder(64);
		result.append("Duplicate ");
		result.append("variable");
		result.append(" '");
		result.append(shortName);
		result.append("'");
		if (isContainerInformationHelpful(description, shortName)) {
			EObject container = getContainerForErrorMessage(object);
			if (container != null) {
				String containerTypeLabel = getTypeLabel(container.eClass());
				EStructuralFeature containerNameFeature = getNameFeature(container);
				if (isContainerInformationHelpful(description, container, containerTypeLabel, containerNameFeature)) {
					result.append(" in ");
					result.append(containerTypeLabel);
					if (containerNameFeature != null) {
						String containerName = String.valueOf(container.eGet(containerNameFeature));
						if (containerName != null) {
							result.append(" '");
							result.append(containerName);
							result.append("'");
						}
					}
				}
			}
		}
		return result.toString();
	}

	protected boolean isContainerInformationHelpful(IEObjectDescription description, EObject container, String containerTypeLabel, EStructuralFeature containerNameFeature) {
		return (containerTypeLabel != null) && (containerNameFeature != null);
	}

	protected boolean isContainerInformationHelpful(IEObjectDescription description, String shortName) {
		return true;
	}

	protected EObject getContainerForErrorMessage(EObject object) {
		return object.eContainer();
	}

	protected String getTypeLabel(EClass eClass) {
		String name = eClass.getName();
		return name;
	}

	protected EStructuralFeature getNameFeature(EObject object) {
		return SimpleAttributeResolver.NAME_RESOLVER.getAttribute(object);
	}

	protected String getAssociatedClusterId(EObject object) {
		String uri = EcoreUtil.getURI(object).fragment();
		int lastSegmentPosition = uri.lastIndexOf("/");
		return uri.substring(0, lastSegmentPosition == -1 ? uri.length() : lastSegmentPosition);
	}

}
