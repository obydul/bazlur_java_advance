package com.obydul.generic;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<?> list = Arrays.asList("This", "is", "java", LocalDate.now());
		for (Object string : list) {
			System.out.print(string + " ");
		}
		System.out.println();

		list.forEach(o -> System.out.print(o + " "));
		System.out.println();
	}
}
