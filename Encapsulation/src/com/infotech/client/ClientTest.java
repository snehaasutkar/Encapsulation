package com.infotech.client;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class ClientTest {
public static void main(String[] args) {
	
	EmployeeDAO employeeDAO=new EmployeeDAO();
	//employeeDAO.getEmployeeById("EMP001");

	Employee employee=employeeDAO.getEmployeeData("EMP001");
	System.out.println(employee.getEmpId()+"\t"+employee.getFullName()+"\t"+ employee.getAge());
	Employee employee1=employeeDAO.getEmployeeData("EMP002");
	System.out.println(employee1.getEmpId()+"\t"+employee1.getFullName()+"\t"+ employee1.getAge());
	
	
}
}
