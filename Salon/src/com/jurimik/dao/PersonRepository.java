package com.jurimik.dao;

import java.util.ArrayList;
import java.util.List;

import com.jurimik.model.person.Person;

public class PersonRepository {
	private static List<Person> personList = new ArrayList<>();
	private static int id = 0;
	
	public static boolean add(Person person) {
		person.setId(nextId());
		personList.add(person);
		return personList.contains(person);
	}
	
	@Deprecated
	public static Person getById(int id) {
		for (Person person : personList) {
			if (id == person.getId()) return person;
		}
		return null;
	}
	
	public static List<Person> find (String searchValue) {
		List<Person> resultList = new ArrayList<>();
		for (Person person : personList) {
			String[] values = person.toString().split(" ");
			for (String s : values) {
				if (searchValue.equals(s)) {
					resultList.add(person);
					break;
				}
			}
		}
		return resultList;
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
