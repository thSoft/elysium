package org.elysium.tests.formatting

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.formatter.FormatterTester
import org.elysium.tests.LilyPondInjectorProvider
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(LilyPondInjectorProvider)
class Formatter extends FormatterTester{

	def private void assertFormatting(String unformatted, String formatted) throws Exception {
		assertFormatted[
			toBeFormatted = unformatted
			expectation = formatted
		]
	}

	def private void assertFormattingSame(String model) throws Exception {
		assertFormatting(model, model)
	}

	@Test
	def void blockIndent() {
		assertFormatting("{a}{ {}<<c'>>{} }{}", 
		'''
			{
				a
			}
			{
				{}
				<<
					c'
				>>
				{}
			}
			{}''')
	}

	@Test
	def void schemeNegativeNumber(){
		assertFormattingSame("#-42")
	}

	@Test
	def void noSpaceAfterBackslash(){
		assertFormatting('''\ sourcefilename "tada.txt"''', '''\sourcefilename "tada.txt"''')
	}

	@Test
	def void noSpaceBeforeCommaEtc(){
		assertFormatting(" ( , ' )", "(,')")
	}

	@Test
	def void noSpaceBeforeNumber(){
		assertFormatting("c 8", "c8")
	}

	@Test
	def void newLineAfterInclude(){
		assertFormatting('''\include "tada.txt" {}''', 
		'''
			\include "tada.txt"
			{}''')
	}

	@Test
	def void versionLineWrap(){
		assertFormatting('''\version "tada"{}''',
			'''
				\version "tada"
				
				{}'''
		)
	}

	@Test
	def void assignmentLineWrap(){
		assertFormatting('''tada  =  "tada"{}''',
			'''
				tada = "tada"
				
				{}'''
		)
	}
}