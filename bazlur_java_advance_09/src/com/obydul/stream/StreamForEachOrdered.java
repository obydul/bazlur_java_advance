package com.obydul.stream;

import java.util.stream.Stream;

public class StreamForEachOrdered {

	public static void main(String[] args) {
		String[] numbers = {"one","two","three","four"};
		Stream.of(numbers).parallel()
		.forEachOrdered(num -> System.out.println(num+" : "+Thread.currentThread()));
	}
}
