package com.obydul.strategy;

public class Email implements Communicable {

	@Override
	public String communicate(String destingation, String message) {
		return "Communicate via Email -> sending message to " + "destination: [" + destingation + "], message:["
				+ message+"]";
	}

}
