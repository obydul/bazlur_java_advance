package com.obydul.stream;

import java.util.List;

import com.obydul.stream.Employee1.Department;

public class StreamReduce {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 5, 4, 6, 3, 7, 8);
		int sum = 0;
		for (Integer num : numbers) {
			sum += num;
		}

		System.out.println(sum);

		int product = 1;
		for (Integer integer : numbers) {
			product *= integer;
		}

		System.out.println(product);

		int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);

		int product1 = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(product1);

		System.out.println();

		List<Employee1> employees = List.of(
				new Employee1(33, "Obydul", Department.IT),
				new Employee1(22, "Islam", Department.FINANCE), 
				new Employee1(1, "Abdullah", Department.HR),
				new Employee1(2, "Salman", Department.IT));

		int totalAge = employees.stream().mapToInt(Employee1::getAge).reduce(0, (a, b) -> (a + b));
		System.out.println("Total Age : " + totalAge);

		int totalAge1 = employees.stream().mapToInt(Employee1::getAge).reduce(0, Integer::sum);
		System.out.println("Total Age : " + totalAge1);

		int maxAge = employees.stream().filter(e -> e.getDepartment() == Employee1.Department.IT)
				.mapToInt(Employee1::getAge).reduce(0, (a, b) -> a > b ? a : b);

		System.out.println("Max Age : " + maxAge);

		int min = employees.stream().filter(e -> e.getDepartment() == Employee1.Department.IT)
				.mapToInt(Employee1::getAge).reduce(0, Integer::min);

		System.out.println("Min Age : " + min);

	}

}
