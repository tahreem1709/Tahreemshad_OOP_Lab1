package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService {
	String generateuserEmail(String fName,String lName, String departmentName);
	String password();
	String displayEmployeeDetails(Employee e1);

}
