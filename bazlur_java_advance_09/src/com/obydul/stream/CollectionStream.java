package com.obydul.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("English", "Java", "Book");
		Stream<String> stringStream = list.stream();
		stringStream.forEach(s -> System.out.print(s + " "));
		System.out.println();

		Set<Integer> set = new HashSet<>();
		set.add(11);
		set.add(15);
		set.add(10);

		Stream<Integer> intStream = set.stream();
		intStream.forEach(i -> System.out.print(i + " "));
		System.out.println();

	}

}
