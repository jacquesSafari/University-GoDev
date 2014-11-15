package com.godev.pickmeapp.model;


import javax.jdo.annotations.Persistent;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;





@Entity
@DiscriminatorValue("0")
public class Driver extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Driver(String _name, String _userName, String _email,
			String _password, String _phoneNumber, String _taxiID, String _town, String _startingTime, String _closingTime) {
		super(_name, _userName, _email, _password, _phoneNumber);
		this.setClosingTime(_closingTime);
		this.setStartingTime(_startingTime);
		this.setTaxiID(_taxiID);
		this.setTown(_town);
	}

	@Persistent
	private Long companyID;
	
	@Persistent
	private String taxiID;
	
	@Persistent
	private String town;
	
	@Persistent
	private String startingTime;
	
	@Persistent
	private String closingTime;
	

	public void setTown(String town) {
		this.town = town;
	}
	public void setTaxiID(String taxiID) {
		this.taxiID = taxiID;
	}
	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}
	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}
	public String getTaxiID() {
		return taxiID;
	}
	public String getTown() {
		return town;
	}
	public String getStartingTime() {
		return startingTime;
	}
	public String getClosingTime() {
		return closingTime;
	}
	
}
