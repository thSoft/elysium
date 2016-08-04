package org.elysium.ui.compiler.outdated;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;
import org.elysium.ui.Activator;
import org.elysium.ui.markers.MarkerTypes;

/**
 * Decorates outdated files.
 */
public class OutdatedDecorator extends BaseLabelProvider implements ILightweightLabelDecorator {

	private static final ImageDescriptor ICON = Activator.getImageDescriptor("icons/outdated/Decoration.png"); //$NON-NLS-1$

	private static final String ID = Activator.getId() + ".decorators.Outdated"; //$NON-NLS-1$

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if (element instanceof IResource) {
			IResource resource = (IResource)element;
			try {
				if (resource.exists()){
					if(resource.getType()==IResource.PROJECT && !resource.getProject().isOpen()){
						//do nothing, closed project need not be decorated
					}else if((resource.findMarkers(MarkerTypes.OUTDATED, true, IResource.DEPTH_ZERO).length > 0)) {
						decoration.addOverlay(ICON, IDecoration.TOP_RIGHT);
					}
				} 
			} catch (CoreException e) {
				Activator.logError("Couldn't query outdated marker", e);
			}
		}
	}

	public static OutdatedDecorator getInstance() {
		IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getDecoratorManager();
		if (decoratorManager.getEnabled(ID)) {
			IBaseLabelProvider decorator = decoratorManager.getBaseLabelProvider(ID);
			if (decorator instanceof OutdatedDecorator) {
				OutdatedDecorator outdatedDecorator = (OutdatedDecorator)decorator;
				return outdatedDecorator;
			}
		}
		return null;
	}

	public void refresh(IResource resource) {
		fireLabelProviderChanged(new LabelProviderChangedEvent(this, resource));
	}

}
