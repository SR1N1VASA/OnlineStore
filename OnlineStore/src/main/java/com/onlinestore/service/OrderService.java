package com.onlinestore.service;

import com.onlinestore.domain.BillingAddress;
import com.onlinestore.domain.Order;
import com.onlinestore.domain.Payment;
import com.onlinestore.domain.ShippingAddress;
import com.onlinestore.domain.ShoppingCart;
import com.onlinestore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
