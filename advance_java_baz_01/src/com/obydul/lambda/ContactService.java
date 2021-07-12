package com.obydul.lambda;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	public List<Contact> findContactAgedBetween12And25(List<Contact> contacts) {
		List<Contact> contactAgedBetween18And25 = new ArrayList<Contact>();
		for (Contact contact : contacts) {
			if (18 <= contact.getAge() && contact.getAge() <= 25) {
				contactAgedBetween18And25.add(contact);
			}
		}

		return contactAgedBetween18And25;
	}

}
