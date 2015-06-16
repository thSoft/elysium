package org.elysium.test.regression;

import static javax.util.file.FileUtils.readFileAsString;
import static org.eclipse.emf.common.util.URI.createURI;

import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.Expression;
import org.elysium.lilypond.LilyPond;
import org.elysium.test.LilyPondTestWithValidator;
import org.junit.Assert;
import org.junit.Test;

public class TrillTest extends LilyPondTestWithValidator {

	@Test
	//regression test for #58
	public void parseScriptInitAndRecognizeTrill() throws Exception {
		String model = readFileAsString("regression/2.18.2/script-init.ly");
		XtextResource resource = doGetResource(getAsStream(model), createURI("test"));
		LilyPond lilyPondModel=(LilyPond)resource.getContents().get(0);

		List<Assignment> allAssignments = EcoreUtil2.getAllContentsOfType(lilyPondModel, Assignment.class);
		for (Assignment assignment : allAssignments) {
			if(assignment.getName().equals("trill")){
				return;
			}
		}

		//for debugging in case of failure
		for (Expression expression : lilyPondModel.getExpressions()) {
			System.out.println(NodeModelUtils.findActualNodeFor(expression).getText());
			System.out.println(expression);
			System.out.println("**************************************\n");
		}
		Assert.fail("no assignemt trill found in script-init.ly");
	}

}
