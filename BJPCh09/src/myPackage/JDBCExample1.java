package myPackage;

import java.sql.*;

public class JDBCExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("Loading JDBC driver ...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("JDBC driver successfully loaded!");
		} catch(ClassNotFoundException cnfe){
			throw new RuntimeException(cnfe);
		}
		Boolean useSSL = false;
		String url = "jdbc:mysql://localhost:3306/employeeschema?useSSL=" + useSSL.toString();
		String username = "root";
		String password = "root";
		String query = "select e.EmployeeName, d.DepartmentName"
				+ " from employee e, department d"
				+ " where e.DepartmentID = d.DepartmentID;";
		Connection connection = null;
		Statement stmt = null;
		// Execute the query
		try {
			System.out.println("Connecting to the MySQL Database...");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("MySQL Database connected!");
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			// Loop through the result set
			while(rs.next()){
				// Print the first attribute (e.g. EmployeeName)
				System.out.print(rs.getString(1));
				System.out.print("\t\t");
				// Print the second attribute (e.g. DepartmentName)
				System.out.print(rs.getString(2));
				System.out.print("\n");
			}
			stmt.close();
		} catch(SQLException sqle) {
			System.out.println(sqle.toString());
		} finally{
			System.out.println("Closing the connection.");
			if(connection != null) {
				try {
					connection.close();
				} catch(SQLException ignore) {
					// ignore
				}
			}
		};
	}
}
