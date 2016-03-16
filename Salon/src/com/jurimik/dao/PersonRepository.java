package com.jurimik.dao;

import java.util.ArrayList;
import java.util.List;

import com.jurimik.model.person.Person;

public class PersonRepository {
	private static List<Person> personList = new ArrayList<>();
	private static int id = 0;
	
	public static boolean add(Person person) {
		if (personList.contains(person)) return false;
		person.setId(nextId());
		personList.add(person);
		return true;
	}
	
	public static Person getById(int id) {
		for (Person person : personList) {
			if (id == person.getId()) return person;
		}
		return null;
	}
	
	public static List<Person> getAll(){
		return personList;
	}
	
	public static boolean delete(int id) {
		for (Person person : personList) {
			if (id == person.getId()) {
				personList.remove(person);
				return true;
			}
		}
		return false;
	}
	
	private static int nextId() {
		//emulation auto-increment
		return ++id;
	}
}
