package com.qa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountRepositoryDB implements AccountRepositoryMap {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void add(AccountApp account) {
		et.begin();
		em.persist(account);
		et.commit();
	}

	public AccountApp retrieve(int id) {
		return em.find(AccountApp.class, id);
		
	}

	public void updateFirstName(int id, String firstName) {
		et.begin();
		AccountApp account = retrieve(id);
		account.setFirstName(firstName);
		et.commit();
		
	}

	public void remove(int id) {
		et.begin();
		AccountApp acc = retrieve(id);
		em.remove(acc);
		et.commit();
		
		
	}

}
