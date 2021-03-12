package com.onlinestore.repository;


import org.springframework.data.repository.CrudRepository;

import com.onlinestore.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
