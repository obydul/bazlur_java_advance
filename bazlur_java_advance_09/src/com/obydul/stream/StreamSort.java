package com.obydul.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSort {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 5, 4, 6, 3, 5, 4, 3);
		numbers.stream().distinct().sorted().forEach(v -> System.out.println(v));
	}
}
