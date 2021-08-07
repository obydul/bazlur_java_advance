package com.obydul.stream;

import java.util.stream.IntStream;


public class StreamLimit {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(0, 100);
		intStream.filter(val -> isPrime(val)).limit(10)
		.forEach(o -> System.out.print(o +" "));
		System.out.println();
	}
	
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		return IntStream.rangeClosed(2, number / 2)
				.noneMatch( i -> number % i == 0);
	}
}
