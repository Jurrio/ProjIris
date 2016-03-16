package com.jurimik.util.factory;

import com.jurimik.model.person.Employee;
import com.jurimik.model.person.Person;

public class EmployeeCreator extends PersonFactory {

	@Override
	public Person factoryMethod(String fName, String lName) {
		return new Employee(fName, lName);
	}

}
