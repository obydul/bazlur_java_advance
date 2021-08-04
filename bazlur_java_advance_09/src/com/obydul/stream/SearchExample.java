package com.obydul.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchExample {
	public static void main(String[] args) {

		List<Book> list = Arrays.asList(new Book("Java 1", "ABC", 500, "English"),
				new Book("Java 2", "BCA", 400, "English"), new Book("Java 3", "CBA", 800, "English"),
				new Book("Java 4", "DEF", 950, "Bengoli"));

		System.out.println(findEnglishBooks(list));

		System.out.println();

		System.out.println(findEnglishBookWithJava8(list));

	}

	public static String findEnglishBooks(List<Book> books) {
		List<Book> englishBooks = new ArrayList<Book>();

		for (Book book : books) {
			if (book.getLanguage().equals("English") && book.getPrice() >= 500 && book.getPrice() <= 1000) {
				englishBooks.add(book);

			}
		}

		Collections.sort(englishBooks, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});

		final String comma = ", ";
		StringBuilder bookBuilder = new StringBuilder();

		for (Book englishBook : englishBooks) {
			bookBuilder.append(englishBook.toString()).append(comma).append("\n");
		}

		return bookBuilder.toString();
	}

	public static String findEnglishBookWithJava8(List<Book> books) {
		return books.stream().filter(book -> book.getLanguage().equals("English"))
				.filter(book -> 500 <= book.getPrice() && book.getPrice() <= 1000)
				.sorted(Comparator.comparing(Book::getPrice)).map(Book::toString).collect(Collectors.joining(", "));

	}
}
