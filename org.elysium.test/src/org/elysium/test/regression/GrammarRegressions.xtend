package org.elysium.test.regression

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.elysium.LilyPondInjectorProvider
import org.elysium.lilypond.Assignment
import org.elysium.lilypond.Include
import org.elysium.lilypond.LilyPond
import org.elysium.lilypond.OutputDefinition
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.elysium.lilypond.Reference

@RunWith(XtextRunner)
@InjectWith(LilyPondInjectorProvider)
class GrammarRegressions {

	@Inject
	extension ParseHelper<LilyPond> parsehelper
	@Inject
	extension ValidationTestHelper validator

	@Test
	//regression test for #58
	def void recognizeTrill() throws Exception {
		val model='''
			thumb = \finger \markup \scale #(cons (magstep 5) (magstep 5))
			                        \musicglyph #"scripts.thumb"
			trill = #(make-articulation "trill")
		'''.parse

		model.assertNoErrors

		val expectedTrillAssignment=model.expressions.last
		Assert.assertTrue(expectedTrillAssignment instanceof Assignment)
		Assert.assertEquals("trill", (expectedTrillAssignment as Assignment).name)
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
}