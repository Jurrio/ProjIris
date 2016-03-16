package com.jurimik.util.factory;

import com.jurimik.model.person.Client;
import com.jurimik.model.person.Person;

public class ClientCreator extends PersonFactory {

	@Override
	public Person factoryMethod(String fName, String lName) {
		return new Client(fName, lName);
	}

}
