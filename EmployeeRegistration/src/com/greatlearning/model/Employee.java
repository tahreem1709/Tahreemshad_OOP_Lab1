package com.greatlearning.model;

public class Employee {
	
	private String fName;
	private String lName;
	private String userEmail;
	private String password;
	public Employee() {};
	public Employee(String fname, String lName, String userEmail, String password) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.userEmail = userEmail;
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setFname(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
