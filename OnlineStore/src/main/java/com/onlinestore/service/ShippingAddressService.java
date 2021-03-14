package com.onlinestore.service;

import com.onlinestore.domain.ShippingAddress;
import com.onlinestore.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
