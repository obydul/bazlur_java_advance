package com.obydul.stream;

import java.util.stream.Stream;

public class StreamEmpty {

	public static void main(String[] args) {
		Stream<Integer> integerStream = Stream.of(5, 4, 8, 2, 6, 1);
		integerStream.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		Stream.empty();
	}
}
