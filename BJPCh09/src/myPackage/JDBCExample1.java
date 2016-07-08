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
		
	}
}
