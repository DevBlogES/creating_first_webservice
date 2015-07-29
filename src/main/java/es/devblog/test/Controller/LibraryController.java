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
	public List<Book> findAll() {
		return Library.getInstance().getBooks();
	}

	// http://localhost:8080/book/find?title=spring
	@RequestMapping("/books/find")
	public List<Book> findBooksByTitle(@RequestParam(value = "title", defaultValue = "null", required = true) String title) {
		return Library.getInstance().findBooksByTitle(title);
	}
}