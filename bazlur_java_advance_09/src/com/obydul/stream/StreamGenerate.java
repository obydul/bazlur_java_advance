package com.obydul.stream;

import java.util.UUID;
import java.util.stream.Stream;

public class StreamGenerate {
	public static void main(String[] args) {
		Stream<UUID> uuidStream = Stream.generate(() -> UUID.randomUUID());
		uuidStream.limit(10).forEach(s -> System.out.println(s));
		System.out.println();

		Stream<Double> randomNumber = Stream.generate(Math::random);
		randomNumber.limit(10).forEach(d -> System.out.println(d));
	}

}
