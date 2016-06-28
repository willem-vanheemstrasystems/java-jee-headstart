package myPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceConverterTest {
	// Class variables
	double feet, meters, inches, centimeters;

	@Test
	public void testConvertFeetToMeters() {
		//fail("Not yet implemented");
		feet = 1;
		meters = DistanceConverter.convertFeetToMeters(feet);
		// Assert if meters equals 0.3048 (i.e. 1 feet equals 0.3048 meters)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding
		assertEquals(meters, 0.3048, 0.001);
	}

	@Test
	public void testConvertMetersToFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertFeetToInches() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertInchesToFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertCentimetersToFeet() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertFeetToCentimeters() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertCentimersToInches() {
		fail("Not yet implemented");
	}

	@Test
	public void testConvertInchesToCentimeters() {
		fail("Not yet implemented");
	}

}
