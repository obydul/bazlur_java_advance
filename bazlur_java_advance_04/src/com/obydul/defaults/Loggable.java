package com.obydul.defaults;

import java.util.logging.Level;
import java.util.logging.Logger;

public interface Loggable {
	Logger getLogger();
	String getDelimeter();
	void log(Level level, String message);
	

}
