package com.obydul.stream;

import java.util.BitSet;
import java.util.stream.IntStream;

public class BitSetStream {
	public static void main(String[] args) {
		BitSet bitSet = new BitSet(10);
		bitSet.set(4);
		bitSet.set(2);
		bitSet.set(6);
		bitSet.set(2);
		
		IntStream stream = bitSet.stream();
		stream.forEach(o -> System.out.println(o));
		
	}
}
