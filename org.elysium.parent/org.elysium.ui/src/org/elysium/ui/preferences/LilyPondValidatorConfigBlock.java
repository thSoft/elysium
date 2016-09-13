/*******************************************************************************
 * Copyright (c) 2015 AKSW Xturtle Project, itemis AG (http://www.itemis.eu).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
//code adapted from de.itemis.tooling.xturtle.ui.preferences.TurtleValidatorConfigBlock of the AKSX-Xturtle project
package org.elysium.ui.preferences;

import java.util.Arrays;

import javax.inject.Inject;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.preferences.OptionsConfigurationBlock;
import org.eclipse.xtext.ui.validation.AbstractValidatorConfigurationBlock;
import org.elysium.validation.IssueCodes;

@SuppressWarnings("restriction")
public class LilyPondValidatorConfigBlock extends AbstractValidatorConfigurationBlock {

	private static final String[] otherErrors=new String[]{"ignore","info","warning","error"};
	private static final String[] otherErrorLabels=new String[]{"Ignore","Info","Warning","Error"};

	LilyPondListEditor noLinkingErrorAssignments;
	private IPreferenceStore preferenceStore;

	@Inject
	IPreferenceStoreAccess storeAccess;

	@Override
	protected void fillSettingsPage(Composite composite, int nColumns, int defaultIndent) {

		Composite generalProblems = createSection("General", composite, nColumns);
		addComboBox(generalProblems, "no version (.ly)", IssueCodes.NO_VERSION_STANDALONE, defaultIndent, otherErrors, otherErrorLabels);
		addComboBox(generalProblems, "no version (.ily...)", IssueCodes.NO_VERSION_ILY, defaultIndent, otherErrors, otherErrorLabels);
		addComboBox(generalProblems, "duplicate variable", IssueCodes.DUPLICATE_VARIABLE, defaultIndent, otherErrors, otherErrorLabels);
		addComboBox(generalProblems, "include using variable", IssueCodes.VARIABLE_INCLUDE, defaultIndent, otherErrors, otherErrorLabels);

		Composite linkingProblems = createSection("Linking", composite, nColumns);
		addComboBox(linkingProblems, "unresolvable include (.ly)", IssueCodes.UNRESOLVABLE_INCLUDE_STANDALONE, defaultIndent, otherErrors, otherErrorLabels);
		addComboBox(linkingProblems, "unresolvable include (.ily)", IssueCodes.UNRESOLVABLE_INCLUDE_ILY, defaultIndent, otherErrors, otherErrorLabels);
		addComboBox(linkingProblems, "unknown variable (.ly)", IssueCodes.UNKNOWN_VARIABLE_STANDALONE, defaultIndent, otherErrors, otherErrorLabels);
		addComboBox(linkingProblems, "unknown variable (.ily...)", IssueCodes.UNKNOWN_VARIABLE_ILY, defaultIndent, otherErrors, otherErrorLabels);
		noLinkingErrorAssignments=new LilyPondListEditor();
		noLinkingErrorAssignments.setPreferenceStore(preferenceStore);
		noLinkingErrorAssignments.setPreferenceName(IssueCodes.UNKNOWN_VARIABLE_IGNORES);
		noLinkingErrorAssignments.setLabelText("no linking validation for assignments");
		noLinkingErrorAssignments.setNewInputData("assignment", "Enter the name");
		noLinkingErrorAssignments.fillIntoGrid(linkingProblems, nColumns);
		noLinkingErrorAssignments.load();

	}

	@Override
	protected Job getBuildJob(IProject project) {
		Job buildJob = new OptionsConfigurationBlock.BuildJob("LilyPond validation", project);
		buildJob.setRule(ResourcesPlugin.getWorkspace().getRuleFactory().buildRule());
		buildJob.setUser(true);
		return buildJob;
	}

	@Override
	protected String[] getFullBuildDialogStrings(boolean workspaceSettings) {
		return new String[] { "Settings changed", "Due to changes in the settings, a full build is required. Build now?" };
	}

	@Override
	protected void validateSettings(String changedKey, String oldValue, String newValue) {}

	//The following overrides were necessary, because the super class has no simple way to add controls other than combobox etc
	//the listFieldEditor has to be taken into account as well
	@Override
	public void setPreferenceStore(IPreferenceStore preferenceStore) {
		super.setPreferenceStore(preferenceStore);
		this.preferenceStore=preferenceStore;
	}

	@Override
	public void performDefaults() {
		super.performDefaults();
		noLinkingErrorAssignments.loadDefault();
	}

	@Override
	protected void savePreferences() {
		noLinkingErrorAssignments.store();
		super.savePreferences();
	}

	@Override
	protected void collectRegistredKeys() {
		super.collectRegistredKeys();
		this.keys=Arrays.copyOf(this.keys, this.keys.length+1);
		this.keys[this.keys.length-1]=IssueCodes.UNKNOWN_VARIABLE_IGNORES;
	}
}
