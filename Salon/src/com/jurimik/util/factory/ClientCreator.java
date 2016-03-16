package com.jurimik.util.factory;

import com.jurimik.builder.PersonBuilder;
import com.jurimik.model.person.Client;
import com.jurimik.model.person.Person;

public class ClientCreator extends PersonFactory {

	@Override
	public Person factoryMethod(PersonBuilder builder) {
		Client client = new Client(builder);
		client.setPhone(builder.getPhone());
		client.setCartNumber(builder.getCard());
		return client;
	}

}
