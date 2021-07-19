package com.obydul.lambda;

import java.util.Iterator;
import java.util.List;

public class PersonProcess {
	public void sendEmailForVote(List<Person> personsList) {
		for (Person person : personsList) {
			if (person.getAge() >= 18) {
				sendEmail(person);
			}
		}

		// internal iteration
		
		Iterator<Person> iter = personsList.iterator();		
		while (iter.hasNext()) {
			Person person = iter.next();
			if (person.getAge() >= 18) {
				sendEmail(person);
			}
		}
		
		personsList.forEach(person -> {
			if (person.getAge() >= 18) {
				sendEmail(person);
			}
		});
		
		personsList.parallelStream().forEach(person -> {
			if (person.getAge() >= 18) {
				sendEmail(person);
			}
		});
	}
	

	private void sendEmail(Person person) {
		System.out.println("Sending email to: " + person.getName());
	}

}
