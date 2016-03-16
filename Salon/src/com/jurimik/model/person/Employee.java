package com.jurimik.model.person;

public class Employee extends Person {
	
	private String position;

	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
