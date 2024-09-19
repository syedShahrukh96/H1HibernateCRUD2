package Com.shahrukh.hibernate.FirstProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    	String response = null;
    	EmployeeDAO dao = new EmployeeDAO();
    	
		/*
		 * //insert
		 * 
		 * Employee emp = new Employee(103,"RK", "swimming pool"," Artist"); response =
		 * dao.insertEmployee(emp); System.out.println(response);
		 */
    		
		/*
		 * //update Employee emp = new Employee(102,"Manish", "Accounts", "Manager");
		 * response = dao.updateEmployee(emp); 
		 * System.out.println(response);
		 */
    	
    	
		/*
		 * //get Employee emp = dao.getEmployee(103);
		 * System.out.println("data is "+emp);
		 */

		  
		  //to delete the row
		  response = dao.deleteEmployee(103);
		  System.out.println(response);
		  
    	
    	
    	
    }
}
