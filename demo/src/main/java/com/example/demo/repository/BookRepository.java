package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {
	
	@Query("from Books b where b.id=:id")
	public Books getBookById(@Param(value="id")Integer id );

}