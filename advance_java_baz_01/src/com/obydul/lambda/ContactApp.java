package com.obydul.lambda;

import java.util.List;

public class ContactApp {
	public static void main(String[] args) {
		List<Contact> contactList = List.of(new Contact("Jihad", "jihad@gmail.com", 13, Contact.Gender.Male),
				new Contact("Roman", "roman@gmail.com", 9, Contact.Gender.Male),
				new Contact("Salman", "salman@gmail.com", 2, Contact.Gender.Male),
				new Contact("Abdullah", "abdullah@gmail.com", 1, Contact.Gender.Male));

		ContactService contactService = new ContactService();
		List<Contact> contactAged18To25 = contactService.findContacts(contactList, new FilterCriteria() {

			@Override
			public boolean match(Contact contact) {
				return 18 <= contact.getAge() && contact.getAge() <= 25;
			}
		});
	}

}
