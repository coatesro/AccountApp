package com.qa.app;


public class AccountApp 
{

	int id;
	String firstName;
	String lastName;
	int accountNum;
	
	
	public void setID(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAccountNumber(int accountNum) {
		this.accountNum = accountNum;
	}

	public int getID() {
		
		return id;
	}

	public String getFirstName() {
		
		return firstName;
	}

	public String getLastName() {
		
		return lastName;
	}

	public int getAccountNumber() {
		
		return accountNum;
	}


}
