package org.elysium.test;

import java.io.File;
import org.eclipse.xtext.util.Files;

public class Grammar extends LilyPondTest {

	private static final String REFERENCE = " \\i";

	private static final String ASSIGNMENT = "i = ##t";

	private static final String HEADER = "\\header { title = \"a\" }";

	private static final String SCORE = "\\score { c }";

	private static final String BOOK_PART_ELEMENTS = HEADER + SCORE;

	private void assertValid(String model) throws Exception {
		getResourceFromString(model);
	}

	public void testInclude() throws Exception {
		assertValid("\\include \"gregorian.ly\"");
	}

	public void testVersion() throws Exception {
		assertValid("\\version \"2.12.0\"");
	}

	public void testSourceFileName() throws Exception {
		assertValid("\\sourcefilename \"foo.ly\"");
	}

	public void testSourceFileLine() throws Exception {
		assertValid("\\sourcefileline 42");
	}

	public void testSingleLineComment() throws Exception {
		assertValid("% comment");
	}

	public void testMultiLineComment() throws Exception {
		assertValid("%{ comment }%");
	}

	public void testPaper() throws Exception {
		assertValid("\\paper { ragged-last-bottom = ##t }");
	}

	public void testMidi() throws Exception {
		assertValid("\\midi {}");
	}

	public void testLayout() throws Exception {
		assertValid("\\layout { ragged-right = ##t }");
	}

	public void testLayoutVariable() throws Exception {
		assertValid("\\layout { indent = 0\\cm }");
	}

	public void testScheme() throws Exception {
		assertValid("#(set-default-paper-size \"a4\")");
	}

	public void testSchemeSingleLineComment() throws Exception {
		assertValid("#(begin ; comment \n)");
	}

	public void testSchemeMultiLineComment() throws Exception {
		assertValid("#(begin #! comment !# )");
	}

	public void testSchemeHexa() throws Exception {
		assertValid("##xf");
	}

	public void testSchemeMarkup() throws Exception {
		assertValid("#(markup #:bold \"a\")");
	}

	public void testHeader() throws Exception {
		assertValid(BOOK_PART_ELEMENTS);
	}

	public void testScore() throws Exception {
		assertValid(SCORE);
	}

	public void testBook() throws Exception {
		assertValid("\\book { \\bookpart {} " + BOOK_PART_ELEMENTS + " }");
	}

	public void testBookPart() throws Exception {
		assertValid("\\bookpart { " + BOOK_PART_ELEMENTS + " }");
	}

	public void testSequentialMusic() throws Exception {
		assertValid("{ c' }");
	}

	public void testMarkup() throws Exception {
		assertValid("\\markup { árvíztűrő tükörfúrógép }");
	}

	public void testAssignment() throws Exception {
		assertValid(ASSIGNMENT + REFERENCE);
	}

	public void testAssignmentIncluded() throws Exception {
		String filename = "foo.ly";
		Files.writeStringIntoFile(filename, ASSIGNMENT);
		assertValid("\\include \"" + filename + "\"" + REFERENCE);
		new File(filename).delete();
	}

	public void testHyphenAfterCommand() throws Exception {
		assertValid("{ c-\\f-1 }");
	}

}
