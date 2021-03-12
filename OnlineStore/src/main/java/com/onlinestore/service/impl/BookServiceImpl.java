package com.onlinestore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinestore.domain.Book;
import com.onlinestore.repository.BookRepository;
import com.onlinestore.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findAll() {
		return (List<Book>) bookRepository.findAll();
	}
	
	public Book findOne(Long id) {
		return bookRepository.findById(id).orElse(null);
	}

}
