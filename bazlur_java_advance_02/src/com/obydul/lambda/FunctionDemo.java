package com.obydul.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.obydul.lambda.Student.Gender;

public class FunctionDemo {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Abdullah", 1, Gender.MALE),
				new Student("Salman", 2, Gender.MALE),
				new Student("Roman", 9, Gender.MALE),
				new Student("Jihad", 14, Gender.MALE),
				new Student("ABC", 25, Gender.FEMALE)
				);
		
		Function<Student, String> nameFunc = (Student s) -> s.getName();
		Function<Student, String> ageFunc = (Student s) -> String.valueOf(s.getAge());
		Function<Student, String> genderFunc = (Student s) -> s.getGender().toString();
		
		StudentProcess process = new StudentProcess();
		List<String> name = process.process(students, nameFunc);
		List<String> age = process.process(students, ageFunc);
		List<String> gender = process.process(students, genderFunc);
		
		//Predicate<Student> olderThan20 = (Student s) -> s.getAge() > 20;
		//Predicate<Student> femaleOnly = (Student s) -> s.getGender().FEMALE;
		
		List<Student> studentOlderThan20 = process.filter(students, s -> s.getAge() > 20);
		
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("gender : "+gender);
		System.out.println("studentOlderThan20 : "+studentOlderThan20);
		
	}
}
