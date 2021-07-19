package com.obydul.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
	private List<Command> history = new ArrayList<Command>();
	
	public void press(Command command) {
		history.add(command);
		command.execute();
	}

}
