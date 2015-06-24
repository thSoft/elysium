package org.elysium.test.regression

import java.io.File
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.util.Files
import org.elysium.LilyPondInjectorProvider
import org.elysium.lilypond.Assignment
import org.elysium.lilypond.Include
import org.elysium.lilypond.LilyPond
import org.elysium.lilypond.OutputDefinition
import org.elysium.lilypond.Reference
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

import java.util.concurrent.atomic.AtomicBoolean

@RunWith(XtextRunner)
@InjectWith(LilyPondInjectorProvider)
class GrammarRegressions {

	@Inject
	extension ParseHelper<LilyPond> parsehelper
	@Inject
	extension ValidationTestHelper validator

	def private LilyPond parseWithoutErrors(CharSequence modelString){
		val result=modelString.parse
		result.assertNoErrors
		return result
	} 

	@Test
	def void assignmentAfterSchemeList() throws Exception {
		//simplified from 
		//using-make-connected-path-stencil-to-draw-custom-shapes.ly
		//flamenco-notation.ly
		val problemCases=#["#()","#ff"]
		val bar="bar"
		problemCases.forEach[problem|
			val model='''
				foo = \markup «problem»

				«bar» = "x"
			'''.parse
	
			model.assertNoErrors
	
			val foo=model.expressions.head
			Assert.assertTrue(problem, foo instanceof Assignment)
	
			val barModel=model.expressions.last
			Assert.assertTrue(problem, barModel instanceof Assignment)
			Assert.assertEquals(problem, bar, (barModel as Assignment).name)
		]
	}

	@Test
	def void assignmentInExpression() throws Exception {
		//from displaying-the-version-number-with-conditionals-if-then-using-scheme
		val pieceTagLine="pieceTagLine"
		val model='''
			#(if (not (defined? 'pieceTagLine))
			  (define «pieceTagLine» (string-append "You are running version " (lilypond-version))))
		'''.parse

		val AtomicBoolean pieceTagLineFound=new AtomicBoolean(false)
		model.assertNoErrors
		model.eAllContents.forEach[
			if(it instanceof Assignment){
				if((it as Assignment).name==pieceTagLine){
					pieceTagLineFound.set(true)
				}
			}
		]
		Assert.assertTrue(pieceTagLineFound.get)
	}

	@Test
	def void schemeAliasDefine() throws Exception {
		val alias = "anAlias"
		val model='''
			#(define «alias» something)
			refersTo = \«alias»
		'''.parse

		model.assertNoErrors

		val define=model.expressions.head
		Assert.assertTrue(define instanceof Assignment)

		val referencingAssignment=model.expressions.last
		Assert.assertTrue(referencingAssignment instanceof Assignment)
		val ref=(referencingAssignment as Assignment).value
		Assert.assertTrue(ref.toString,ref instanceof Reference)
		Assert.assertEquals(alias, (ref as Reference).assignment.name)
	}

	@Test
	//regression test for #58
	def void recognizeTrill() throws Exception {
		val trill="trill"
		val model='''
			thumb = \finger \markup \scale #(cons (magstep 5) (magstep 5))
			                        \musicglyph #"scripts.thumb"
			«trill» = #(make-articulation "trill")
		'''.parseWithoutErrors

		val expectedTrillAssignment=model.expressions.last
		Assert.assertTrue(expectedTrillAssignment instanceof Assignment)
		Assert.assertEquals(trill, (expectedTrillAssignment as Assignment).name)
	}

	@Test
	//regression test for #79
	def void recognizeIncludeInPaper() throws Exception {
		val model='''
			\paper {
			  \include "bla.ly"
			}
			bla=\slashSeparator
		'''.parseWithoutErrors

		val paper=model.expressions.get(0) as OutputDefinition
		val include=paper.block.expressions.get(0)
		Assert.assertTrue(include.class.simpleName, include instanceof Include)
	}

