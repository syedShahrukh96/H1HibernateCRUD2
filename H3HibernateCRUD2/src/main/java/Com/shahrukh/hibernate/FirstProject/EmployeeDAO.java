package Com.shahrukh.hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	
	SessionFactory factory;
	
	
	public EmployeeDAO() {
		//Loads Hibernate settings from hibernate.cfg.xml
		Configuration cfg = new  Configuration().configure();
		//Creates a SessionFactory, which manages database connections
		factory = cfg.buildSessionFactory();
	}
	
	//insert method
	public String insertEmployee(Employee employee) {
		
		
		Session session = factory.openSession();
		//Starts a transaction to group operations together
		Transaction tx = session.beginTransaction();
		//Creates a new Employee object with the given details
		
		//Saves the Employee object to the database.
		session.persist(employee);
		System.out.println("Record inserted  successfully");
		//Commits the transaction, making the changes (insert) permanent.
		tx.commit();
		//Closes the session to release resources.
		session.close();
		
		return "Inserted data";
	}
	
	//update method
	public String updateEmployee(Employee employee) {
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		//to update use merge
		session.merge(employee);
		System.out.println("Record inserted  successfully");
		//Commits the transaction, making the changes (insert) permanent.
		tx.commit();
		//Closes the session to release resources.
		session.close();
		
		return "updated successfully";
	}
	
	//get data
	public Employee getEmployee(int empId) {
		Session session = factory.openSession();
		Employee emp = new Employee();
		emp = session.get(Employee.class, empId);
		session.close();
		return emp;
	}
	
	
	//update method
	public String deleteEmployee(int empId) {
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpId(empId);
		//to update use merge
		session.remove(emp);
		System.out.println("Record inserted  successfully");
		//Commits the transaction, making the changes (insert) permanent.
		tx.commit();
		//Closes the session to release resources.
		session.close();
		
		return "deleted successfully";
	}

}
