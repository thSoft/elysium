package org.elysium.ui.mainfile;

import java.text.MessageFormat;
import org.eclipse.core.resources.IFile;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.elysium.ui.Activator;

/**
 * A contribution to the status bar displaying the main file.
 */
public class MainFileControlContribution extends WorkbenchWindowControlContribution implements MainFileListener {

	private static final Image ICON_SET = Activator.getImageDescriptor("icons/mainfile/MainFile.png").createImage(); //$NON-NLS-1$

	private static final Image ICON_UNSET = Activator.getImageDescriptor("icons/mainfile/Unset.png").createImage(); //$NON-NLS-1$

	private CLabel label;

	@Override
	protected Control createControl(Composite parent) {
		label = new CLabel(parent, SWT.NONE);
		handleMainFileChanged(null);
		MainFile.addListener(this);
		return label;
	}

	@Override
	public void handleMainFileChanged(IFile oldMainFile) {
		IFile mainFile = MainFile.get();
		final Image image;
		final String path;
		if (mainFile == null) {
			image = ICON_UNSET;
			path = "(none)";
		} else {
			image = ICON_SET;
			path = mainFile.getFullPath().toString();
		}
		label.setImage(image);
		label.setText(MessageFormat.format("Main File: {0}", path));
		// TODO resize to fit
	}

}
