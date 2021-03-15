package com.onlinestore.service;

import java.util.List;

import com.onlinestore.domain.Book;
import com.onlinestore.domain.CartItem;
import com.onlinestore.domain.Order;
import com.onlinestore.domain.ShoppingCart;
import com.onlinestore.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
