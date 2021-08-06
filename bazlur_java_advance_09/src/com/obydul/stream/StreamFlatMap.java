package com.obydul.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		
	}
	
	
	

}
