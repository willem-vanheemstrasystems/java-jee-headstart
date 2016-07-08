package myPackage;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Id;

@Entity
public class Employee {
	private int EmployeeID;
	private String EmployeeName;
	private String EmployeeGender;
	private int DepartmentID;
	private Set<Project> Projects = new HashSet<Project>(0);
	
	// Constructor
	public Employee(int employeeID, String employeeName, String employeeGender, int departmentID, Set<Project> projects) {
		// Get the methods of the parent class
		super();
		this.EmployeeID = employeeID;
		this.EmployeeName = employeeName;
		this.EmployeeGender = employeeGender;
		this.DepartmentID = departmentID;
		this.Projects = projects;
	}
	
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
	// Relationships
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (name="works_on", joinColumns = {@JoinColumn(name="EmployeeID")}, inverseJoinColumns = {@JoinColumn(name="ProjectID")})

	public Set<Project> getProjects() {
		return this.Projects;
	}
	public void setProjects(Set<Project> projects) {
		this.Projects = projects;
	}
}
