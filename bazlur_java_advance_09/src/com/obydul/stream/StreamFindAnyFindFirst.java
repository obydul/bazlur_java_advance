package com.obydul.stream;

import java.util.List;
import java.util.Optional;

import com.obydul.stream.Employee1.Department;

public class StreamFindAnyFindFirst {

	public static void main(String[] args) {

		List<Employee1> employees = List.of(new Employee1(33, "Obydul", Department.IT),
				new Employee1(22, "Islam", Department.FINANCE), new Employee1(1, "Abdullah", Department.HR),
				new Employee1(2, "Salman", Department.IT));
		
		Optional<Employee1> optionalEmployee = employees.stream()
				.filter(e -> e.getDepartment() == Employee1.Department.IT)
				.findAny();
		System.out.println(optionalEmployee);
		

	}

}
