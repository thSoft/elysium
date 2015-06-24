package org.elysium.test.regression

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
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
		'''.parse

		model.assertNoErrors

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
		'''.parse

		model.assertNoErrors

		val paper=model.expressions.get(0) as OutputDefinition
		val include=paper.block.expressions.get(0)
		Assert.assertTrue(include.class.simpleName, include instanceof Include)
	}

	@Test
	def void recognizeMusicCommand() throws Exception {
		val model='''
			bla=\grobdescriptions
		'''.parse

		model.assertNoErrors

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
		'''.parse

		model.assertNoErrors

		val expectedMusicAssignment=model.expressions.last
		Assert.assertTrue(expectedMusicAssignment instanceof Assignment)
		Assert.assertEquals(music, (expectedMusicAssignment as Assignment).name)
	}

	@Test
	def void quoteAtEndOfSchemeListOK() throws Exception {
		val model='''
			cnine=\markup\keys #'(c e  g bes d')
		'''.parse

		model.assertNoErrors
	}
}