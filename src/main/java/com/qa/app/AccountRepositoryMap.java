package com.qa.app;

import java.util.HashMap;

public class AccountRepositoryMap {

	public HashMap<Integer, AccountApp> map = new HashMap<Integer, AccountApp>();
	
	public void add(AccountApp account) {
		map.put(account.getID(), account);
		
	}
	public AccountApp retrieve(Integer id) {
		return map.get(id);
	}

}
