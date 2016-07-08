package myPackage;

import java.sql.*;
import java.util.*;

public class JDBCExample2 {
	public static void main(String[] args) {
		int DepartmentID = 0;
		Boolean useSSL = false;
		// Load the JDBC driver
		try {
			System.out.println("Loading JDBC driver...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver successfully loaded!");
		} catch(ClassNotFoundException cnfe) {
			throw new RuntimeException(cnfe);
		}
		// Facilitate keyboard input
		Scanner keyboard = new Scanner(System.in);
		try {
			// Obtain the department ID
			System.out.println("Please enter the department ID: ");
			DepartmentID = keyboard.nextInt();
		} catch(InputMismatchException ime) {
			System.out.println("Incorrect input");
		}
		// Connect via JDBC to the database
		String url = "jdbc:mysql://localhost:3306/employeeschema?useSSL=" + useSSL.toString();
		String username = "root";
		String password = "root";
		String query = "select e.EmployeeName, e.EmployeeGender, e.DepartmentID"
				+ " from employee e"
				+ " where e.DepartmentID=?";
		Connection connection = null;
		Statement stmt = null;
		try {
			System.out.println("Connecting to the MySQL Database ...");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("MySQL Database connected!");
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			// Set first (and only) input parameter from keyboard to the DepartmentID attribute
			preparedStatement.setInt(1, DepartmentID);
			// Execute the query
			ResultSet rs = preparedStatement.executeQuery();
			// Check for empty result set
			if( !rs.isBeforeFirst() ) { 
				System.out.println("No records found");
			}
			// Process the result set
			while(rs.next()) {
				// Print first attribute (e.g. EmployeeName)
				System.out.print(rs.getString(1));
				System.out.print("\t");
				// Print second attribute (e.g. EmployeeGender)
				System.out.print(rs.getString(2));
				System.out.print("\t");
				// Print third attribute (e.g. DepartmentID)
				System.out.print(rs.getString(3));				
				System.out.print("\n");
			}
			// Close the database connection
			preparedStatement.close();
		} catch(SQLException sqle) {
			System.out.println("sqle.toString()");
		} finally {
			// Close the connection if not already closed
			System.out.println("Closing the connection.");
			if(connection != null){
				try {
					connection.close();
				} catch(SQLException ignore) {
					// ignore
				}
			}
		}
	}
}
