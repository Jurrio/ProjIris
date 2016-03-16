package com.jurimik.util.factory;

import com.jurimik.builder.PersonBuilder;
import com.jurimik.model.person.Person;

public abstract class PersonFactory {
	public abstract Person factoryMethod(PersonBuilder builder);
}
