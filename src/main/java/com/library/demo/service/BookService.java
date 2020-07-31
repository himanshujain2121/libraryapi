package com.library.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.demo.dao.BookDao;
import com.library.demo.model.Book;

@Service
public class BookService {

	private BookDao bookDao;
	
	@Autowired
	BookService(BookDao bookDao){
		this.bookDao = bookDao;
	}
	
	public List<Book> getAllBooks(){
		return bookDao.getAllBooks();
	}
	
	public Book saveBook(Book book) {
		return bookDao.saveBook(book);
	}
	
	public Book updateBook(Book book,Integer id) {
		return bookDao.updateBook(book,id);
	}
}
