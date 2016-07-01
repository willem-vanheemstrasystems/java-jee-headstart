/**
 * 
 */
package myPackage;
 
import java.time.*;

/**
 * @author user
 *
 */
public class Person {
	/**
	 * @param args
	 */
	// Instance variables
	String name;
	LocalDate birthdate;
	
	// Constructor
	public Person(String name, int year, int month, int day){
		LocalDate tempBD = LocalDate.of(year, month, day);
		this.name = name;
		this.birthdate = tempBD;
	}
	// Constructor
	public Person(String name){
		// Use the first Constructor of this class
		this(name, 1900, 1, 1);
	}
	// Method calculateAge()
	public int calculateAge(){
		//Period period = Period.between(this.birthdate, LocalDate.now());
		//return period.getYears();
		return calculateAge(LocalDate.now());
	}
	// Method calculateAge(LocalDate date)
	public int calculateAge(LocalDate date){
		Period period = Period.between(this.birthdate, date);
		return period.getYears();
	}
	// Method calculateAge(int year, int month, int day)
	public int calculateAge(int year, int month, int day){
		//Period period = Period.between(this.birthdate, LocalDate.of(year, month, day));
		//return period.getYears();
		return calculateAge(LocalDate.of(year, month, day));
	}
}