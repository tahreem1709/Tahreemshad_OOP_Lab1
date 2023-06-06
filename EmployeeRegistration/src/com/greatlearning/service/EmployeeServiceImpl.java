package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String generateuserEmail(String fName, String lName, String departmentName) {
		return fName + lName + "@" + departmentName +"."+"gl.com";
	}

	@Override
	public String password() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splChar="!@#$%^&*()";
		String combined=caps+lower+nums+splChar;
		System.out.println(combined.length());//72
		String genPass="";
		Random random=new Random();
		
		for(int i=1;i<=8;i++) {
			
			genPass +=String.valueOf(combined.charAt(random.nextInt(combined.length())));
			
		}
		return genPass;
	}
	
	@Override
	public String displayEmployeeDetails(Employee e1) {
		System.out.println("Employee First Name is: "+e1.getfName());
		System.out.println("Employee Last Name is: "+e1.getlName());
		System.out.println("Employee Email Id is: "+e1.getUserEmail());
		System.out.println("Employee Password is: "+e1.getPassword());
		return null;
	}

	

}
