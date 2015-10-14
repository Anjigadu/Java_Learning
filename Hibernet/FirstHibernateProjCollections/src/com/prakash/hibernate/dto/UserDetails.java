package com.prakash.hibernate.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "User_Details")
public class UserDetails {
	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
//	@Embedded
//	private Address address;

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ElementCollection
	private Set<Address> listOfAddress = new HashSet();
	
	public Set<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Set<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
