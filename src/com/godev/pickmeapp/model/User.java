package com.godev.pickmeapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/*@PersistenceCapable
@DiscriminatorColumn(name="id")
@DiscriminatorValue("0")
@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)**/
@Entity
@DiscriminatorValue("1")
public class User extends Person{

	@Persistent
	private Date dob;
	
	@Persistent
	private Date registrationDate;
	
	
	public User(String _name, String _userName, String _email,
			String _password, String _phoneNumber, Date _dob, Date _registrationDate) {
		super(_name, _userName, _email, _password, _phoneNumber);
		
		this.setDob(_dob);
		this.setRegistrationDate(_registrationDate);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 817738226531085827L;
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public Date getDob() {
		return dob;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	

}
