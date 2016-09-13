package org.elysium.tests

import org.eclipse.xtext.nodemodel.ICompositeNode
import org.junit.Test

class Formatter extends LilyPondTest{

	def private void assertFormatting(String unformatted, String formatted) throws Exception {
		val ICompositeNode rootNode = getRootNode(unformatted);
		assertEquals(formatted, getNodeModelFormatter().format(rootNode, 0, rootNode.getLength()).getFormattedText());
	}

	def private void assertFormattingSame(String model) throws Exception {
		assertFormatting(model, model);
	}

	@Test
	def void simple() throws Exception {
		assertFormatting("{ c' }", 
		'''
			{
				c'
			}''');
	}

	@Test
	def void schemeNegativeNumber() throws Exception {
		assertFormattingSame("i = #-42");
	}
}