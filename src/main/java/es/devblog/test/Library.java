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

	public Book getBook(Long id) {
		for (Book book : books) {
			if (book.getId().equals(id)) {
				return book;
			}
		}

		return null;
	}
}