package com.obydul.collectors;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

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
		this.rating = new Random().nextInt(5) + 1;
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

	private static List<Book> createBooks() {
		Author oIslam = new Author("Obydul", "Islam");
		Author abdullah = new Author("Abdullah", "Basit");

		return List.of(new Book("java programming", 250, oIslam, true, BookGenres.REALISTIC_FICTION),
				new Book("advance java programming", 410, abdullah, true, BookGenres.COMPUTER),
				new Book("java thread programming", 130, oIslam, true, BookGenres.COMPUTER));
	}

	public static void main(String[] args) {
		List<Book> books = createBooks();
		Long totalBooks = books.stream().collect(Collectors.counting());
		System.out.println(totalBooks);
		
		long count = createBooks().stream().count();
		System.out.println(count);
		
		long computerBook = books.stream().filter(book -> book.getBookGenres() == BookGenres.COMPUTER)
				.collect(Collectors.counting());
		System.out.println(computerBook);
		
		
		long computerBookPrice = books.stream()
				.filter(book -> book.getBookGenres() == BookGenres.COMPUTER)
				.collect(Collectors.summingInt(book -> book.getPrice()));
		System.out.println(computerBookPrice);
		
		long totalCost = books.stream()
				.collect(Collectors.summingInt(Book::getPrice));
		System.out.println(totalCost);
		
		Double average = books.stream()
				.collect(Collectors.averagingInt(Book::getPrice));
		System.out.println(average);
		
		IntSummaryStatistics statistics = books.stream()
				.collect(Collectors.summarizingInt(Book::getPrice));
		System.out.println(statistics);
		
		double aver = statistics.getAverage();
		long sum = statistics.getSum();
		long min = statistics.getMin();
		long max = statistics.getMax();
		long total = statistics.getCount();
		
		System.out.println("statistics :: "+aver+" : "+sum+" : "+min+" : "+max+" : "+total);
		
		Optional<Book> mostExpensiveBook = books.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Book::getPrice)));
		System.out.println(mostExpensiveBook);
		
		Optional<Book> mostCheapBook = books.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Book::getPrice)));
		System.out.println(mostCheapBook);
		
	}

}
