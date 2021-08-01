package com.obydul.decorator;

public class SaltedCaramelFudge extends CoffeeDecorator {

	public SaltedCaramelFudge(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getIngredient() {
		return super.getIngredient() + " + Salted caramel fudge";
	}

}
