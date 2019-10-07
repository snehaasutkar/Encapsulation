package com.infotech.dao;

import java.util.ArrayList;
import java.util.List;

import com.infotech.model.Employee;



public class EmployeeDAO {
	private static List<Employee>empList=null;
	static {
		empList=new ArrayList<Employee>();
		Employee e1= new Employee();
		e1.setEmpId("EMP001");
		e1.setFirstName("Sneha");
		e1.setLastName("Asutkar");
		e1.setAge(25);
		
		Employee e2=new Employee();
		e2.setEmpId("EMP002");
		e2.setFirstName("Priyanka");
		e2.setLastName("Adawle");
		e2.setAge(22);
		
		empList.add(e1);
		empList.add(e2);
		
	}
	public Employee getEmployeeData(String EmpId) {
	System.out.println("Going to data base to get Employee Data");	
	//goes to dummy method rather than db
	Employee employee=getEmployeeById(EmpId);
	//employee.age=10;
	
	String fullName=getfullName(employee.getFirstName(),employee.getLastName());
	employee.setFullName(fullName);
	return employee;
	
	}
	//private method for concatenate first and last name
	

	private String getfullName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		
		return firstName+" "+ lastName;
	}
	private Employee getEmployeeById(String empId) {
		for (Employee emp:empList) {
			if (emp.getEmpId().equalsIgnoreCase(empId)) {
				return emp;
				
			}
		}
		return null;
	
	}
	
	

}
