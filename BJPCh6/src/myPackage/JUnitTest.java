/**
 * 
 */
package myPackage;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author user
 *
 */
public class JUnitTest {
	// Class variables
	static Scanner scanner;
	int myIntA, myIntB, myIntC;
	int[] myArrayA = {0,1,2};
	Object myObject;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Access resources for use in the tests
		scanner = new Scanner(System.in);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Close resources after all tests complete
		scanner.close();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Assign some values to the variables
		// before beginning each test
		myIntA = 5;
		myIntB = 6;
		myIntC = 7;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// Nothing needs to be torn down
	}

	@Test
	public void testAssertEquals() {
		// (5 + 1) equals 6
		assertEquals((myIntA + 1), myIntB);
	}
	
	@Test
	public void testAssertArrayEquals() {
		int[] myNewArray = {0,1,2};
		// The elements in both arrays are 0, 1, and 2
		// order matters: {0,1,2} != {0,2,1}
		assertArrayEquals(myArrayA, myNewArray);
	}
	
	@Test
	public void testAssertTrue() {
		// 7 > 5
		assertTrue(myIntC > myIntA);
	}

	@Test
	public void testAssertFalse() {
		// myArrayA.length == 3, 3 != 4
		assertFalse(myArrayA.length == 4);
	}
	
	@Test
	public void testAssertNull() {
		// myObject has not been initialized
		assertNull(myObject);
	}
	
	@Test
	public void testAssertNotNull() {
		String newString = "Hello";
		// newString is initialized
		assertNotNull(newString);
	}
	
	@Test
	public void testAssertSame() {
		myObject = new Object();
		Object pointerA = myObject;
		Object pointerB = myObject;
		// Both pointerA and pointerB reference myObject
		assertSame(pointerA, pointerB);
	}
	
	@Test
	public void testAssertNotSame() {
		myObject  = new Object();
		Object pointerA = new Object();
		Object pointerB = myObject;
		// pointerA is a new Object
		// pointerB references myObject
		assertNotSame(pointerA, pointerB);
	}
	
}
