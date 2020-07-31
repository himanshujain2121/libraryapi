package com.library.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.demo.model.Library;
import com.library.demo.service.LibraryService;

@RestController
public class LibraryController {

	private LibraryService libraryService;
	
	@Autowired
	LibraryController(LibraryService libraryService){
		this.libraryService = libraryService;
	}
	
	@GetMapping("/allBooks")
	public List<Library> getAllBooks() {
		return libraryService.getAllBooks();
	}
	
	@PostMapping("/saveBooks")
	public Library insertRecord(@RequestBody Library library){
		return libraryService.insertRecord(library);
	}
}
