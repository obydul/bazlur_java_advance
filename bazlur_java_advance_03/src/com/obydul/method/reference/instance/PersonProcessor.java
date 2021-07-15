package com.obydul.method.reference.instance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonProcessor {
	public static void forEach(List<Person> persons, Consumer<Person> func) {
		for (Person person : persons) {
			func.accept(person);
		}
	}
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Md", 31, "md@gmail.com"),
				new Person("Obydul", 31, "obydul@gmail.com"),
				new Person("Islam", 31, "islam@gmail.com"));
		
		forEach(persons, person -> person.sendEmail());
	}

}
