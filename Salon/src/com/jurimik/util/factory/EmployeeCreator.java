package com.jurimik.util.factory;

import com.jurimik.builder.PersonBuilder;
import com.jurimik.model.person.Employee;
import com.jurimik.model.person.Person;

public class EmployeeCreator extends PersonFactory {

	@Override
	public Person factoryMethod(PersonBuilder builder) {
		Employee employee = new Employee(builder);
		employee.setPhone(builder.getPhone());
//		employee.setPosition(builder.getPosition());
		return employee;
	}

}
