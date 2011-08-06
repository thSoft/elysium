package org.elysium.test;

import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.junit.Test;

public class Formatter extends LilyPondTest {

	private void assertFormatting(String unformatted, String formatted) throws Exception {
		ICompositeNode rootNode = getRootNode(unformatted);
		assertEquals(formatted, getNodeModelFormatter().format(rootNode, 0, rootNode.getLength()).getFormattedText());
	}

	private void assertFormattingSame(String model) throws Exception {
		assertFormatting(model, model);
	}

	@Test
	public void simple() throws Exception {
		assertFormatting("{ c' }", "{\n\tc'\n}");
	}

	@Test
	public void schemeNegativeNumber() throws Exception {
		assertFormattingSame("i = #-42");
	}

}
