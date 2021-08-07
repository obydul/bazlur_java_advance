package com.obydul.stream;

import java.util.Comparator;
import java.util.List;

public class Person {
	enum Sex {
		MALE, FEMALE
	}

	private int age;
	private String name;
	private Sex sex;

	public Person(int age, String name, Sex sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "age = " + age + ", name = " + name + ", sex = " + sex;
	}

	public static void main(String[] args) {
		List<Person> personList = List.of(new Person(14, "Obydul", Sex.MALE), new Person(16, "Moyna", Sex.FEMALE),
				new Person(18, "Abdullah", Sex.MALE), new Person(18, "Shafi-Allah", Sex.MALE), new Person(18, "Habibullah", Sex.MALE),
				new Person(0,null,null));

		// 1st step
		/*
		 * personList.stream() .sorted((p1, p2) -> { if (p1.getAge() > p2.getAge()) {
		 * return 1; } else if (p1.getAge() < p2.getAge()) { return -1; } else { return
		 * p1.getName().compareTo(p2.getName()); } }).forEach(person ->
		 * System.out.println(person.getAge() +" "+person.getName()));
		 */

		// step 2
		//personList.stream().sorted((p1, p2) -> compareByAgeAndThenName(p1, p2)).forEach(person -> printPerson(person));

		// step 3
		//personList.stream().sorted(Person::compareByAgeAndThenName)
		//.forEach(Person::printPerson);
		
		// step 4
		personList.stream()
		.sorted(Comparator.nullsLast(Comparator.comparing(Person::getAge).reversed()).thenComparing(
				Comparator.nullsLast(Comparator.comparing(Person::getName))))
		.forEach(Person::printPerson);
		
	}

	static int compareByAgeAndThenName(Person p1, Person p2) {
		if (p1.getAge() > p2.getAge()) {
			return 1;
		} else if (p1.getAge() < p2.getAge()) {
			return -1;
		} else {
			return p1.getName().compareTo(p2.getName());
		}
	}

	static void printPerson(Person person) {
		System.out.println(person.getAge() + " " + person.getName());
	}

}
