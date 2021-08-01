package com.obydul.decorator;

public class CoffeeApp {
	public static void main(String[] args) {
		var coffee = new VanillaAlmondExtract(new SaltedCaramelFudge(new SweetenedMilk(new CoffeeBean())));
		System.out.println(coffee.getIngredient());
		
		
	}
}                                                                                                                