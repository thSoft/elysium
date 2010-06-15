package org.elysium.ui.mainfile;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.file.FileView;
import org.eclipse.ui.views.file.source.AbstractFileViewSource;

/**
 * A source for the main file (or a file derived from it).
 */
public abstract class MainFileViewSource extends AbstractFileViewSource implements MainFileListener {

	@Override
	public void init(FileView fileView, boolean startup) {
		super.init(fileView, startup);
		MainFile.addListener(this);
		handleMainFileChanged(null);
	}

	@Override
	public void handleMainFileChanged(IFile oldMainFile) {
		IFile mainFile = MainFile.get();
		if (mainFile != null) {
			getFileView().show(deriveFile(mainFile));
		} else {
			getFileView().hide();
		}
	}

	/**
	 * Override to return another file derived from the main file.
	 */
	protected IFile deriveFile(IFile mainFile) {
		return mainFile;
	}

	@Override
	public void done() {
		MainFile.removeListener(this);
		super.done();
	}

	@Override
	public String getName() {
		return "Main File";
	}

}
