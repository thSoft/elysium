package org.elysium.test;

public class Grammar extends LilyPondTest {

	private void assertValid(String model) throws Exception {
		getResourceFromString(model);
	}

	public void testSimple() throws Exception {
		assertValid("{ c' }");
	}

	public void testSchemeMarkup() throws Exception {
		assertValid("#(markup #:bold \"a\")");
	}

	public void testSchemeHexa() throws Exception {
		assertValid("##xf");
	}

	public void testHyphenAfterCommand() throws Exception {
		assertValid("{ c-\\f-1 }");
	}

	public void testLayoutVariable() throws Exception {
		assertValid("\\layout { indent = 0\\cm }");
	}

	public void testAssignment() throws Exception {
		assertValid("i = ##t \\i");
	}

}
