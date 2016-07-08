package myPackage;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
// DEPRECATED import org.hibernate.Query;
import org.hibernate.query.Query;
import java.util.List;

public class myDBApp {
	public static void main(String[] args) {
		// Create a new employee and store in MySQL
		Employee employee = new Employee();
		employee.setEmployeeName("Hibernate Dude");
		employee.setEmployeeGender("Male");
		employee.setEmployeeID(8);
		employee.setDepartmentID(1);
		// Create a new SessionFactory
		SessionFactory sessionFactory = 
			new Configuration().configure().buildSessionFactory();
		// Create a new Session
		Session session = sessionFactory.openSession();
		// Save employee data to MySQL
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		// Retrieve employee data from MySQL		
		List<?> list = session.createQuery("from Employee where EmployeeID = 8").getResultList();
		Employee employeeFound = (Employee) list.get(0);
		System.out.println(employeeFound.getEmployeeID());
		System.out.println(employeeFound.getEmployeeName());
		System.out.println(employeeFound.getEmployeeGender());
		System.out.println(employeeFound.getDepartmentID());
		session.close();
		sessionFactory.close();
	}
}
