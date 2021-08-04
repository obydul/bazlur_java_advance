package com.obydul.generic;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<?> list = Arrays.asList("This", "is", "java", LocalDate.now());
		for (String string : list) {
			System.out.println(string);
		}
	}

}
