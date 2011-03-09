package org.elysium.test;

import org.eclipse.xtext.parsetree.CompositeNode;

public class Formatter extends LilyPondTest {

	private void checkFormatting(String unformatted, String formatted) throws Exception {
		CompositeNode rootNode = getRootNode(unformatted);
		assertEquals(formatted, getNodeModelFormatter().format(rootNode, 0, rootNode.getLength()).getFormattedText());
	}

	private void checkFormattingSame(String model) throws Exception {
		checkFormatting(model, model);
	}

	public void testSimple() throws Exception {
		checkFormatting("{ c' }", "{\n\tc'\n}");
	}

	public void testSchemeNegativeNumber() throws Exception {
		checkFormattingSame("i = #-42");
	}

}
