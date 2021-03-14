package com.onlinestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinestore.domain.BookToCartItem;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {

}
