package com.qa.accountTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.app.AccountApp;
import com.qa.app.AccountRepositoryMap;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AccountTest 
    
{
			
	@Test
	public void createID() {
		AccountApp account = new AccountApp();
		account.setID(0);
		int id = account.getID();
		assertEquals("wrong id", 0, id);
	}
	
	@Test
	public void createFirstName() {
		AccountApp account = new AccountApp();
		account.setFirstName("Chris");
		String firstName = account.getFirstName();
		assertEquals("wrong first name","Chris", firstName);
	}
	
	@Test
	public void createLastName() {
		AccountApp account = new AccountApp();
		account.setLastName("Perrins");
		String lastName = account.getLastName();
		assertEquals("wrong last name","Perrins", lastName);
		}
	
	@Test
	public void createAccountNumber() {
		AccountApp account = new AccountApp();
		account.setAccountNumber(3);
		int accountNum = account.getAccountNumber();
		assertEquals("wrong account number",3, accountNum);
		}
	
	
	@Test
	public void accountRepositoryMapTest() {
		AccountRepositoryMap arm = new AccountRepositoryMap();
		AccountApp a = new AccountApp();
		int id = 2;
		a.setID(id);
		a.setFirstName("Chris");
		arm.add(a);
		AccountApp retreive = arm.retrieve(id);
		assertEquals("wrong account retreived", "Chris", retreive.getFirstName());
		assertEquals("wrong account", a, retreive);
	}
	
}
