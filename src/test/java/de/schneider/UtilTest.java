package de.schneider;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilTest {

	@Test
	public void test() {
		for (int i = 1; i <= 6; i++)
			assertTrue("testen der ist ErstesHalbesJahr funktion auf True oder false", Util.istErstesHalbjahr(i));

		for (int i = 7; i <= 12; i++)
			assertTrue("testen der ist ErstesHalbesJahr funktion auf True oder false", !Util.istErstesHalbjahr(i));
		// fail("in fail angekommen");
	}

}