	@Test
	def void recognizeMusicCommand() throws Exception {
		val model='''
			bla=\grobdescriptions
		'''.parseWithoutErrors

		val blaAssignment=(model.expressions.get(0) as Assignment)
		Assert.assertTrue(blaAssignment.value.class.simpleName, blaAssignment.value instanceof Reference)
	}

	@Test
	//adapted from problematic snippet vertically-aligned-dynamics-and-textscripts
	def void recognizeAssignmentAfterSchemeNumberValue() throws Exception {
		val music="music"
		val model='''
			\markup \vspace #1 %avoid LSR-bug

			music = "«music»"
		'''.parseWithoutErrors

		val expectedMusicAssignment=model.expressions.last
		Assert.assertTrue(expectedMusicAssignment instanceof Assignment)
		Assert.assertEquals(music, (expectedMusicAssignment as Assignment).name)
	}

	@Test
	def void quoteAtEndOfSchemeListOK() throws Exception {
		'''	cnine=\markup\keys #'(c e  g bes d')'''.parseWithoutErrors
	}

	static final String REFERENCE = ''' \árvíztűrőTükörfúrógép''';

	static final String ASSIGNMENT = '''árvíztűrőTükörfúrógép = #1''';

	static final String HEADER = '''\header { title = "a" }''';

	static final String SCORE = '''\score { c }''';

	static final String BOOK_PART_ELEMENTS = HEADER + SCORE;

	@Test
	def void string() throws Exception {
		'''i = "\"\x"'''.parseWithoutErrors
	}

	@Test
	def void include() throws Exception {
		'''\include "gregorian.ly"'''.parseWithoutErrors
	}

	@Test
	def void version() throws Exception {
		'''\version "2.12.0"'''.parseWithoutErrors
	}

	@Test
	def void sourceFileName() throws Exception {
		'''\sourcefilename "foo.ly"'''.parseWithoutErrors
	}

	@Test
	def void sourceFileLine() throws Exception {
		'''\sourcefileline 42'''.parseWithoutErrors
	}

	@Test
	def void singleLineComment() throws Exception {
		'''% comment'''.parseWithoutErrors
	}

	@Test
	def void commentAfterSchemeLiteral() throws Exception {
		'''#'a%'''.parseWithoutErrors
	}

	@Test
	def void multiLineComment() throws Exception {
		'''%{ comment }%'''.parseWithoutErrors
	}

	@Test
	def void paper() throws Exception {
		'''\paper { ragged-last-bottom = ##t }'''.parseWithoutErrors
	}

	@Test
	def void midi() throws Exception {
		'''\midi {}'''.parseWithoutErrors
	}

	@Test
	def void layout() throws Exception {
		'''\layout { ragged-right = ##t }'''.parseWithoutErrors
	}

	@Test
	def void layoutVariable() throws Exception {
		'''\layout { indent = 0\cm }'''.parseWithoutErrors
	}

	@Test
	def void scheme() throws Exception {
		'''#(set-default-paper-size "a4")'''.parseWithoutErrors
	}

	@Test
	def void schemeQuotations() throws Exception {
		'''#`(a ,(+ 1 2) ,@(map abs '(4 -5 6)) b)'''.parseWithoutErrors
	}

	@Test
	def void schemeQuestionMark() throws Exception {
		'''#(eq? 1 2)'''.parseWithoutErrors
	}

	@Test
	def void schemeSingleLineComment() throws Exception {
		'''
			#(begin ; comment 
			)
		'''.parseWithoutErrors
	}

	@Test
	def void schemeMultiLineComment() throws Exception {
		'''#(begin #! comment !# )'''.parseWithoutErrors
	}

	@Test
	def void schemeDoubleColon() throws Exception {
		'''#ly:key-signature-interface::print'''.parseWithoutErrors
	}

	@Test
	def void schemeHyphen() throws Exception {
		'''#(define (ac:abs->mom m) (ly:moment-mul m ac:currentTempo))'''.parseWithoutErrors
	}

	@Test
	def void schemeChord() throws Exception {
		'''#(chord-shape 'f:7 guitar-tuning)'''.parseWithoutErrors
	}

