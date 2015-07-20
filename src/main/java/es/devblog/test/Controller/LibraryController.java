package es.devblog.test.Controller;

import es.devblog.test.Library;
import es.devblog.test.Model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {

	// http://localhost:8080/books
	@RequestMapping("/books")
	public List<Book> getBook() {
		return Library.getInstance().getBooks();
	}

	// http://localhost:8080/book?id=0
	@RequestMapping("/book")
	public Book getBook(@RequestParam(value = "id", defaultValue = "0", required = true) Long id) {
		return Library.getInstance().getBook(id);
	}
}