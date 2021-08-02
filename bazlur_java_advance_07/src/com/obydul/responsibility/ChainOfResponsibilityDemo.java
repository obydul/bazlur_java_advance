package com.obydul.responsibility;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		ProcessingObject<Integer> squarer = new Squarer();
		ProcessingObject<Integer> incrementer = new Incrementer();

		squarer.setSuccessor(incrementer);

		Integer result = squarer.handle(4);
		System.out.println(result);

		UnaryOperator<Integer> squarer1 = a -> a * a;
		UnaryOperator<Integer> incrementer1 = a -> a + 1;
		Integer result1 = squarer1.andThen(incrementer1).apply(5);
		System.out.println(result1);

		Function<Integer, Integer> squarer2 = a -> a * a;
		Function<Integer, Integer> incrementer2 = a -> a + 1;
		Integer result2 = squarer2.andThen(incrementer2).apply(5);
		System.out.println(result2);

	}

}
