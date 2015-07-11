package org.elysium.test.regression

import java.io.File
import javax.inject.Inject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.diagnostics.Severity
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.Files
import org.eclipse.xtext.validation.CheckMode
import org.elysium.LilyPondInjectorProvider
import org.elysium.lilypond.Assignment
import org.elysium.lilypond.Include
import org.elysium.lilypond.LilyPond
import org.elysium.lilypond.OutputDefinition
import org.elysium.lilypond.Reference
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(LilyPondInjectorProvider)
class GrammarRegressions {

	@Inject
	extension ParseHelper<LilyPond> parseHelper

	def private LilyPond parseWithoutErrors(CharSequence modelString){
		val resourceSet = new ResourceSetImpl
		val result = modelString.parse(resourceSet)
		val resource = resourceSet.resources.get(0) as XtextResource
		val resourceValidator = resource.resourceServiceProvider.resourceValidator
		val issues = resourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
		val errors = issues.filter[severity == Severity.ERROR]
		if (!errors.empty) {
			Assert.fail('''Expected no errors, but got : «errors»''')
		}
		result
	} 

	@Test
	def void assignmentAfterSchemeList() {
		//simplified from 
		//using-make-connected-path-stencil-to-draw-custom-shapes.ly
		//flamenco-notation.ly
		val problemCases=#["#()","#ff"]
		val barName="bar"
		problemCases.forEach[problem|
			val model='''
				foo = \markup «problem»

				«barName» = "x"
			'''.parseWithoutErrors
	
			val foo=model.expressions.head
			Assert.assertTrue(problem, foo instanceof Assignment)
	
			val bar=model.expressions.last
			Assert.assertTrue(problem, bar instanceof Assignment)
			Assert.assertEquals(problem, barName, (bar as Assignment).name)
		]
	}

	@Test
	def void assignmentInExpression() {
		//from displaying-the-version-number-with-conditionals-if-then-using-scheme.ly
		val pieceTagLine="pieceTagLine"
		val model='''
			#(if (not (defined? 'pieceTagLine))
			  (define «pieceTagLine» (string-append "You are running version " (lilypond-version))))
		'''.parseWithoutErrors
		val pieceTagLineFound = model.eAllContents.forall[
			switch it {
				Assignment: it.name==pieceTagLine
				default: false
			}
		]
		Assert.assertTrue(pieceTagLineFound)
	}

