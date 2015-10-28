package com.prakash.spring;

public class Circle { 
	
	private String type;
	private int diameter;
	
	
	
	Circle (String type, int diameter){
		this.type = type;
		this.diameter = diameter;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getDiameter() {
		return diameter;
	}
	
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public void draw(){
		System.out.println("This is a " + type);				
		System.out.println("Height = " + diameter);
	}
	

}
