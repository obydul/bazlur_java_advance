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

	public List<Contact> findMaleContactAgedBetween12And25(List<Contact> contacts) {
		List<Contact> maleAgedBetween18And25 = new ArrayList<Contact>();
		for (Contact contact : contacts) {
			if (18 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.Male) {
				maleAgedBetween18And25.add(contact);
			}
		}
		return maleAgedBetween18And25;
	}

	public List<Contact> findFemaleContactAgedBetween12And25(List<Contact> contacts) {
		List<Contact> femaleAgedBetween18And25 = new ArrayList<Contact>();
		for (Contact contact : contacts) {
			if (18 <= contact.getAge() && contact.getAge() <= 25 && contact.getGender() == Contact.Gender.Female) {
				femaleAgedBetween18And25.add(contact);
			}
		}
		return femaleAgedBetween18And25;
	}

}