	@Test
	def void schemeHexa() throws Exception {
		'''##xf'''.parseWithoutErrors
	}

	@Test
	def void schemeMarkup() throws Exception {
		'''#(markup #:bold "a")'''.parseWithoutErrors
	}

	@Test
	def void schemeBlock() throws Exception {
		'''##{ c #}'''.parseWithoutErrors
	}

	@Test
	def void schemeReference() throws Exception {
		'''#(define $i 1)'''.parseWithoutErrors
	}

	@Test
	def void schemeReferenceInBlock() throws Exception {
		'''«ASSIGNMENT» ##{ $i #}'''.parseWithoutErrors
	}

	@Test
	def void schemeReferenceListInBlock() throws Exception {
		'''##{ #$(list 1) #}'''.parseWithoutErrors
	}

	@Test
	def void schemeBareReferenceListInBlock() throws Exception {
		'''##{ $(list 1) #}'''.parseWithoutErrors
	}
	
	@Test
	def void schemeQuotedReference() throws Exception {
		'''#'at'''.parseWithoutErrors
	}

	@Test
	def void header() throws Exception {
		BOOK_PART_ELEMENTS.parseWithoutErrors
	}

	@Test
	def void score() throws Exception {
		SCORE.parseWithoutErrors
	}

	@Test
	def void book() throws Exception {
		'''\book { \bookpart {} «BOOK_PART_ELEMENTS» }'''.parseWithoutErrors
	}

	@Test
	def void bookPart() throws Exception {
		'''\bookpart { «BOOK_PART_ELEMENTS» }'''.parseWithoutErrors
	}

	@Test
	def void sequentialMusic() throws Exception {
		'''{ c' }'''.parseWithoutErrors
	}

	@Test
	def void markup() throws Exception {
		'''\markup { árvíztűrő tükörfúrógép }'''.parseWithoutErrors
	}

	@Test
	def void markupCommandWithHyphen() throws Exception {
		'''\markup \fill-line { \on-the-fly #not-first-page \fromproperty #'header:instrument }'''.parseWithoutErrors
	}
	
	@Test
	def void markupCommandWithDot() throws Exception {
		'''\markup \fill-with-pattern #1 #RIGHT . \fromproperty #'toc:text \fromproperty #'toc:page'''.parseWithoutErrors
	}

	@Test
	def void assignment() throws Exception {
		(ASSIGNMENT + REFERENCE).parseWithoutErrors;
	}

	@Test
	def void assignmentIncluded() throws Exception {
		val filename = "foo.ly";
		Files.writeStringIntoFile(filename, ASSIGNMENT);
		'''
			\include "«filename»"
			«REFERENCE»
		'''.parseWithoutErrors
		new File(filename).delete();
	}

	@Test
	def void hyphenAfterCommand() throws Exception {
		//TODO is f the command for f-1? 
		'''{ c-\f-1 }'''.parseWithoutErrors
	}

	@Test
	def void relativeMusic() throws Exception {
		'''\relative c' { c }'''.parseWithoutErrors
	}

	@Test
	def void transposedMusic() throws Exception {
		'''\transpose c d { c }'''.parseWithoutErrors
	}

	@Test
	def void newContext() throws Exception {
		'''\new Staff { c }'''.parseWithoutErrors
	}

	@Test
	def void newContextWithId() throws Exception {
		'''\context Staff = "a" { c }'''.parseWithoutErrors
	}

	@Test
	def void contextDef() throws Exception {
		'''\context { \Staff }'''.parseWithoutErrors
	}

	@Test
	def void lyricSemicolon() throws Exception {
		//TODO this will cause problems with an adapted single-semicolon scheme single line comment definition
		'''i = \lyricmode { a; }'''.parseWithoutErrors
	}

	@Test
	def void stringIndication() throws Exception {
		'''{ <c\\1> }'''.parseWithoutErrors
	}

	@Test
	def void clef() throws Exception {
		'''{ \clef treble }'''.parseWithoutErrors
	}
}