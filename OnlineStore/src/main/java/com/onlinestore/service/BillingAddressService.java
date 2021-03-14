package com.onlinestore.service;

import com.onlinestore.domain.BillingAddress;
import com.onlinestore.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
