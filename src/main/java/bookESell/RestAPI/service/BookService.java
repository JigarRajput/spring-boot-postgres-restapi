package bookESell.RestAPI.service;
import java.util.*;
import bookESell.RestAPI.model.Book;

public interface BookService {

	Book saveBook(Book book);
	List<Book> getAllBooks();
	Book getBookById(int id);
	
}
