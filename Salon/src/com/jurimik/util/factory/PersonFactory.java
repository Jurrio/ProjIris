package com.jurimik.util.factory;

import com.jurimik.model.person.Person;

public abstract class PersonFactory {
	public abstract Person factoryMethod(String fName, String lName);
}
