package com.obydul.lambda;

public class Person {
	private String name;
	private int age;
	private String emailAddress;
	
	public Person(String name, int age, String emailAddress) {
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	

}
