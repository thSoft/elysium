package org.elysium.test;

import org.eclipse.xtext.nodemodel.ICompositeNode;

public class Formatter extends LilyPondTest {

	private void assertFormatting(String unformatted, String formatted) throws Exception {
		ICompositeNode rootNode = getRootNode(unformatted);
		assertEquals(formatted, getNodeModelFormatter().format(rootNode, 0, rootNode.getLength()).getFormattedText());
	}

	private void assertFormattingSame(String model) throws Exception {
		assertFormatting(model, model);
	}

	public void testSimple() throws Exception {
		assertFormatting("{ c' }", "{\n\tc'\n}");
	}

	public void testSchemeNegativeNumber() throws Exception {
		assertFormattingSame("i = #-42");
	}

}
