package com.jurimik.model.person;

public class Employee extends Person {
	
	private String position;

	public Employee(String firstName, String lastName, String phone, String position) {
		super(firstName, lastName, phone);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
