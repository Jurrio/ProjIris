package com.jurimik.service;

import java.util.List;

import com.jurimik.dao.PersonRepository;
import com.jurimik.model.person.Person;

public class PersonService {
	public static boolean add(Person person){
		return PersonRepository.add(person);
	}
	@Deprecated
	public static Person find(int id) {
		return PersonRepository.getById(id);
	}
	
	public static List<Person> find(String searchValue) {
		return PersonRepository.find(searchValue);
	}
	
	public static List<Person> getAll() {
		return PersonRepository.getAll();
	}
	
	public static boolean delete(int id) {
		return PersonRepository.delete(id);
	}
}
