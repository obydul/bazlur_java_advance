package com.obydul.strategy;

public class CommunicationApplication {
	public static void main(String[] args) {
		var email = new Email();
		var phoneCall = new PhoneCall();
		var videoCall = new VideoCall();

		var communicationService = new CommunicationService();
		communicationService.setCommunicable(email);
		communicationService.sendMessage("obydul@gmail.com", "hey obydul");

		communicationService.setCommunicable(phoneCall);
		communicationService.sendMessage("+8801523XXXXXX", "hello obydul");
	}
}
