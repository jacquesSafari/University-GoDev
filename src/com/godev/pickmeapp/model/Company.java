package com.godev.pickmeapp.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.Element;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Company implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long companyID;
	
	@Persistent
	private String name;
	
	@Persistent
	private String registrationNumber;
	
	@Persistent
	private String VAT;
	
	@Persistent
	private String login;
	
	@Persistent
	private String password;
	
/**	@Persistent 
	private List<Driver> taxiDriversList = new ArrayList<Driver>();**/
	
	public Company(String _name, String _VAT, String _registrationNumber, String login, String password) {
		this.setLogin(login);
		this.setName(_name);
		this.setPassword(password);
		this.setRegistrationNumber(_registrationNumber);
		this.setVAT(_VAT);
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public void setVAT(String vAT) {
		VAT = vAT;
	}
	
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public String getVAT() {
		return VAT;
	}
	public Long getCompanyID() {
		return companyID;
	}
	
/**
	public void addTaxiDriver(Driver _driver){
		this.getTaxiDriversList().add(_driver);
	}
	
	public List<Driver> getTaxiDriversList() {
		return taxiDriversList;
	}**/
}
