package com.obydul.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {
	private String name;
	private Set<String> language;

	public StreamFlatMap(String name) {
		this.name = name;
		this.language = new HashSet<>();
	}

	public void add(String language) {
		this.language.add(language);
	}

	public Set<String> getLanguage() {
		return language;
	}

	public static void main(String[] args) {
		List<StreamFlatMap> team = new ArrayList<>();

		StreamFlatMap polyglot = new StreamFlatMap("Developer X");
		polyglot.add("clojure");
		polyglot.add("scala");
		polyglot.add("groovy");
		polyglot.add("go");

		StreamFlatMap busy = new StreamFlatMap("Developer Y");
		busy.add("java");
		busy.add("javascript");

		team.add(polyglot);
		team.add(busy);

		team.stream().map(developer -> developer.getLanguage());

		Stream<Set<String>> setStream = team.stream().map(developer -> developer.getLanguage());
		// setStream.forEach(o -> System.out.println(o));
		// System.out.println();

		Stream<String> stringStream = setStream.flatMap(language -> language.stream());

		List<String> list = stringStream.collect(Collectors.toList());
		list.forEach(val -> System.out.println(val));
		System.out.println();

		List<String> list2 = team.stream().map(developer -> developer.getLanguage())
				.flatMap(language -> language.stream()).collect(Collectors.toList());

		List<String> list3 = team.stream().map(StreamFlatMap::getLanguage).flatMap(Collection::stream)
				.collect(Collectors.toList());

		team.stream().map(StreamFlatMap::getLanguage).flatMap(Collection::stream).forEach(System.out::println);

	}
}
