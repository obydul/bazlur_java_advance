package com.obydul.stream;

public class Book {
	private String bookName;
	private String authorName;
	private int price;
	private String language;
	
	
	
	public Book(String bookName, String authorName, int price, String language) {
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.language = language;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "bookName = " + bookName + ", authorName = " + authorName + ", price = " + price + ", language = "
				+ language;
	}
	
	

}
