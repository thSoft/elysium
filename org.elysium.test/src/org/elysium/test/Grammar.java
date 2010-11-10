package org.elysium.test;

public class Grammar extends LilyPondTest {

	private void assertValid(String model) throws Exception {
		getResourceFromString(model);
	}

	public void testSimple() throws Exception {
		assertValid("{ c' }");
	}

	public void testAssignment() throws Exception {
		assertValid("i = ##t \\i");
	}

	public void testLayout() throws Exception {
		assertValid("\\layout { indent = 0\\cm }");
	}

}
