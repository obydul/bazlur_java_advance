package com.obydul.strategy;

public class PhoneCall implements Communicable {

	@Override
	public String communicate(String destingation, String message) {
		return "Communicate via PhoneCall -> sending message to " + "destination: [" + destingation + "], message:["
				+ message+"]";
	}
}
