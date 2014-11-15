package com.godev.pickmeapp.model;

import java.io.Serializable;



import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@DiscriminatorColumn(name="personType", discriminatorType = DiscriminatorType.INTEGER)
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3542455883643834555L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long personID;
	
	private String name;
	private String userName;
	private String email;
	private String password;
	private String phoneNumber;
	/**
	@Persistent(mappedBy="Person")
	@Element(dependent="true")
	private List<Location> locationsList= new ArrayList<Location>();
	*/
	public Person(String _name, String _userName, String _email, String _password, String _phoneNumber) {
		this.setName(_name);
		this.setUserName(_userName);
		this.setEmail(_email);
		this.setPassword(_password);
		this.setPhoneNumber(_phoneNumber);
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public long getPersonID() {
		return personID;
	}
	
	/**
	public List<Location> getLocationsList() {
		return locationsList;
	}
	
	public void addLocation(Location _location){
		this.getLocationsList().add(_location);
	}
	
	/*@PersistenceCapable
@DiscriminatorColumn(name="id")
@DiscriminatorValue("0")
@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
	**/
}
