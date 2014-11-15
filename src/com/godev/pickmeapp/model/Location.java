package com.godev.pickmeapp.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Location implements Serializable{

	/**
	 * This class stores information about location of both driver and user.
	 */
	private static final long serialVersionUID = 1613185426605163617L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long locationID;
	
	@Persistent
	private String longitude;
	
	@Persistent
	private String latitude;
	
	@Persistent
	private Date time;
	
	public Location(String _longitude, String _latitude, Date _time) {
		
		this.setLatitude(_latitude);
		this.setLongitude(_longitude);
		this.setTime(_time);
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public Long getLocationID() {
		return locationID;
	}
	
	
	
}
