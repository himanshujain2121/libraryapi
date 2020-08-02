package com.library.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.demo.Repository.BookRepository;
import com.library.demo.model.Book;
@Component
public class BookDao {

	private BookRepository bookRepository;
	
	@Autowired
	BookDao(BookRepository bookRepository){
		this.bookRepository  = bookRepository;
	}
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	public Book findBook(Integer id) {
		return bookRepository.findByBid(id);
	}
	
	public Book updateBook(Book book, Integer id) {
		Book bookData = bookRepository.findByBid(id);
		if (bookData != null) {
			bookData.setAuthotName(book.getAuthotName());
			bookData.setBookName(book.getBookName());
			bookData.setPrice(book.getPrice());
			Book updatedBook = bookRepository.save(bookData);
			return updatedBook;
		} else {
			return null;
		}
	}
}
