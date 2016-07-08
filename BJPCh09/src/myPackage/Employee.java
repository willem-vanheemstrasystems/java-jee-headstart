package myPackage;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeGender;
	private int DepartmentID;
	
	@Id
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID( int employeeID ) {
		this.EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName( String employeeName ) {
		this.EmployeeName = employeeName;
	}
	public String getEmployeeGender() {
		return EmployeeGender;
	}
	public void setEmployeeGender( String employeeGender ) {
		this.EmployeeGender = employeeGender;
	}
	public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID( int departmentID ) {
		this.DepartmentID = departmentID;
	}
}
