package com.obydul.method.reference.instance;

public class StringUtils {
	public boolean isNotEmpty(String value) {
		return value != null && value.length() > 0;
	}

	public boolean isEmpty(String value) {
		return !isNotEmpty(value);
	}
	
	public boolean hasSpecialCharacter(String value) {
		return value.chars().map(op -> op).allMatch(Character::isAlphabetic);
	}

}
