package bookESell.RestAPI.service.impl;


import bookESell.RestAPI.exception.ResourceNotFoundException;
import bookESell.RestAPI.model.Book;
import bookESell.RestAPI.repository.BookRepository;
import bookESell.RestAPI.service.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class BookServiceImpl implements BookService {

//	@Autowired
	private BookRepository bookRepository;
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(int id) {
		return bookRepository.findById(Integer.valueOf(id)).orElseThrow(() -> new ResourceNotFoundException("Book","Id",id));
	}

//	
//	@Override
//	public Book saveBook(Book book) {
//		
//		return bookRepository.save(book);
//	}


//	@Override
//	public List<Book> getAllBooks() {
//		
//		return bookRepository.findAll();
//	}
////
//	@Override
//	public Book getBookById( Id) {
//		
////		Optional<Book> book = bookRepository.findById(Id);
////		
////		if(book.isPresent())
////		{
////		return book.get();
////		}
////		
////		else {
////		throw new ResourceNotFoundException("Book", "Id", Id);
////		}
//		
//		return bookRepository.findById(Integer.valueOf(Id)).orElseThrow(() -> new ResourceNotFoundException("Book","Id",Id));
//	}


//	@Override
//	public Book getBookById( id){
//		
//		
//		Optional<Book> book = bookRepository.findById(id);
//		
//				
//		if(book.isPresent())
//		{
//		return book.get();
//		}
//		
//		else {
//		throw new ResourceNotFoundException("Book", "Id", id);
//		}
		
//		return null;
	}


