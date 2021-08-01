package com.obydul.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		FunctionExample fe = new FunctionExample();
		Function<Integer, Integer> doubleIt = a -> a * 2;
		fe.calculate(4, doubleIt);

		Function<Integer, Integer> squireIt = a -> a * a;
		fe.calculate(4, squireIt);

		Function<Integer, Integer> cubeIt = a -> a * a * a;
		fe.calculate(4, cubeIt);
		
		Function<Integer, Integer> inc = a -> a + 1;		
		Integer temp = cubeIt.apply(5);
		Integer result = inc.apply(temp);
		System.out.println("Temp :: " + temp);
		System.out.println("Result :: " + result);

	}

	public void calculate(Integer value, Function<Integer, Integer> func) {
		Integer result = func.apply(value);
		System.out.println(result);
	}

}
