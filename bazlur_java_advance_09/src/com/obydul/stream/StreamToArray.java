package com.obydul.stream;

import java.util.stream.Stream;

public class StreamToArray {
	public static void main(String[] args) {
		Stream<Integer> integerStream = Stream.of(1,2,3,4);
		Object[] integers = integerStream.toArray();
		for (Object object : integers) {
			String hex = Integer.toHexString((Integer) object);
			System.out.println(hex);
		}
	}
}
