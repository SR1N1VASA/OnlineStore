package com.onlinestore.service;

import java.util.List;

import com.onlinestore.domain.CartItem;
import com.onlinestore.domain.ShoppingCart;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
}
