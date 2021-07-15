package com.obydul.lambda;

@FunctionalInterface
public interface MessageTranslator {
	String translate(String msg);
}
