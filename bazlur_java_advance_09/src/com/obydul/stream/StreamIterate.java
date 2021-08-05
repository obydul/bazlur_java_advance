package com.obydul.stream;

import java.util.stream.Stream;

public class StreamIterate {
	public static void main(String[] args) {
		Stream<Integer> sequence = Stream.iterate(1, val -> val * 2);
		sequence.limit(10).forEach(val -> System.out.print(val + " "));
		System.out.println();

		Stream.iterate(1, val -> ++val).limit(10).forEach(val -> System.out.println(val));
	}

}
