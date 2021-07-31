package com.obydul.strategy;

public class CommunicationApplication {
	public static void main(String[] args) {
		var communicationService = new CommunicationService();
		communicationService.setCommunicable((destination, message) -> "Communicating via Email -> sending"
				+ "message to destination: [" + destination + "], message:[" + message + "]");

		communicationService.sendMessage("obydul@gmail.com", "hey obydul");

		/*var email = new Email();
		var phoneCall = new PhoneCall();
		var videoCall = new VideoCall();

		communicationService.setCommunicable(email);

		communicationService.setCommunicable(phoneCall);
		communicationService.sendMessage("+8801523XXXXXX", "hello obydul");
		communicationService.setCommunicable(videoCall);
		communicationService.sendMessage("+8801523XXXXXX", "video call");*/
	}
}
