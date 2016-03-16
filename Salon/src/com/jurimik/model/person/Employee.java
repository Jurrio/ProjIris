package com.jurimik.model.person;

import com.jurimik.builder.PersonBuilder;

public class Employee extends Person {
	
	private String position;

	public Employee(PersonBuilder builder) {
		super(builder);
		this.position = builder.getPosition();
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee " + super.toString() + ", position: " + position;
	}

}
