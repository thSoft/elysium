package org.elysium.ui.mainfile;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.elysium.ui.Activator;

/**
 * Decorates the main file.
 */
public class MainFileDecorator extends BaseLabelProvider implements ILightweightLabelDecorator, MainFileListener {

	private static final ImageDescriptor ICON = Activator.getImageDescriptor("icons/mainfile/Decoration.png"); //$NON-NLS-1$

	public MainFileDecorator() {
		super();
		MainFile.addListener(this);
	}

	@Override
	public void decorate(Object element, IDecoration decoration) {
		if ((element instanceof IFile) && (element.equals(MainFile.get()))) {
			decoration.addOverlay(ICON, IDecoration.TOP_LEFT);
		}
	}

	@Override
	public void handleMainFileChanged(IFile oldMainFile) {
		List<Object> elements = new ArrayList<Object>();
		if (oldMainFile != null) {
			elements.add(oldMainFile);
		}
		IFile mainFile = MainFile.get();
		if (mainFile != null) {
			elements.add(mainFile);
		}
		fireLabelProviderChanged(new LabelProviderChangedEvent(this, elements.toArray()));
	}

}
