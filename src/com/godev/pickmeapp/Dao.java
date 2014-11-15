package com.godev.pickmeapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.godev.pickmeapp.model.Driver;
import com.godev.pickmeapp.model.Person;


public enum Dao {
	INSTANCE;
	
	public List<Driver> listDrivers(){
		EntityManager em= EMF.getEmfinstance().createEntityManager();
		
		Query myquery=em.createQuery("select d from Driver d",Driver.class);
		
		List<Driver> drivers=myquery.getResultList();
		
		return drivers;
	}
	
	public void add(String name, String email, String userName,String password,String phoneNumber,String taxiID, String town,String startingTime, String closingTime){
		synchronized(this){
			EntityManager em= EMF.getEmfinstance().createEntityManager();
			Driver driver=new Driver(name, userName, email, password, phoneNumber, taxiID, town, startingTime, closingTime);
					//(name, userName, email, "FDSKFJ3", "0000000010");
			em.persist(driver);
			em.close();
		}
	}
	
	public void remove(Long personID){
		
		EntityManager em= EMF.getEmfinstance().createEntityManager();
		try{
			Driver driver=em.find(Driver.class, personID);
			em.remove(driver);
		}catch(Exception e){
			
		}finally{
			em.close();
		}
	}
}
