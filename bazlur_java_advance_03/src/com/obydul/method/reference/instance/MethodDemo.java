package com.obydul.method.reference.instance;

import java.util.function.Function;

public class MethodDemo {

	public static void checker(String str, Function<String, Boolean> func) {
		Boolean ret = func.apply(str);
		System.out.println(ret);
	}

	public static void main(String[] args) {
		String hello = "Obydul";
		StringUtils utils = new StringUtils();
		System.out.println("Using lambda");
		checker(hello, str -> utils.isNotEmpty(str));
		checker(hello, str -> utils.isEmpty(str));
		checker(hello, str -> utils.hasSpecialCharacter(str));

		System.out.println();
		System.out.println("Using method reference");
		checker(hello, utils::isNotEmpty);
		checker(hello, utils::isEmpty);
		checker(hello, utils::hasSpecialCharacter);
	}
}
