package com.jurimik.builder;

import com.jurimik.enums.Role;
import com.jurimik.model.person.Person;
import com.jurimik.util.factory.ClientCreator;
import com.jurimik.util.factory.EmployeeCreator;

public class PersonBuilder {
	private Role role;
	private final String firstName;
	private final String lastName;
	private String phone;
	private String card;
//	private String position;
	public PersonBuilder(String role, String firstName, String lastName) {
		this.role = Role.valueOf(role.toUpperCase());
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public PersonBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}
	public PersonBuilder card(String card) {
		this.card = card;
		return this;
	}
	
	public Role getRole() {
		return role;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhone() {
		return phone;
	}
	public String getCard() {
		return card;
	}
	
	public Person build() {
		if (role == Role.CLIENT)
			return new ClientCreator().factoryMethod(this);
		else if (role == Role.EMPLOYEE) {
			return new EmployeeCreator().factoryMethod(this);
		}
		return null;
	}
	
}
