package Com.shahrukh.hibernate.FirstProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "h1_employee")
// this is a POJO class
public class Employee {
	
	@Id
	@Column(name = "EMPID")
	int empId;
	
	@Column(name = "NAME")
	String empName;
	
	@Column(name = "DEPARTMENT")
	String department;
	
	@Column(name = "DESIGNATION")
	String designation;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
//	The primary reason to use a constructor with arguments is to initialize the object's fields (or properties) with 
//	specific values when the object is created. Instead of calling setter methods individually after creating the object, 
//	a constructor with arguments allows you to provide all necessary values at the time of object creation.
	public Employee(int empId, String empName, String department, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.designation = designation;
	}
	
	
	
//	super() Call:
//		The super() call is an explicit call to the no-argument constructor of the superclass. 
//		Every class in Java implicitly or explicitly extends Object, 
//		so super() refers to the constructor of the direct superclass.
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
