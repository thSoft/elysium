package org.elysium.ui.outline;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.jface.action.Action;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.AbstractFilterOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.ui.Activator;
import org.elysium.ui.LilyPondUiModule;
import com.google.inject.BindingAnnotation;

public class FilterIncludesContribution extends AbstractFilterOutlineContribution {

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
	@BindingAnnotation
	public @interface Annotation {
	}

	public static final String PREFERENCE_KEY = "FILTER_INCLUDES"; //$NON-NLS-1$

	@Override
	protected boolean apply(IOutlineNode node) {
		return !(node instanceof EObjectNode) || !((EObjectNode)node).getEClass().equals(LilypondPackage.Literals.INCLUDE);
	}

	@Override
	public String getPreferenceKey() {
		return PREFERENCE_KEY;
	}

	@Override
	protected void configureAction(Action action) {
		action.setText("Show/hide \\include statements");
		action.setImageDescriptor(Activator.getImageDescriptor(LilyPondUiModule.ICONS + "filter/Include.png")); //$NON-NLS-1$
	}

}
