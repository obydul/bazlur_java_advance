package com.obydul.stream;

import java.util.stream.Stream;

public class StreamOf {
	public static void main(String[] args) {
		Stream<Integer> integerStream = Stream.of(5, 4, 8, 2, 6, 1);
		integerStream.sorted().
		forEach(i -> System.out.print(i + " "));
		System.out.println();

		String[] cities = { "Rangpur", "Dhaka", "Khulna" };
		Stream<String> stream = Stream.of(cities);
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
	}

}
