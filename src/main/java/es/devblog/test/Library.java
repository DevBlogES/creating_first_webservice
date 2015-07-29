package es.devblog.test;

import es.devblog.test.Model.Book;

import java.util.ArrayList;
import java.util.List;

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
		List<Book> bookToReturn = new ArrayList<>();
		for (Book book : books) {
			if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				bookToReturn.add(book);
			}
		}

		return bookToReturn;
	}
}