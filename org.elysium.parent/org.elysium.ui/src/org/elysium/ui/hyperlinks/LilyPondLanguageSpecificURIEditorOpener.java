package org.elysium.ui.hyperlinks;

import java.io.File;
import java.text.MessageFormat;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IStorage;
import org.eclipse.debug.core.sourcelookup.containers.LocalFileStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class LilyPondLanguageSpecificURIEditorOpener extends LanguageSpecificURIEditorOpener {

	private static final Logger logger = Logger.getLogger(LilyPondLanguageSpecificURIEditorOpener.class);

	@Inject(optional = true)
	private IWorkbench workbench;

	@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String editorID;

	@Override
	public IEditorPart open(URI uri, EReference crossReference, int indexInList, boolean select) {
		IEditorPart result = super.open(uri, crossReference, indexInList, select);
		if (result == null && uri.isFile()) {
			final String errorMessage = "Error while opening editor part for EMF URI ''{0}''";
			try {
				IStorage storage = new LocalFileStorage(new File(uri.toFileString()));
				IEditorInput editorInput = new XtextReadonlyEditorInput(storage);
				IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
				IEditorPart editor = IDE.openEditor(activePage, editorInput, editorID);
				selectAndReveal(editor, uri, crossReference, indexInList, select);
				result = EditorUtils.getXtextEditor(editor);
			} catch (WrappedException e) {
				logger.error(MessageFormat.format(errorMessage, uri), e.getCause());
			} catch (PartInitException partInitException) {
				logger.error(MessageFormat.format(errorMessage, uri), partInitException);
			}
		}
		return result;
	}

}
