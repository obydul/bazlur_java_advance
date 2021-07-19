package com.obydul.strategy;

public class VideoCall implements Communicable{

	@Override
	public String communicate(String destingation, String message) {
		return "Communicate via VideoCall -> sending message to " + "destination: [" + destingation + "], message:["
				+ message+"]";
	}

}
