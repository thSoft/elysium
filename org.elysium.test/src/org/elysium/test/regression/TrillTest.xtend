package org.elysium.test.regression

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.elysium.LilyPondInjectorProvider
import org.junit.Test
import javax.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.elysium.lilypond.LilyPond
import org.junit.Assert
import org.elysium.lilypond.Assignment

@RunWith(XtextRunner)
@InjectWith(LilyPondInjectorProvider)
class TrillTest {

	@Inject
	extension ParseHelper<LilyPond> parsehelper

	@Test
	//regression test for #58
	def void recognizeTrill() throws Exception {
		val model='''
			thumb = \finger \markup \scale #(cons (magstep 5) (magstep 5))
			                        \musicglyph #"scripts.thumb"
			trill = #(make-articulation "trill")
		'''.parse

		val expectedTrillAssignment=model.expressions.last
		Assert.assertTrue(expectedTrillAssignment instanceof Assignment)
		Assert.assertEquals("trill", (expectedTrillAssignment as Assignment).name)
	}
}