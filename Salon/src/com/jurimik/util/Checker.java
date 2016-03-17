package com.jurimik.util;

import com.jurimik.model.person.Person;
import com.jurimik.model.person.Client;
import com.jurimik.model.person.Employee;

public class Checker {
	public static boolean isPrint(Person person, boolean showClients, boolean showEmployees) {
		if (person instanceof Client && showClients) 
			return true;
		if (person instanceof Employee && showEmployees)
			return true;
		return false;
	}
}
