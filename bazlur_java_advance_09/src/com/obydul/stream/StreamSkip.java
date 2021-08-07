package com.obydul.stream;

import java.util.stream.IntStream;

public class StreamSkip {
	public static void main(String[] args) {

		IntStream intStream = IntStream.range(0, 20);
		// intStream.filter(val -> isPrime(val)).skip(5).forEach(val ->
		// System.out.println(val));

		intStream.peek(val -> System.out.println("Before skip : " + val)).skip(5)
				.peek(val -> System.out.println("after skip : " + val)).filter(val -> isPrime(val))
				.forEach(val -> System.out.println(val));

	}

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
	}

}
