package com.obydul.lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

public class ContactApp {
	public static void main(String[] args) {
		List<Contact> contactList = List.of(new Contact("Jihad", "jihad@gmail.com", 13, Contact.Gender.Male),
				new Contact("Roman", "roman@gmail.com", 9, Contact.Gender.Male),
				new Contact("Salman", "salman@gmail.com", 2, Contact.Gender.Male),
				new Contact("Abdullah", "abdullah@gmail.com", 1, Contact.Gender.Male),
				new Contact("Obydul", "obydul@gmail.com", 31, Contact.Gender.Male),
				new Contact("alkus", "alkus@gmail.com", 24, Contact.Gender.Female));

		ContactService contactService = new ContactService();
		/*
		 * List<Contact> contactAged18To25 = contactService.findContacts(contactList,
		 * new FilterCriteria() {
		 * 
		 * @Override public boolean match(Contact contact) { return 5 <=
		 * contact.getAge() && contact.getAge() <= 25 && contact.getGender() ==
		 * Contact.Gender.Male; } });
		 */

		List<Contact> contactAged18To25 = contactService.findContacts(contactList, (Contact contact) -> {
			return 5 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.Male;
		});

		System.out.println("Contact Info :: ");
		for (Contact contact : contactAged18To25) {
			System.out.println(contact);
		}

		File file = new File("./");
		File[] files = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				return pathname.isFile();
			}
		});

		System.out.println();
		System.out.println("File Lists: ");
		for (File filename : files) {
			System.out.println(filename);
		}
		
		File[] files2 = file.listFiles(pathname -> pathname.isFile());

		System.out.println();
		System.out.println("File Lists lambda: ");
		for (File filename : files2) {
			System.out.println(filename);
		}
	}

}
