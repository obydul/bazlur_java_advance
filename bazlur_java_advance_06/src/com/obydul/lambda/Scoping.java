package com.obydul.lambda;

public class Scoping {
	public void method1() {
		String hello = "Hello world";
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				String hello = "Hello world, I love Bangladesh";
				System.out.println(hello);
			}
		};
	}
	
	public void method2() {
		String hello = "Hello world";
		Runnable runnable = () -> {
			//String hello = "Hello world, I love Bangladesh";
			System.out.println(hello);
		};
	}

	public static void main(String[] args) {
		Scoping scoping = new Scoping();
		scoping.method1();
		scoping.method2();
	}
}
