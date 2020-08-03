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

import com.library.demo.dao.LibraryDao;
import com.library.demo.model.Book;
import com.library.demo.model.Library;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryServiceTest {
  @Mock
  LibraryDao libraryDao;
  
  @Test
  public void getAllLibraryTest(){
	  when(libraryDao.getAllBooks()).thenReturn(getAllLibraryBooks());
	  LibraryService libraryService = new LibraryService(libraryDao);
	  List<Library> lib = libraryService.getAllBooks();
	  assertEquals(lib.size(), 0);
	}
	
  public static List<Library> getAllLibraryBooks(){
	  List<Library> libraryList = new ArrayList<>();
	  Library library = new Library();
	  library.setBook(getAllBookList());
	  return libraryList;
  }
  
	public static List<Book> getAllBookList(){
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
