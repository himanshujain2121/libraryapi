package com.library.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.demo.Repository.LibraryRepository;
import com.library.demo.model.Library;

@Component
public class LibraryDao {

	private LibraryRepository libraryRepository;
	
	@Autowired
	LibraryDao(LibraryRepository libraryRepository){
		this.libraryRepository = libraryRepository;
	}
	
	public List<Library> getAllBooks() {
		return libraryRepository.findAll();
	}
	
	public Library insertRecord(Library library){
		return libraryRepository.save(library);
	}
}
