package com.onlinestore.service;

import java.util.List;

import com.onlinestore.domain.Book;

public interface BookService {
	List<Book> findAll ();
	
	Book findOne(Long id);
}
