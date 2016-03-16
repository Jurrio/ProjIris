package com.jurimik.model.person;

import com.jurimik.builder.PersonBuilder;

public abstract class Person {
	
	private int id;
	private String firstName;
    private String lastName;
    private String phone;
    
    public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
    public Person(PersonBuilder builder) {
    	this.firstName = builder.getFirstName();
    	this.lastName = builder.getLastName();
    	this.phone = builder.getPhone();
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
}
