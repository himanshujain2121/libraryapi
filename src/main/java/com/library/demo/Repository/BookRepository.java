package com.library.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.demo.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

   Book findByBid(Integer id);
}