	@Test
	def void schemeAliasDefine() {
		val alias = "anAlias"
		val model='''
			#(define «alias» something)
			refersTo = \«alias»
		'''.parseWithoutErrors

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
	def void recognizeTrill() {
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
	def void recognizeIncludeInPaper() {
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
	def void recognizeMusicCommand() {
		val model='''
			bla=\grobdescriptions
		'''.parseWithoutErrors

		val blaAssignment=(model.expressions.get(0) as Assignment)
		Assert.assertTrue(blaAssignment.value.class.simpleName, blaAssignment.value instanceof Reference)
	}

	@Test
	//adapted from problematic snippet vertically-aligned-dynamics-and-textscripts
	def void recognizeAssignmentAfterSchemeNumberValue() {
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
	def void quoteAtEndOfSchemeListOK() {
		'''	cnine=\markup\keys #'(c e  g bes d')'''.parseWithoutErrors
	}

	static val REFERENCE = ''' \árvíztűrőTükörfúrógép'''

	static val ASSIGNMENT = '''árvíztűrőTükörfúrógép = #1'''

	static val HEADER = '''\header { title = "a" }'''

	static val SCORE = '''\score { c }'''

	static val BOOK_PART_ELEMENTS = HEADER + SCORE

	@Test
	def void string() {
		'''i = "\"\x"'''.parseWithoutErrors
	}

	@Test
	def void include() {
		'''\include "gregorian.ly"'''.parseWithoutErrors
	}

	@Test
	def void version() {
		'''\version "2.12.0"'''.parseWithoutErrors
	}

	@Test
	def void sourceFileName() {
		'''\sourcefilename "foo.ly"'''.parseWithoutErrors
	}

	@Test
	def void sourceFileLine() {
		'''\sourcefileline 42'''.parseWithoutErrors
	}

	@Test
	def void singleLineComment() {
		'''% comment'''.parseWithoutErrors
	}

	@Test
	def void commentAfterSchemeLiteral() {
		'''#'a%'''.parseWithoutErrors
	}

	@Test
	def void multiLineComment() {
		'''%{ comment }%'''.parseWithoutErrors
	}

	@Test
	def void paper() {
		'''\paper { ragged-last-bottom = ##t }'''.parseWithoutErrors
	}

	@Test
	def void midi() {
		'''\midi {}'''.parseWithoutErrors
	}

	@Test
	def void layout() {
		'''\layout { ragged-right = ##t }'''.parseWithoutErrors
	}

	@Test
	def void layoutVariable() {
		'''\layout { indent = 0\cm }'''.parseWithoutErrors
	}

	@Test
	def void scheme() {
		'''#(set-default-paper-size "a4")'''.parseWithoutErrors
	}

	@Test
	def void schemeQuotations() {
		'''#`(a ,(+ 1 2) ,@(map abs '(4 -5 6)) b)'''.parseWithoutErrors
	}

	@Test
	def void schemeQuestionMark() {
		'''#(eq? 1 2)'''.parseWithoutErrors
	}

	@Test
	def void schemeSingleLineComment() {
		'''
			#(begin ; comment 
			)
		'''.parseWithoutErrors
	}

	@Test
	def void schemeMultiLineComment() {
		'''#(begin #! comment !# )'''.parseWithoutErrors
	}

	@Test
	def void schemeDoubleColon() {
		'''#ly:key-signature-interface::print'''.parseWithoutErrors
	}

	@Test
	def void schemeHyphen() {
		'''#(define (ac:abs->mom m) (ly:moment-mul m ac:currentTempo))'''.parseWithoutErrors
	}

	@Test
	def void schemeChord() {
		'''#(chord-shape 'f:7 guitar-tuning)'''.parseWithoutErrors
	}

	@Test
	def void schemeHexa() {
		'''##xf'''.parseWithoutErrors
	}

	@Test
	def void schemeMarkup() {
		'''#(markup #:bold "a")'''.parseWithoutErrors
	}

	@Test
	def void schemeBlock() {
		'''##{ c #}'''.parseWithoutErrors
	}

	@Test
	def void schemeReference() {
		'''#(define $i 1)'''.parseWithoutErrors
	}

	@Test
	def void schemeReferenceInBlock() {
		'''«ASSIGNMENT» ##{ $i #}'''.parseWithoutErrors
	}

	@Test
	def void schemeReferenceListInBlock() {
		'''##{ #$(list 1) #}'''.parseWithoutErrors
	}

	@Test
	def void schemeBareReferenceListInBlock() {
		'''##{ $(list 1) #}'''.parseWithoutErrors
	}
	
	@Test
	def void schemeQuotedReference() {
		'''#'at'''.parseWithoutErrors
	}

	@Test
	def void header() {
		BOOK_PART_ELEMENTS.parseWithoutErrors
	}

	@Test
	def void score() {
		SCORE.parseWithoutErrors
	}

	@Test
	def void book() {
		'''\book { \bookpart {} «BOOK_PART_ELEMENTS» }'''.parseWithoutErrors
	}

	@Test
	def void bookPart() {
		'''\bookpart { «BOOK_PART_ELEMENTS» }'''.parseWithoutErrors
	}

	@Test
	def void sequentialMusic() {
		'''{ c' }'''.parseWithoutErrors
	}

	@Test
	def void markup() {
		'''\markup { árvíztűrő tükörfúrógép }'''.parseWithoutErrors
	}

	@Test
	def void markupCommandWithHyphen() {
		'''\markup \fill-line { \on-the-fly #not-first-page \fromproperty #'header:instrument }'''.parseWithoutErrors
	}
	
	@Test
	def void markupCommandWithDot() {
		'''\markup \fill-with-pattern #1 #RIGHT . \fromproperty #'toc:text \fromproperty #'toc:page'''.parseWithoutErrors
	}

	@Test
	def void assignment() {
		(ASSIGNMENT + REFERENCE).parseWithoutErrors;
	}

	@Test
	def void assignmentIncluded() {
		val filename = "1 foo.ly";
		Files.writeStringIntoFile(filename, ASSIGNMENT);
		'''
			\include "«filename»"
			«REFERENCE»
		'''.parseWithoutErrors
		new File(filename).delete();
	}

	@Test
	def void hyphenAfterCommand() {
		//TODO is f the command for f-1? 
		'''{ c-\f-1 }'''.parseWithoutErrors
	}

	@Test
	def void relativeMusic() {
		'''\relative c' { c }'''.parseWithoutErrors
	}

	@Test
	def void transposedMusic() {
		'''\transpose c d { c }'''.parseWithoutErrors
	}

	@Test
	def void newContext() {
		'''\new Staff { c }'''.parseWithoutErrors
	}

	@Test
	def void newContextWithId() {
		'''\context Staff = "a" { c }'''.parseWithoutErrors
	}

	@Test
	def void contextDef() {
		'''\context { \Staff }'''.parseWithoutErrors
	}

	@Test
	def void lyricSemicolon() {
		//TODO this will cause problems with an adapted single-semicolon scheme single line comment definition
		'''i = \lyricmode { a; }'''.parseWithoutErrors
	}

	@Test
	def void stringIndication() {
		'''{ <c\\1> }'''.parseWithoutErrors
	}

	@Test
	def void clef() {
		'''{ \clef treble }'''.parseWithoutErrors
	}
}