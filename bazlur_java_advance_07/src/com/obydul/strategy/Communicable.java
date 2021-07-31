package com.obydul.strategy;

@FunctionalInterface
public interface Communicable {
	String communicate(String destingation, String message);
}
