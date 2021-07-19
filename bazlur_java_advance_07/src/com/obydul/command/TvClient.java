package com.obydul.command;

public class TvClient {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Command onCommand = new OnCommand(tv);
		Command offCommand = new OffCommand(tv);

		RemoteControl remoteControl = new RemoteControl();
		remoteControl.press(onCommand);
		remoteControl.press(offCommand);

		System.out.println("\nUsing lambda expression");

		remoteControl.press(() -> tv.switchOn());
		remoteControl.press(() -> tv.switchOff());

		System.out.println("\nUsing method reference");
		remoteControl.press(tv::switchOn);
		remoteControl.press(tv::switchOff);

	}
}
