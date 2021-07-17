package com.obydul.defaults;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public interface Loggable {
	Logger getLogger();

	String getDelimiter();

	void log(Level level, String message);

	default void info(String message, Object... objects) {
		getLogger().log(new LogRecord(Level.INFO, formatMessage(message, objects)));
	}

	default void error(String message, Object... objects) {
		getLogger().log(new LogRecord(Level.SEVERE, formatMessage(message, objects)));
	}

	public default String formatMessage(String message, Object... args) {
		StringBuilder sbMessage = new StringBuilder(message);

		for (Object arg : args) {
			int index = sbMessage.indexOf(getDelimiter());
			if (index == -1) {
				break;
			}
			sbMessage.replace(index, index + getDelimiter().length(), arg == null ? "null" : arg.toString());
		}
		return sbMessage.toString();
	}
}
