package org.elysium.test;

import org.eclipse.xtext.parsetree.CompositeNode;

public class Formatter extends LilyPondTest {

	private void checkFormatting(String unformatted, String formatted) throws Exception {
		CompositeNode rootNode = getRootNode(unformatted);
		assertEquals(formatted, getNodeModelFormatter().format(rootNode, 0, rootNode.getLength()).getFormattedText());
	}

	public void testSimple() throws Exception {
		checkFormatting("{ c' }", "{\n\tc'\n}");
	}

}
