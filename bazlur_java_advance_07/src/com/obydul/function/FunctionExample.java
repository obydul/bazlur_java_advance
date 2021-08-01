package com.obydul.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Integer> doubleIt = a -> a * 2;
		calculate("Double", 4, doubleIt);

		Function<Integer, Integer> squireIt = a -> a * a;
		calculate("Multiply", 4, squireIt);

		Function<Integer, Integer> cubeIt = a -> a * a * a;
		calculate("Cube", 4, cubeIt);

		Function<Integer, Integer> inc = a -> a + 1;
		Integer temp = cubeIt.apply(5);
		Integer result = inc.apply(temp);
		System.out.println("Temp :: " + temp);
		System.out.println("Result :: " + result);

		calculate("And then inc", 5, cubeIt.andThen(inc));

	}

	public static void calculate(String name, Integer value, Function<Integer, Integer> func) {
		Integer result = func.apply(value);
		System.out.println(name + " : " + result);
	}

}
