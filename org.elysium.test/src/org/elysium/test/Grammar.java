package org.elysium.test;

import java.io.File;
import org.eclipse.xtext.util.Files;
import org.junit.Test;

public class Grammar extends LilyPondTest {

	private void assertValid(String model) throws Exception {
		getResourceFromString(model);
	}

	private static final String REFERENCE = " \\árvíztűrőTükörfúrógép";

	private static final String ASSIGNMENT = "árvíztűrőTükörfúrógép = #1";

	private static final String HEADER = "\\header { title = \"a\" }";

	private static final String SCORE = "\\score { c }";

	private static final String BOOK_PART_ELEMENTS = HEADER + SCORE;

	@Test
	public void string() throws Exception {
		assertValid("i = \"\\\"\\x\"");
	}

	@Test
	public void include() throws Exception {
		assertValid("\\include \"gregorian.ly\"");
	}

	@Test
	public void version() throws Exception {
		assertValid("\\version \"2.12.0\"");
	}

	@Test
	public void sourceFileName() throws Exception {
		assertValid("\\sourcefilename \"foo.ly\"");
	}

	@Test
	public void sourceFileLine() throws Exception {
		assertValid("\\sourcefileline 42");
	}

	@Test
	public void singleLineComment() throws Exception {
		assertValid("% comment");
	}

	@Test
	public void commentAfterSchemeLiteral() throws Exception {
		assertValid("#'a%");
	}

	@Test
	public void multiLineComment() throws Exception {
		assertValid("%{ comment }%");
	}

	@Test
	public void paper() throws Exception {
		assertValid("\\paper { ragged-last-bottom = ##t }");
	}

	@Test
	public void midi() throws Exception {
		assertValid("\\midi {}");
	}

	@Test
	public void layout() throws Exception {
		assertValid("\\layout { ragged-right = ##t }");
	}

	@Test
	public void layoutVariable() throws Exception {
		assertValid("\\layout { indent = 0\\cm }");
	}

	@Test
	public void scheme() throws Exception {
		assertValid("#(set-default-paper-size \"a4\")");
	}

	@Test
	public void schemeQuotations() throws Exception {
		assertValid("#`(a ,(+ 1 2) ,@(map abs '(4 -5 6)) b)");
	}

	@Test
	public void schemeQuestionMark() throws Exception {
		assertValid("#(eq? 1 2)");
	}

	@Test
	public void schemeSingleLineComment() throws Exception {
		assertValid("#(begin ; comment \n)");
	}

	@Test
	public void schemeMultiLineComment() throws Exception {
		assertValid("#(begin #! comment !# )");
	}

	@Test
	public void schemeDoubleColon() throws Exception {
		assertValid("#ly:key-signature-interface::print");
	}

	@Test
	public void schemeHyphen() throws Exception {
		assertValid("#(define (ac:abs->mom m) (ly:moment-mul m ac:currentTempo))");
	}

	@Test
	public void schemeChord() throws Exception {
		assertValid("#(chord-shape 'f:7 guitar-tuning)");
	}

	@Test
	public void schemeHexa() throws Exception {
		assertValid("##xf");
	}

	@Test
	public void schemeMarkup() throws Exception {
		assertValid("#(markup #:bold \"a\")");
	}

	@Test
	public void schemeBlock() throws Exception {
		assertValid("##{ c #}");
	}

	@Test
	public void schemeReference() throws Exception {
		assertValid("#(define $i 1)");
	}

	@Test
	public void schemeReferenceInBlock() throws Exception {
		assertValid(ASSIGNMENT + " ##{ $i #}");
	}

	@Test
	public void schemeReferenceListInBlock() throws Exception {
		assertValid("##{ #$(list 1) #}");
	}

	@Test
	public void schemeBareReferenceListInBlock() throws Exception {
		assertValid("##{ $(list 1) #}");
	}

	@Test
	public void header() throws Exception {
		assertValid(BOOK_PART_ELEMENTS);
	}

	@Test
	public void score() throws Exception {
		assertValid(SCORE);
	}

	@Test
	public void book() throws Exception {
		assertValid("\\book { \\bookpart {} " + BOOK_PART_ELEMENTS + " }");
	}

	@Test
	public void bookPart() throws Exception {
		assertValid("\\bookpart { " + BOOK_PART_ELEMENTS + " }");
	}

	@Test
	public void sequentialMusic() throws Exception {
		assertValid("{ c' }");
	}

	@Test
	public void markup() throws Exception {
		assertValid("\\markup { árvíztűrő tükörfúrógép }");
	}

	@Test
	public void markupCommandWithHyphen() throws Exception {
		assertValid("\\markup \\fill-line { \\on-the-fly #not-first-page \\fromproperty #'header:instrument }");
	}

	@Test
	public void assignment() throws Exception {
		assertValid(ASSIGNMENT + REFERENCE);
	}

	@Test
	public void assignmentIncluded() throws Exception {
		String filename = "foo.ly";
		Files.writeStringIntoFile(filename, ASSIGNMENT);
		assertValid("\\include \"" + filename + "\"" + REFERENCE);
		new File(filename).delete();
	}

	@Test
	public void hyphenAfterCommand() throws Exception {
		assertValid("{ c-\\f-1 }");
	}

	@Test
	public void relativeMusic() throws Exception {
		assertValid("\\relative c' { c }");
	}

	@Test
	public void transposedMusic() throws Exception {
		assertValid("\\transpose c d { c }");
	}

	@Test
	public void newContext() throws Exception {
		assertValid("\\new Staff { c }");
	}

	@Test
	public void newContextWithId() throws Exception {
		assertValid("\\context Staff = \"a\" { c }");
	}

	@Test
	public void contextDef() throws Exception {
		assertValid("\\context { \\Staff }");
	}

	@Test
	public void lyricSemicolon() throws Exception {
		assertValid("i = \\lyricmode { a; }");
	}

	@Test
	public void stringIndication() throws Exception {
		assertValid("{ <c\\1> }");
	}

	@Test
	public void clef() throws Exception {
		assertValid("{ \\clef treble }");
	}

}
