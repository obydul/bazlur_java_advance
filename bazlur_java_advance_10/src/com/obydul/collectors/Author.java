package com.obydul.collectors;

import java.util.List;

public class Author {
	private String firstName;
	private String lastName;
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

enum BookGenres{
	REALISTIC_FICTION,
	HISTORICAL_FICTION,
	HUMOR,
	MYSTERY,
	YOUNG_ADULT_FICTION,
	REFERENCE_BOOK,
	COMPUTER
}
