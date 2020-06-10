package com.h2.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.jpa.Book;
import com.h2.serv.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
	
	 @GetMapping(value= "/book/getall", produces= "application/json")
	   public List<Book> getAll() {
	       
	        return service.getAll();
	    }
	
	
}
