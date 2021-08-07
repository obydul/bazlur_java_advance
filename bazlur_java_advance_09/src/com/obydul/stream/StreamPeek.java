package com.obydul.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.obydul.stream.Person.Sex;
import static java.util.Comparator.*;

public class StreamPeek {
	public static void main(String[] args) {
		List<Person> personList = List.of(new Person(14, "Obydul", Sex.MALE), new Person(16, "Moyna", Sex.FEMALE),
				new Person(18, "Abdullah", Sex.MALE), new Person(18, "Shafi-Allah", Sex.MALE),
				new Person(18, "Habibullah", Sex.MALE), new Person(0, null, null));

		personList.stream()
				.peek(person -> System.out.println("before filter : " + person.getAge() + " : " + person.getName()))
				.filter(person -> 15 < person.getAge())
				.peek(person -> System.out.println("after filter : " + person.getAge() + " : " + person.getName()))
				.sorted((comparing(Person::getName))).collect(Collectors.toList());

	}

}
