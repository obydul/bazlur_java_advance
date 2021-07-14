package com.obydul.imperative;

import java.util.Arrays;
import java.util.List;

public class IntegerFinderDemo {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 5, 6, 2, 4, 3);
		find(ints, 25);
		findInteger(ints, 5);
		findInteger(ints, 50);
	}

	static void find(List<Integer> ints, int num) {
		boolean found = false;
		for (Integer integer : ints) {
			if (integer.equals(num)) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(num + " found");
		} else {
			System.out.println(num + " not found");
		}
	}

	static void findInteger(List<Integer> ints, int num) {
		if (ints.contains(num)) {
			System.out.println(num + " found");
		} else {
			System.out.println(num + " not found");
		}
	}

}
