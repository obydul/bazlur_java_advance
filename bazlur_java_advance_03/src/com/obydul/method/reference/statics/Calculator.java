package com.obydul.method.reference.statics;

import java.util.function.Function;

public class Calculator {
	public double calculate(Double a, Function<Double, Double> func) {
		return func.apply(a);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println("Using lambda expression");
		double lambsin = calculator.calculate(90.0, a -> Math.sin(a));
		double lambcos = calculator.calculate(90.0, a -> Math.cos(a));
		double lambexp = calculator.calculate(90.0, a -> Math.exp(a));
		
		System.out.println(lambsin);
		System.out.println(lambcos);
		System.out.println(lambexp);
		
		System.out.println();
		System.out.println("Using method reference");
		double refesin = calculator.calculate(90.0, Math::sin);
		double refecos = calculator.calculate(90.0, Math::cos);
		double refeexp = calculator.calculate(90.0, Math::exp);
		
		System.out.println(refesin);
		System.out.println(refecos);
		System.out.println(refeexp);
	}

}
