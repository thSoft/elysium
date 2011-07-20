package org.elysium.test;

public class Validator extends LilyPondTest {

	public void testNotAdjacentNamesNotUnique() throws Exception {
		assertValid("traLaLa = { c'4 d'4 } \\layout { traLaLa = 1.0 }");
	}

	public void testAdjacentNamesNotUnique() throws Exception {
		assertWarnings("i = #1 i = #2", 1);
	}

}
