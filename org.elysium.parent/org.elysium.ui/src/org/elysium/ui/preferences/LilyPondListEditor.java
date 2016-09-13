/*******************************************************************************
 * Copyright (c) 2015 AKSW Xturtle Project, itemis AG (http://www.itemis.eu).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
//code adapted from de.itemis.tooling.xturtle.ui.preferences.TurtleListEditor of the AKSX-Xturtle project
package org.elysium.ui.preferences;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.swt.widgets.Composite;

import com.google.common.base.Joiner;

//TODO change in the list does not yet cause rebuildNeeded to be true
class LilyPondListEditor extends ListEditor {

	private String separator="\n";
	private String dialogLabel;
	private String dialogDescription;

	public LilyPondListEditor() {
		super();
	}

	public LilyPondListEditor(String descriptionPreferenceKey, String string, Composite fieldEditorParent) {
		super(descriptionPreferenceKey, string, fieldEditorParent);
	}

	public void setNewInputData(String label, String description){
		this.dialogLabel=label;
		this.dialogDescription=description;
	}

	@Override
	protected String createList(String[] items) {
		return Joiner.on(separator).join(items);
	}

	@Override
	protected String getNewInputObject() {
		final AtomicBoolean closedWithEscapeKey=new AtomicBoolean(false);
		final InputDialog input=new InputDialog(getShell(), dialogLabel, dialogDescription, "", null){
			@Override
			protected boolean canHandleShellCloseEvent() {
				closedWithEscapeKey.set(true);
				return super.canHandleShellCloseEvent();
			}
		};
		input.open();
		return closedWithEscapeKey.get()?null:input.getValue();
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		super.doFillIntoGrid(parent, numColumns);
		hideUpDownButtons();
	}
	@Override
	protected void createControl(Composite parent) {
		super.createControl(parent);
		hideUpDownButtons();
	}

	private void hideUpDownButtons(){
		getUpButton().setVisible(false);
		getDownButton().setVisible(false);
	}

	@Override
	protected String[] parseString(String stringList) {
		String[] list = stringList.split(separator);
		Arrays.sort(list);
		return list;
	}

	@Override
	public void store() {
		super.store();
	}
}