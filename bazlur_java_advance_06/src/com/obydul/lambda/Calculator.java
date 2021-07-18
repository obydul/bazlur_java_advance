package com.obydul.lambda;

import java.util.function.Function;

public class Calculator {
	public double calculate(Double a, Function<Double, Double> func) {
		return func.apply(a);
	}
}
