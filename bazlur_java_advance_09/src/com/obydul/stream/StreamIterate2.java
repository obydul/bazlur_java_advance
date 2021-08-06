package com.obydul.stream;

import java.util.stream.Stream;

public class StreamIterate2 {
	public static void main(String[] args) {
		Stream<Integer> sequence = Stream.iterate(1, val -> val < 100, val -> val * 2);
		sequence.forEach(val -> System.out.print(val + " "));
		System.out.println();
	}

}
