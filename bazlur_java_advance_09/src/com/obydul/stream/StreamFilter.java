package com.obydul.stream;

import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 5, 9, 8, 4, 13, 6, 3);
		// numbers.forEach(i -> System.out.print(i + " "));
		// System.out.println();
		Stream<Integer> evenNumberStream = numbers.filter(n -> n % 2 == 0);
		evenNumberStream.forEach(o -> System.out.print(o + " "));
		System.out.println();

		Stream.of(5, 8, 7, 9, 4, 6, 2).filter(n -> n % 2 == 1).forEach(i -> System.out.print(i + " "));
		System.out.println();

	}
}
