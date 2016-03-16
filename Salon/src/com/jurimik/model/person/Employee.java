package com.jurimik.model.person;

import com.jurimik.builder.PersonBuilder;

public class Employee extends Person {
	
	private String position;

	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}

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
		return "Employee " + getFirstName() + " " + getLastName() + ". Posonition: " + position +
				", phone: " + getPhone();
	}

}
