package org.elysium.test.integration;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import java.io.File;
import java.text.MessageFormat;
import java.util.Collection;
import javax.util.file.FileUtils;
import javax.util.file.FilenameExtensionFilter;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.junit.validation.AssertableDiagnostics;
import org.eclipse.xtext.resource.XtextResource;
import org.elysium.LilyPondConstants;
import org.elysium.test.LilyPondTestWithValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

@RunWith(value = Parameterized.class)
public class Integration extends LilyPondTestWithValidator {

	private Iterable<Object> getErrors(String filePath) throws Exception {
		String model = FileUtils.readFileAsString(filePath);
		XtextResource resource = doGetResource(getAsStream(model), URI.createURI("test"));
		EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> parseErrors = resource.getErrors();
		AssertableDiagnostics validationDiagnostics = tester.validate(resource.getContents().get(0));
		Iterable<Diagnostic> validationErrors = filter(validationDiagnostics.getAllDiagnostics(), new Predicate<Diagnostic>() {

			@Override
			public boolean apply(Diagnostic input) {
				return input.getSeverity() == Diagnostic.ERROR;
			}

		});
		return concat(parseErrors, validationErrors);
	}

	private final String filePath;

	public Integration(String filePath) {
		this.filePath = filePath;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Collection<Object[]> result = Lists.newArrayList();
		for (File directory : new File[] { new File("init"), new File("snippets") }) {
			for (File file : directory.listFiles(new FilenameExtensionFilter(LilyPondConstants.EXTENSION))) {
				result.add(new Object[] { file.getAbsolutePath() });
			}
		}
		return result;
	}

	private static int getColumn(String[] lines, int line, int offset) {
		int lineOffset = 0;
		for (int i = 0; i < Math.min(lines.length, line); i++) {
			lineOffset += lines[i].length() + 1;
		}
		return offset - lineOffset;
	}

	@Test
	public void parse() throws Exception {
		Iterable<Object> errors = getErrors(filePath);
		boolean hasErrors = errors.iterator().hasNext();
		if (hasErrors) {
			String[] lines = FileUtils.readFileAsString(filePath).split("\\r?\\n");
			for (Object error : errors) {
				if (error instanceof org.eclipse.xtext.diagnostics.Diagnostic) {
					org.eclipse.xtext.diagnostics.Diagnostic diagnostic = (org.eclipse.xtext.diagnostics.Diagnostic)error;
					int line = diagnostic.getLine() - 1;
					int column = getColumn(lines, line, diagnostic.getOffset());
					System.out.println(MessageFormat.format("{0}:{1}:{2}", filePath.substring(filePath.lastIndexOf('/') + 1), line + 1, column));
					System.out.println(lines[line]);
					System.out.println(String.format("%1$#" + column + "s", "") + "^");
					System.out.println(diagnostic.getMessage());
					System.out.println();
				}
			}
		}
		assertFalse(hasErrors);
	}
}
