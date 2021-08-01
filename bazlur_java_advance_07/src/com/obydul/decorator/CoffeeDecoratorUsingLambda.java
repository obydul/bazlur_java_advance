package com.obydul.decorator;

import java.util.function.Function;
import java.util.stream.Stream;

public class CoffeeDecoratorUsingLambda {
	
	public static Coffee getCoffeeWithExtras(Coffee coffee, 
			Function<Coffee, Coffee>... ingredients) {
		Function<Coffee, Coffee> initial = Kopi -> Kopi;
		
		Stream.of(ingredients)
		.reduce(kopi -> kopi, (func1, func2) ->
		func1.andThen(func2));
		
		Function<Coffee, Coffee> reduced =  Stream.of(ingredients)
		.reduce(Function.identity(), Function::andThen);
		
		for (Function<Coffee, Coffee> ingredient: ingredients) {
			initial = initial.andThen(ingredient);
		}
		//return initial.apply(coffee);
		return reduced.apply(coffee);
	}

}
