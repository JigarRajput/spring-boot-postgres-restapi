package bookESell.RestAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bookESell.RestAPI.model.Book;
import bookESell.RestAPI.service.BookService;
import java.util.*;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	// create book rest api
	
	@PostMapping("/api/post")
	public ResponseEntity<Book> saveBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.saveBook(book),HttpStatus.CREATED);
	}
	
	
	// build get all books rest-api
	
	@GetMapping("/api/getbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	// build get book by id
	
	@GetMapping("/api/getByID/{Id}")
	public ResponseEntity<Book> getByID(@PathVariable("Id") int Id){
		return new ResponseEntity<Book>(bookService.getBookById(Id), HttpStatus.OK);
	}
	

}
