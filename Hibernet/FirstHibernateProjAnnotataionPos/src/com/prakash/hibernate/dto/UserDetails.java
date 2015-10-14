package com.prakash.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="User_Details")
public class UserDetails {
	
	private int userId;
	
	private String userName;
	
	@Id 
	@Column (name="User_Id")
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	// Getting the details from getter instead of the user value
	@Column (name = "User_Name")
	public String getUserName() {
		return userName + " from getter";
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
