package com.mycompany.app;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void testAppConstructor() {
		try {
			new App();
		} catch (Exception e) {
			fail("Construction failed.");
		}
	}

}
