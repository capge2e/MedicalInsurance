package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Books;
import com.example.demo.exceptions.NullUserFound;

public interface BookService {
	
	public Books registerBooks(Books book) throws NullUserFound;
	
	public List<Books> getAllBookss();
	
	public Books getBooksById(Integer pid) throws NullUserFound;
	
	public Books updateBooks(Books book) throws NullUserFound;
	
	public String deleteBooks(Books book) throws NullUserFound;
}