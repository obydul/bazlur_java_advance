package com.obydul.lambda;

public class EmailSender {
	public static void main(String[] args) {
		final String banglaMsg = "বাংলাদেশ";
		String englishMsg = "Bangladesh";
		MessageTranslator translator = (String msg) -> {
			return banglaMsg.equals(msg) ? englishMsg : "Unknown";
		};
		EmailSender emailSender = new EmailSender();
		emailSender.send(translator, banglaMsg);
		emailSender.send(translator, englishMsg);
	}

	public void send(MessageTranslator translator, String message) {
		String translated = translator.translate(message);
		System.out.println("Sending email with translated " + "message: " + translated);
	}

}
