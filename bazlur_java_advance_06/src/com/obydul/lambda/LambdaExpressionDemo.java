package com.obydul.lambda;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double PI = 3.14159265358979323846;
		double degree = 90.0;
		double radians = calculator.calculate(degree, a -> a * PI / 180);
		
		System.out.println(radians);

	}

}
