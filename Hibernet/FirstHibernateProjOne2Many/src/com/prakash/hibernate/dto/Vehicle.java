package com.prakash.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private UserDetails users;
	
	public UserDetails getUsers() {
		return users;
	}
	public void setUsers(UserDetails users) {
		this.users = users;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	

}
