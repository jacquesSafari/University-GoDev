package com.godev.pickmeapp.model;

import javax.jdo.PersistenceManagerFactory;
import javax.jdo.JDOHelper;

public final class PersistenceManager {
	private static final PersistenceManagerFactory persistenceManagerFatoryInstance=JDOHelper.getPersistenceManagerFactory("transactions-optional");

	public PersistenceManager() {
		// TODO Auto-generated constructor stub
	}
	
	public static PersistenceManagerFactory getPersistencemanagerfatoryinstance() {
		return persistenceManagerFatoryInstance;
	}
}
