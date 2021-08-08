package com.obydul.stream;

import java.util.List;

import com.obydul.stream.Employee1.Department;

class Employee1 {
	private static long idGen = 0;

	enum Department {
		IT, HR, FINANCE, MARKETING, DEVELOPMENT
	}

	private long id;
	private int age;
	private String name;
	private Department department;

	public Employee1(int age, String name, Department department) {
		this.id = ++idGen;
		this.age = age;
		this.name = name;
		this.department = department;
	}

	public static long getIdGen() {
		return idGen;
	}

	public static void setIdGen(long idGen) {
		Employee1.idGen = idGen;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "id = " + id + ", age = " + age + ", name = " + name + ", department = " + department;
	}
	
	

}

public class StreamAnyMatch {
	public static void main(String[] args) {

		List<Employee1> employees = List.of(new Employee1(33, "Obydul", Department.IT),
				new Employee1(22, "Islam", Department.FINANCE), new Employee1(1, "Abdullah", Department.HR),
				new Employee1(2, "Salman", Department.IT));
		boolean anyMatch = employees.stream().anyMatch(employee -> employee.getDepartment() == Employee1.Department.IT);
		System.out.println(anyMatch);

		boolean allMatch = employees.stream().allMatch(employee -> 1 < employee.getAge());
		System.out.println(allMatch);

		boolean noneMatch = employees.stream().noneMatch(employee -> 1 > employee.getAge());
		System.out.println(noneMatch);

	}

}
