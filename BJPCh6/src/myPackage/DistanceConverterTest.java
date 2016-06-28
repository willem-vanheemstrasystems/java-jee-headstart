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
		// Assert if meters equals 0.3048 (i.e. 1 foot equals 0.3048 meters)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding
		assertEquals(meters, 0.3048, 0.001);
	}

	@Test
	public void testConvertMetersToFeet() {
		//fail("Not yet implemented");
		meters = 1;
		feet = DistanceConverter.convertMetersToFeet(meters);
		// Assert if feet equals 3.2808 (i.e. 1 meter equals 3.2808 feet)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding
		assertEquals(feet, 3.2808, 0.001);
	}

	@Test
	public void testConvertFeetToInches() {
		//fail("Not yet implemented");
		feet = 1;
		inches = DistanceConverter.convertFeetToInches(feet);
		// Assert if inches equals 12 (i.e. 1 foot equals 12 inches)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding
		assertEquals(inches, 12, 0.001);
	}

	@Test
	public void testConvertInchesToFeet() {
		//fail("Not yet implemented");
		inches = 1;
		feet = DistanceConverter.convertInchesToFeet(inches);
		// Assert if feet equals 1/12 (i.e. 1 inch equals 1/12 feet)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding
		// Note: 1/12 = 0.083333
		assertEquals(feet, 0.083333, 0.001);
	}

	@Test
	public void testConvertCentimetersToFeet() {
		//fail("Not yet implemented");
		centimeters = 1;
		feet = DistanceConverter.convertCentimetersToFeet(centimeters);
		// Assert if feet equals 0.032808 (i.e. 1 centimeter equals 0.032808 feet)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding
		assertEquals(feet, 0.032808, 0.001);
	}

	@Test
	public void testConvertFeetToCentimeters() {
		//fail("Not yet implemented");
		feet = 1;
		centimeters = DistanceConverter.convertFeetToCentimeters(feet);
		// Assert if centimeters equals 30.4803706 (i.e. 1 foot equals 30.4803706 centimeters)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding		
		assertEquals(centimeters, 30.4803706, 0.001);
	}

	@Test
	public void testConvertCentimetersToInches() {
		//fail("Not yet implemented");
		centimeters = 1;
		inches = DistanceConverter.convertCentimetersToInches(centimeters);
		// Assert if inches equals 0.39371 (i.e. 1 centimeter equals 0.39371 inches)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding		
		assertEquals(inches, 0.39371, 0.001);
	}

	@Test
	public void testConvertInchesToCentimeters() {
		//fail("Not yet implemented");
		inches = 1;
		centimeters = DistanceConverter.convertInchesToCentimeters(inches);
		// Assert if centimeters equals 2.53994057 (i.e. 1 inch equals 2.53994057 centimeters)
		// with a margin of error (i.e. epsilon) of 0.001
		// due to rounding	
		assertEquals(centimeters, 2.53994057, 0.001);
	}
}
