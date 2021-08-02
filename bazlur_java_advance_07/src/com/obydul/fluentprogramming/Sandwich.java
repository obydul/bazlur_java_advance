package com.obydul.fluentprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sandwich {
	private String bread;
	private String meat;
	private String cheese;
	private List<String> vegetable = new ArrayList<>();

	private Sandwich() {
	}

	public Sandwich setBread(String bread) {
		this.bread = bread;
		return this;
	}

	public Sandwich setMeat(String meat) {
		this.meat = meat;
		return this;
	}

	public Sandwich setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}

	public Sandwich addVegetables(String vegetable) {
		this.vegetable.add(vegetable);
		return this;
	}

	public static Sandwich make(Consumer<Sandwich> sandwichConsumer) {
		System.out.println("Making a sandwitch");
		Sandwich sandwich = new Sandwich();
		sandwichConsumer.accept(sandwich);
		return sandwich;
	}

}
