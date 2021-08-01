package com.obydul.decorator;

public class SweetenedMilk extends CoffeeDecorator {

	public SweetenedMilk(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getIngredient() {
		return super.getIngredient() +" + Sweetened Milk";
	}

}
