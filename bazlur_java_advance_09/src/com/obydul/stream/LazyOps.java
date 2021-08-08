package com.obydul.stream;

import java.util.UUID;
import java.util.stream.Stream;

public class LazyOps {
	public static void main(String[] args) {
		Stream<UUID> uuidsStream = Stream.generate(() -> UUID.randomUUID());
		
		/*Stream<String> tenUUIDS = uuidsStream.skip(10).map(uuid -> uuid.toString()).map(uuid -> uuid.toUpperCase())
				.map(uuid -> uuid.replace("-", "")).peek(uuid -> System.out.println(uuid))
				.limit(10);*/
		
		long count = uuidsStream
				.skip(10)
				.map(UUID::toString)
				.map(String::toUpperCase)
				.map(LazyOps::replaceDashWithSpace)
				.peek(System.out::println)
				.limit(10)
				.count();	
		System.out.println(count);
	}
	
	private static String replaceDashWithSpace(String uuid) {
		return uuid.replace("-", "");
	}
	
}
