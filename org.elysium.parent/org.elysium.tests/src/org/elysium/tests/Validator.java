package org.elysium.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.validation.Issue;
import org.elysium.lilypond.LilyPond;
import org.elysium.validation.IssueCodes;
import org.junit.Test;

public class Validator extends LilyPondTest {

	private List<Issue> validate(String model) throws Exception {
		LilyPond lilyPond = parseHelper.parse(model);
		return validationTestHelper.validate(lilyPond);
	}

	private void assertProblem(String model, String issueCode, boolean error) throws Exception {
		assertTrue(hasProblem(model, issueCode, error));
	}

	private boolean hasProblem(String model, String issueCode, boolean error) throws Exception {
		List<Issue> diagnostics = validate(model);
		Severity severity = error ? Severity.ERROR : Severity.WARNING;
		return diagnostics.stream().anyMatch(issue -> issue.getCode().equals(issueCode) && issue.getSeverity() == severity);
	}

	private void assertNoProblem(String model, String issueCode, boolean error) throws Exception {
		assertFalse(hasProblem(model, issueCode, error));
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
		assertProblem("{}", IssueCodes.NO_VERSION_STANDALONE, false);
	}

	@Test
	public void relativeIncludeOK() throws Exception {
		assertTrue(validate("\\version \"2.18.0\" #(ly:set-option 'relative-includes #t)").isEmpty());
	}

	@Test
	public void relativeIncludeWarning() throws Exception {
		List<Issue> issues = validate("\\version \"2.18.0\" #(ly:set-option 'relative-includes #f)");
		assertTrue(issues.stream().anyMatch(issue -> issue.getMessage().contains("relative include")));
	}

}
