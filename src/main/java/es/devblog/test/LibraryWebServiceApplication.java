package es.devblog.test;

import es.devblog.test.Model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class LibraryWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryWebServiceApplication.class, args);

		dataInitializer();
	}

	private static void dataInitializer() {
		Book springBook = new Book();
		springBook.setId(1L);
		springBook.setTitle("Spring In Action");
		springBook.setIsbn("978-1617291203");
		springBook.setAuthor("Craig Walls");
		springBook.setPublishedDate(new Date(1414710000000L));
		springBook.setNumSells(130000);
		Library.getInstance().getBooks().add(springBook);

		Book androidBook = new Book();
		androidBook.setId(2L);
		androidBook.setTitle("Android Programming: The Big Nerd Ranch Guide");
		androidBook.setIsbn("978-0134171456");
		androidBook.setAuthor("Bill Phillips, Chris Stewart, Brian Hardy, Kristin Marsicano");
		androidBook.setPublishedDate(new Date(1438293600000L));
		androidBook.setNumSells(0);
		Library.getInstance().getBooks().add(androidBook);

		Book angularBook = new Book();
		angularBook.setId(3L);
		angularBook.setTitle("Pro AngularJS");
		angularBook.setIsbn("860-1404651403");
		angularBook.setAuthor("Adam Freeman");
		angularBook.setPublishedDate(new Date(1393542000000L));
		angularBook.setNumSells(253768);
		Library.getInstance().getBooks().add(angularBook);
	}
}