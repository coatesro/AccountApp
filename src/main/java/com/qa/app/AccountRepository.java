package com.qa.app;

public interface AccountRepository 
{
	
	public void add(AccountApp account);
	public AccountApp retrieve(int id);

}
