package com.library.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.demo.dao.LibraryDao;
import com.library.demo.model.Library;

@Service
public class LibraryService {

	private LibraryDao libraryDao;
	
	@Autowired
	LibraryService(LibraryDao libraryDao){
		this.libraryDao = libraryDao;
	}
	
	public List<Library> getAllBooks(){
		return libraryDao.getAllBooks();
	}
	
	public Library insertRecord(Library library){
		return libraryDao.insertRecord(library);
	}
}
