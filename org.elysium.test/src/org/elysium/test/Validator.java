package org.elysium.test;

import static com.google.common.base.Predicates.not;
import static com.google.common.collect.Iterables.all;
import org.eclipse.xtext.junit.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit.validation.AssertableDiagnostics.DiagnosticPredicate;
import org.eclipse.xtext.resource.XtextResource;
import org.elysium.validation.IssueCodes;
import org.junit.Test;

public class Validator extends LilyPondTestWithValidator {

	private AssertableDiagnostics validate(String model) throws Exception {
		XtextResource resource = getResourceFromString(model);
		return tester.validate(resource.getContents().get(0));
	}

	private DiagnosticPredicate getPredicate(String issueCode, boolean error) {
		return error ? AssertableDiagnostics.errorCode(issueCode) : AssertableDiagnostics.warningCode(issueCode);
	}

	private void assertProblem(String model, String issueCode, boolean error) throws Exception {
		AssertableDiagnostics diagnostics = validate(model);
		DiagnosticPredicate predicate = getPredicate(issueCode, error);
		diagnostics.assertAny(predicate);
	}

	private void assertNoProblem(String model, String issueCode, boolean error) throws Exception {
		AssertableDiagnostics diagnostics = validate(model);
		DiagnosticPredicate predicate = getPredicate(issueCode, error);
		assertTrue(all(diagnostics.getAllDiagnostics(), not(predicate)));
	}

	@Test
	public void adjacentNamesNotUnique() throws Exception {
		assertProblem("i = #1 i = #2", IssueCodes.DUPLICATE_VARIABLE, false);
	}

	@Test
	public void notAdjacentNamesNotUnique() throws Exception {
		assertNoProblem("traLaLa = { c'4 d'4 } \\layout { traLaLa = 1.0 }", IssueCodes.DUPLICATE_VARIABLE, false);
	}

	@Test
	public void hiddenTokenAfterBackslash() throws Exception {
		assertProblem("\\ score {}", IssueCodes.HIDDEN_TOKEN_AFTER_BACKSLASH, true);
	}

	@Test
	public void noVersion() throws Exception {
		assertProblem("{}", IssueCodes.NO_VERSION, false);
	}

}
