package com.obydul.stream;

import java.util.List;

public class StreamDropWhile {
	public static void main(String[] args) {
		List<Integer> integers = List.of(0,1,2,3,5,9,13,14,15,16,4,17,18);
		integers.stream()
		.sorted()
		.dropWhile(num -> num < 10)
		.forEach(num -> System.out.println(num));
	}
}
