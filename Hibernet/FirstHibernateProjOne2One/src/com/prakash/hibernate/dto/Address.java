package com.prakash.hibernate.dto;

import javax.persistence.Embeddable;
import javax.persistence.*;


@Embeddable
public class Address {
	@Column(name="Street_Name")
	private String street;
	@Column(name="City_Name")
	private String city;
	@Column(name="State_Name")
	private String state;
	@Column(name="PinCode_Name")
	private String pincode;
	
	
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String i) {
		this.pincode = i;
	}


}
