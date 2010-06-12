package org.elysium.ui.mainfile;

import org.eclipse.core.resources.IFile;
import org.eclipse.ui.views.file.AbstractFileViewSource;
import org.eclipse.ui.views.file.FileView;

/**
 * A source for the main file (or a file derived from it).
 */
public class MainFileViewSource extends AbstractFileViewSource implements MainFileListener {

	@Override
	public void init(FileView fileView) {
		super.init(fileView);
		MainFile.addListener(this);
		handleMainFileChanged(null);
	}

	@Override
	public void handleMainFileChanged(IFile oldMainFile) {
		IFile mainFile = MainFile.get();
		getFileView().show(getFile(mainFile));
	}

	protected IFile getFile(IFile mainFile) {
		return mainFile;
	}

	@Override
	public void done() {
		MainFile.removeListener(this);
		super.done();
	}

	@Override
	public String getName() {
		return "Main file";
	}

}
