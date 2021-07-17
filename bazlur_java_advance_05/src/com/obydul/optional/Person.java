package com.obydul.optional;

import java.util.Optional;

public class Person {
	private Optional<SmartPhone> smartPhone;

	public Optional<SmartPhone> getSmartPhone() {
		return smartPhone;
	}

	Optional<Person> person = Optional.ofNullable(findPerson());

	public static Person findPerson() {
		return null;
	}

}
