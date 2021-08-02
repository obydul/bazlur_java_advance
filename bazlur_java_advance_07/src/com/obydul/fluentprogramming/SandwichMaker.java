package com.obydul.fluentprogramming;

public class SandwichMaker {

	public static void main(String[] args) {
		/*Sandwich sandwich = new Sandwich()
		.setBread("White")
		.setMeat("Beaf")
		.setCheese("Cheddar")
		.addVegetables("Tomato")
		.addVegetables("Cucumber")
		.make();*/
		
		Sandwich.make(sandwich ->
		sandwich
		.setBread("White")
		.setMeat("Beaf")
		.setCheese("Cheddar")
		.addVegetables("Tomato")
		.addVegetables("Cucumber"));
		
		

	}

}
