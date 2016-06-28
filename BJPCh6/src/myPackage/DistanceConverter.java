/**
 * 
 */
package myPackage;
/**
 * @author user
 *
 */
public class DistanceConverter {
	// Method
	public static double convertFeetToMeters(double feet){
		return feet * 0.3048;
	}
	// Method
	public static double convertMetersToFeet(double meters) {
		return meters * 3.2808;
	}
	// Method
	public static double convertFeetToInches(double feet) {
		return feet * 12;
	}
	// Method
	public static double convertInchesToFeet(double inches) {
		return inches / 12;
	}
	// Method
	public static double convertCentimetersToFeet(double centimeters) {
		return convertMetersToFeet(centimeters / 100);
	}
	// Method
	public static double convertFeetToCentimeters(double feet) {
		return convertFeetToMeters(feet) * 100;
	}
	// Method
	public static double convertCentimetersToInches(double centimeters) {
		return convertFeetToInches(convertCentimetersToFeet(centimeters));
	}
	// Method
	public static double convertInchesToCentimeters(double inches) {
		return convertFeetToCentimeters(convertInchesToFeet(inches));
	}
}
