package com.obydul.lambda;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
	public List<Contact> findContacts(List<Contact> contacts, FilterCriteria criteria) {
		List<Contact> matchedContacts = new ArrayList<Contact>();

		for (Contact contact : contacts) {
			if (criteria.match(contact)) {
				matchedContacts.add(contact);
			}
		}
		return matchedContacts;
	}
}
