package com.onlinestore.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlinestore.domain.CartItem;
import com.onlinestore.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
