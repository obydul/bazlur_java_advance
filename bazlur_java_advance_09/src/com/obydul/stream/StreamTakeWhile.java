package com.obydul.stream;

import java.util.List;

public class StreamTakeWhile {
	public static void main(String[] args) {
		List<Integer> integers = List.of(0, 5, 2, 4, 6, 3, 1, 8, 9, 7);
		integers.stream()
		.peek(val -> System.out.println("before : " + val))
		.distinct()
		.takeWhile(num -> num < 6)
				.forEach(num -> System.out.println(num + ", "));
		
	}
}
