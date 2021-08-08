package com.obydul.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Employee {
	private long id;
	private String name;
	public Employee(long id, String name) {
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return  id + " : " + name;
	}
	
	public static void main(String[] args) {

		List<Employee> employees = List.of(
				new Employee(11, "Obydul"),
				new Employee(22, "Islam"),
				new Employee(12, "Moyna")
				);
		
		
		Optional<Employee> minId = employees.stream()
				.min(Comparator.comparing(Employee::getId));

		Optional<Employee> maxId = employees.stream()
				.max(Comparator.comparing(Employee::getId));
		
		minId.ifPresent(System.out::println);
		maxId.ifPresent(System.out::println);
		
		
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
		IntStream intStream = integerStream.mapToInt(Integer::intValue);
		OptionalInt min = intStream.min();
		System.out.print(min);
		
	}
}
