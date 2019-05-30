package com.qa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountApp 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE) 
	private int id;
	private String firstName;
	private String lastName;
	private int accountNum;
	
//	public AccountApp(int id, String firstName, String lastName, int accountNum) {
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.accountNum = accountNum;
//	}
	
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
