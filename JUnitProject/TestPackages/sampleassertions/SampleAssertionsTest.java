package sampleassertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleAssertionsTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/

	public SampleAssertionsTest() {
	}

	@Test
	public void testAssertArrayEquals() {
		byte[] expected = "test".getBytes();
		byte[] actual = "test".getBytes();
		assertArrayEquals("failure - byte arrays not same", expected, actual);
	}

	@Test
	public void testAssertEquals() {
		assertEquals("failure - strings are not equal", "text", "text");
		// Checks that two primitives/objects are equal.
	}

	@Test
	public void testAssertFalse() {
		assertFalse("failure - should be false", false);
		// Checks that a condition is false.
	}

	@Test
	public void testAssertNotNull() {
		assertNotNull("should not be null", new Object());
		// Checks that an object isn't null.
	}

	@Test
	public void testAssertNotSame() {
		assertNotSame("should not be same Object", new Object(), new Object());
	}

	@Test
	public void testAssertNull() {
		assertNull("should be null", null);
		// Checks that an object is null.
	}

	@Test
	public void testAssertSame() {
		Integer aNumber = Integer.valueOf(62);
		assertSame("should be same", aNumber, aNumber);
	}

	@Test
	public void testAssertTrue() {
		assertTrue("failure - should be true", true);
		// Checks that a condition is true.
	}

}
