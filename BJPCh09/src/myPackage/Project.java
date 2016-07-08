package myPackage;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
	// Class variables
	private int ProjectID;
	private String ProjectName;
	// Constructor
	public Project(int projectID, String projectName) {
		// Get the methods of the parent class
		super();
		this.ProjectID = projectID;
		this.ProjectName = projectName;
	}
	@Id
	public int getProjectID() {
		return ProjectID;
	}
	public void setProjectID( int projectID ) {
		this.ProjectID = projectID;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName( String projectName ) {
		this.ProjectName = projectName;
	}
}
