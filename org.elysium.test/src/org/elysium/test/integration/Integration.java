package org.elysium.test.integration;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.lang.Math.min;
import static javax.util.file.FileUtils.readFileAsString;
import static org.eclipse.emf.common.util.URI.createURI;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.util.file.FilenameExtensionFilter;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.junit.validation.AssertableDiagnostics;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.AbstractValidationDiagnostic;
import org.elysium.LilyPondConstants;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.LilyPond;
import org.elysium.test.LilyPondTestWithValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.common.io.Files;

@RunWith(value = Parameterized.class)
public class Integration extends LilyPondTestWithValidator {


	@Parameters(name = "{1}")
	public static Collection<Object[]> data() {
		clean();
	
		Collection<Object[]> result = newArrayList();
		URI baseFileURI=TEST_DIRECTORY.toURI();
		
		for (String directoryName : DIRECTORY_NAMES) {
			File directory = new File(TEST_DIRECTORY, directoryName);
			for (File file : directory.listFiles(EXTENSION_FILTER)) {
				String shortFilePath = baseFileURI.relativize(file.toURI()).toString();
				result.add(new Object[] { file.getAbsolutePath(), shortFilePath });
			}
		}
		return result;
	}

	private static final File TEST_DIRECTORY = new File("resources");

	private static final String FAILING_DIRECTORY_NAME = "failingIntegrationTests";

	private static final String[] DIRECTORY_NAMES = {
		FAILING_DIRECTORY_NAME,
		"init",
		"snippets",
		"real-world/Mozart-KV250"
	};

	private static final FilenameExtensionFilter EXTENSION_FILTER = new FilenameExtensionFilter(LilyPondConstants.EXTENSION);
	
	private static void clean() {
		for (File file : new File(TEST_DIRECTORY, FAILING_DIRECTORY_NAME).listFiles(EXTENSION_FILTER)) {
			file.delete();
		}
	}

	public Integration(String filePath, String shortFilePath) throws Exception {
		this.filePath = filePath;
		this.shortFilePath = shortFilePath;
		fileContents = readFileAsString(filePath);
	}

	private final String filePath;
	private final String shortFilePath;
	private final String fileContents;
	private LilyPond ast; // XXX can only be parsed after @Before initialized dependency injection

	private LilyPond parseFile() throws Exception {
		XtextResource resource = doGetResource(getAsStream(fileContents), createURI("test"));
		LilyPond lilyPondmodel = (LilyPond)resource.getContents().get(0);
		return lilyPondmodel;
	}

	@Test
	public void parse() throws Exception{
		ast = parseFile();
		Iterable<Object> errors = getErrors();
		if (!Iterables.isEmpty(errors)) {
			String[] lines = fileContents.split("\\r?\\n");
			printErrors(errors, lines);
			copyCurrentFileToFailingTestsFolder();
			fail(MessageFormat.format("{0} error(s)", Iterables.size(errors)));
		}
		assertExpectedAssignmentsFoundInModel();
	}

	private Iterable<Object> getErrors() throws Exception {
		EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> parseErrors = ast.eResource().getErrors();
		AssertableDiagnostics validationDiagnostics = tester.validate(ast);
		Iterable<Diagnostic> validationErrors = filter(validationDiagnostics.getAllDiagnostics(), new Predicate<Diagnostic>() {
			@Override
			public boolean apply(Diagnostic input) {
				return input.getSeverity() == Diagnostic.ERROR;
			}
		});
		return ImmutableSet.copyOf(concat(parseErrors, validationErrors));
	}

	private void printErrors(Iterable<Object> errors, String[] lines) {
		for (Object error : errors) {
			if (error instanceof org.eclipse.xtext.diagnostics.Diagnostic) {
				org.eclipse.xtext.diagnostics.Diagnostic diagnostic = (org.eclipse.xtext.diagnostics.Diagnostic)error;
				int line = diagnostic.getLine() - 1;
				int offset = diagnostic.getOffset();
				printError(lines, diagnostic.getMessage(), line, offset);
			} else if (error instanceof AbstractValidationDiagnostic) {
				AbstractValidationDiagnostic diagnostic = (AbstractValidationDiagnostic) error;
				ICompositeNode node = NodeModelUtils.findActualNodeFor(diagnostic.getSourceEObject());
				int line = node.getStartLine() - 1;
				int offset = node.getOffset();
				printError(lines, diagnostic.getMessage(), line, offset);
			}
		}
	}

	private void printError(String[] lines, String message, int line, int offset) {
		int column = getColumn(lines, line, offset);
		System.out.println(MessageFormat.format("{0}:{1}:{2}", shortFilePath, line + 1, column));
		System.out.println(lines[line]);
		String padding = column == 0 ? "" : String.format("%1$" + column + "s", "");
		System.out.println(padding + "^");
		System.out.println(message);
		System.out.println();
	}

	private static int getColumn(String[] lines, int line, int offset) {
		int lineOffset = 0;
		for (int i = 0; i < min(lines.length, line); i++) {
			lineOffset += lines[i].length() + NEW_LINE_LENGTH;
		}
		return offset - lineOffset;
	}

	private static final int NEW_LINE_LENGTH=Optional.fromNullable(System.getProperty("os.name")).or("unix").contains("Wind")?2:1;

	private void copyCurrentFileToFailingTestsFolder() throws Exception{
		File currentFile = new File(filePath).getAbsoluteFile();
		File target=new File(TEST_DIRECTORY, FAILING_DIRECTORY_NAME);
		if(!target.equals(currentFile.getParentFile())){
			Files.copy(currentFile, new File(target, currentFile.getName()));
		}
	}

	private void assertExpectedAssignmentsFoundInModel() throws Exception{
		Set<String> missingAssignments = Sets.difference(getExpectedAssignments(), getActualAssignments());
		if(!missingAssignments.isEmpty()){
			System.out.println(MessageFormat.format("Expected assignments not found in {0}: {1}", new File(filePath).getName(), missingAssignments));
			copyCurrentFileToFailingTestsFolder();
			fail("missing assignments "+missingAssignments);
		}
	}

	private Set<String> getExpectedAssignments() throws IOException{
		Set<String> expectedAssignments = new LinkedHashSet<String>();
		Matcher matcher = ASSIGNMENT_RECOGNITION_PATTERN.matcher(fileContents);
		while(matcher.find()){
			expectedAssignments.add(matcher.group(1));
		}
		return expectedAssignments;
	}

	private static final Pattern ASSIGNMENT_RECOGNITION_PATTERN=Pattern.compile("[\\r\\n]+(\\w+)\\s=");

	private Set<String> getActualAssignments(){
		Set<String> actualAssignments = new HashSet<String>();
		List<Assignment> assignemts = EcoreUtil2.getAllContentsOfType(ast, Assignment.class);
		for (Assignment assignment : assignemts) {
			actualAssignments.add(assignment.getName());
		}
		return actualAssignments;
	}

}
