package com.jurimik.util;

import com.jurimik.enums.Role;

public class Parser {

	public static boolean parseBoolean(String param) {
		return param != null;
	}

	public static Role parseRole(String role) {
		return Role.valueOf(role.toUpperCase());
	}

}
