package com.library.demo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.library.demo.dao.BookDao;
import com.library.demo.model.Book;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {
	@Mock
	BookDao bookDao;
	
	@Test
    public void getFindBookTest()
    {
        when(bookDao.findBook(1234)).thenReturn(getBook());
        BookService bookService = new BookService(bookDao);
        Book book = bookService.findBook(1234);
        assertEquals(book.getBookName(), "java");
    }
	
	public void saveBook() {
		when(bookDao.saveBook(getBook())).thenReturn(getBook());
		 BookService bookService = new BookService(bookDao);
		 Book book  = bookService.saveBook(getBook());
	}
	
	public void getBookList() {
		when(bookDao.getAllBooks()).thenReturn(getAllBookList());
		 BookService bookService = new BookService(bookDao);
		 List<Book> bookList = bookService.getAllBooks();
		 assertEquals(bookList.get(0).getBookName(), "java");
	}
	
	public List<Book> getAllBookList(){
		List<Book> bookList = new ArrayList<>();
		bookList.add(getBook());
		return bookList;
	}
	
	public static Book getBook() {
		Book book = new Book();
		book.setAuthotName("kathie siera");
		book.setBookName("java");
		book.setPrice(500);
		return book;
	}
}
