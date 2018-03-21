package org.elysium.ui;

import java.io.File;
import java.net.URI;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.containers.LocalFileStorage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IStorageEditorInput;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextReadonlyEditorInput;

import com.google.common.collect.ObjectArrays;

public class LilyPondXtextEditor extends XtextEditor{

	@Override
	protected String[] collectContextMenuPreferencePages() {
		return getPreferencePages(super.collectContextMenuPreferencePages());
	}

	@Override
	protected String[] collectRulerMenuPreferencePages() {
		return getPreferencePages(super.collectRulerMenuPreferencePages());
	}

	@Override
	protected String[] collectOverviewRulerMenuPreferencePages() {
		return getPreferencePages(super.collectOverviewRulerMenuPreferencePages());
	}

	private String[] getPreferencePages(String[] superPages){
		String prefix="org.elysium.ui.preferencePages.";
		String[] xturtlePages = new String[] {
				prefix + "LilyPond",
				prefix + "Compiler",
				prefix + "SyntaxUpdater",
				prefix + "Validation",
				prefix + "Editor",
				prefix + "NewProjectWizard",
				prefix + "SyntaxColoring",
				prefix + "Templates",
				"org.elysium.LilyPond.refactoring"
				};
		return ObjectArrays.concat(superPages, xturtlePages, String.class);
	}

	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		IEditorInput inputToSet=input;
		if(inputToSet instanceof FileStoreEditorInput) {
			//ensure that files outside the workspace cannot be modified
			URI uri = ((FileStoreEditorInput) input).getURI();
			inputToSet=new XtextReadonlyEditorInput(new LocalFileStorage(new File(uri)));
		}
		super.doSetInput(inputToSet);
	}

	@Override
	public String getTitleToolTip() {
		String location="";
		IResource resource = getResource();
		if(resource != null) {
			location= resource.getRawLocation().toString();
		} else {
			try {
				location= ((IStorageEditorInput) getEditorInput()).getStorage().getFullPath().toString();
			} catch (Exception e) {
				//ignore
			}
		}
		return (super.getTitleToolTip()+"\n"+location).trim();
	}
}