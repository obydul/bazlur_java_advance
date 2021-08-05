package com.obydul.stream;

import java.util.stream.IntStream;

public class IntStreamRange {
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(val -> System.out.print(val + " "));
		System.out.println();
		
		IntStream.rangeClosed(0, 10)
		.forEach(val -> System.out.print(val+" "));
		System.out.println();
	}
}
