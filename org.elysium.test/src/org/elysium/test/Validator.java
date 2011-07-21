package org.elysium.test;

import org.eclipse.xtext.junit.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit.validation.AssertableDiagnostics.DiagnosticPredicate;
import org.eclipse.xtext.junit.validation.ValidatorTester;
import org.eclipse.xtext.resource.XtextResource;
import org.elysium.validation.IssueCodes;
import org.elysium.validation.LilyPondJavaValidator;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;

public class Validator extends LilyPondTest {

	private ValidatorTester<LilyPondJavaValidator> tester;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		LilyPondJavaValidator validator = get(LilyPondJavaValidator.class);
		tester = new ValidatorTester<LilyPondJavaValidator>(validator, getInjector());
	}

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
		assertTrue(Iterables.all(diagnostics.getAllDiagnostics(), Predicates.not(predicate)));
	}

	public void testAdjacentNamesNotUnique() throws Exception {
		assertProblem("i = #1 i = #2", IssueCodes.DUPLICATE_VARIABLE, false);
	}

	public void testNotAdjacentNamesNotUnique() throws Exception {
		assertNoProblem("traLaLa = { c'4 d'4 } \\layout { traLaLa = 1.0 }", IssueCodes.DUPLICATE_VARIABLE, false);
	}

	public void testHiddenTokenAfterBackslash() throws Exception {
		assertProblem("\\ score {}", IssueCodes.HIDDEN_TOKEN_AFTER_BACKSLASH, true);
	}

	public void testNoVersion() throws Exception {
		assertProblem("{}", IssueCodes.NO_VERSION, false);
	}

}
