package com.h2.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h2.jpa.Book;
import com.h2.jpa.BookRepository;
@Service
public class BookService {

	@Autowired
	BookRepository repository;
	
	 public List<Book> getAll() {
	        final List<Book> books = new ArrayList<>();
	        repository.findAll().forEach(book-> books.add(book));
	        return books;
	    }
	
}
