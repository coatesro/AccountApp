package com.qa.app;

import java.util.HashMap;

public interface AccountRepositoryMap {

	public HashMap<Integer, AccountApp> map = new HashMap<Integer, AccountApp>();
	
	public void add(AccountApp account);
	public AccountApp retrieve(int id);
	public void updateFirstName(int id, String firstName);
	public void remove(int id);

}
