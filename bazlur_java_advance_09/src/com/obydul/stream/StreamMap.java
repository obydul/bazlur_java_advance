package com.obydul.stream;

import java.util.stream.Stream;

public class StreamMap {
	enum Sex {
		MALE, FEMALE
	}

	private int age;
	private String name;
	private Sex sex;

	public StreamMap(int age, String name, Sex sex) {
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
		Stream<StreamMap> personStream = Stream.of(new StreamMap(14, "Obydul", Sex.MALE),
				new StreamMap(16, "Moyna", Sex.FEMALE), new StreamMap(18, "Abdullah", Sex.MALE));
		//Stream<StreamMap> personOlderThan15 = personStream.filter(p -> 15 < p.getAge());
		//personOlderThan15.forEach(p -> System.out.print(p + " "));
		//System.out.println();
		
		//Stream<String> nameStream = personOlderThan15.map(p -> p.getName());
		//nameStream.forEach(name -> System.out.print(name+" "));
		//System.out.println();
		
		personStream.filter(p -> 15 < p.getAge())
		.map(p -> p.getName())
		.forEach(name -> System.out.print(name+" "));
		System.out.println();
	}

}
