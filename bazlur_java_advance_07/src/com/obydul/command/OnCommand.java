package com.obydul.command;

public class OnCommand implements Command {
	private Tv tv;

	public OnCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.switchOn();
	}

}
