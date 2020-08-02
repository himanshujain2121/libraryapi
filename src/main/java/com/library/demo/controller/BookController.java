package com.library.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.demo.model.Book;
import com.library.demo.service.BookService;

@RestController
public class BookController {

	private BookService bookService;
	
	@Autowired
	BookController(BookService bookService){
		this.bookService = bookService;
	}
	
	@GetMapping("/all")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
	public Book findBook(@PathVariable(value = "id") Integer id){
		return bookService.findBook(id);
	}
	
	@PutMapping("/update/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable(value = "id") Integer id) {
		return bookService.updateBook(book, id);
	}
}
