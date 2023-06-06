package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImpl;

public class DriverApp {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter First Name");
		String fName=in.next();
		System.out.println("Enter Last Name");
		String lName=in.next();
		
		Employee emp=new Employee();
		emp.setFname(fName);
		emp.setlName(lName);
		EmployeeServiceImpl esi=new EmployeeServiceImpl();
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HR");
		System.out.println("4.Legal");
		
		System.out.println("Enter Your Choice");
		int choice=in.nextInt();
		String generatedEmail="";
		String generatedPswd="";
		switch(choice)
		{
		  case 1:generatedEmail= esi.generateuserEmail(emp.getfName(), emp.getlName(), "tech");
				break;
		  case 2: generatedEmail=esi.generateuserEmail(emp.getfName(), emp.getlName(), "admin");
				break;
		  case 3:generatedEmail= esi.generateuserEmail(emp.getfName(), emp.getlName(), "hr");
				break;
		  case 4:generatedEmail= esi.generateuserEmail(emp.getfName(), emp.getlName(), "legal");
				break;
		  default: System.out.println("Please Enter Valid Input ");
				
			
		}
		generatedPswd=esi.password();
		emp.setUserEmail(generatedEmail);
		emp.setPassword(generatedPswd);
		esi.displayEmployeeDetails(emp);
		
		
		}
		}
	


