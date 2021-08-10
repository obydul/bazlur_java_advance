package com.obydul.collectors;

import java.util.List;
import java.util.Random;

public class Book {
	private String name;
	private int price;
	private Author author;
	private boolean fiction;
	private BookGenres bookGenres;
	private int rating;
	
	public Book(String name, int price, Author author, boolean fiction, BookGenres bookGenres) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.fiction = fiction;
		this.bookGenres = bookGenres;
		this.rating = new Random().nextInt(5)+1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public boolean isFiction() {
		return fiction;
	}

	public void setFiction(boolean fiction) {
		this.fiction = fiction;
	}

	public BookGenres getBookGenres() {
		return bookGenres;
	}

	public void setBookGenres(BookGenres bookGenres) {
		this.bookGenres = bookGenres;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return name;
	}
	
	private List<Book> createBooks(){
		Author oIslam = new Author("Obydul", "Islam");
		Author abdullah = new Author("Abdullah", "Basit");
		
		return List.of();
	}
	
	

}
