package com.obydul.fluentprogramming;

public class ConfigurationManagerDemo {
	public static void main(String[] args) {
		ConfigurationManager configManager = ConfigurationManager
				.make(configurationManager -> configurationManager
						.setUrl("production.mydatabase.com")
						.setUsername("test")
						.setPassword("123123")
						.addRole("admin")
<<<<<<< HEAD
						);		
=======
						.addRole("Developer"));
>>>>>>> branch 'main' of https://github.com/obydul/bazlur_java_advance.git
	}
}
