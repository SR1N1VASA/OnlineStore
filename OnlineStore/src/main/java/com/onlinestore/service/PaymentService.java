package com.onlinestore.service;

import com.onlinestore.domain.Payment;
import com.onlinestore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
