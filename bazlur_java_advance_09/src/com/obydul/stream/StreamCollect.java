package com.obydul.stream;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
	public static void main(String[] args) {
		List<UUID> uuids = Stream.generate(UUID::randomUUID)
				.limit(10)
				.collect(Collectors.toList());
		for (UUID uuid : uuids) {
			System.out.println(uuid);
		}
	}
}
