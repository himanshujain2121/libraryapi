package com.library.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.demo.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
