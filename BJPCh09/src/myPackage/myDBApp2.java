package myPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class myDBApp2 {
	public static void main(String[] args) {
		// Variables
		Set<Project> projects = new HashSet<Project>();
		// Add projects
		projects.add(new Project(1, "Hibernate Basic Project"));
		projects.add(new Project(2, "Hibernate Many to Many Project"));
		// Add employee
		Employee employee = new Employee(9, "Hibernate Freak", "Male", 1, projects);
		// Create SessionFactory
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		// Create Session
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		// Close Session and SessionFactory
		session.close();
		sessionFactory.close();
	}

}
