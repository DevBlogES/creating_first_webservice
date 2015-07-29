package es.devblog.test;

import es.devblog.test.Model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
	private static Library ourInstance;
	private List<Book> books;

	private Library() {
	}

	public static Library getInstance() {
		if (ourInstance == null) {
			ourInstance = new Library();
		}

		return ourInstance;
	}

	public List<Book> getBooks() {
		if (books == null) {
			books = new ArrayList<>();
		}

		return books;
	}

	public Library setBooks(List<Book> books) {
		this.books = books;
		return this;
	}

	public List<Book> findBooksByTitle(String title) {
		//Java 8 approach
		List<Book> booksToReturn = books.stream()
				.filter(book -> book.getTitle().toLowerCase().contains(title.toLowerCase()))
				.collect(Collectors.toList());

		//Java 7 approach
		/*List<Book> booksToReturn = new ArrayList<>();
		for (Book book : books) {
			if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				bookToReturn.add(book);
			}
		}*/

		return booksToReturn;
	}
}