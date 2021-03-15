package com.onlinestore.service;

import java.util.Set;

import com.onlinestore.domain.User;
import com.onlinestore.domain.UserBilling;
import com.onlinestore.domain.UserPayment;
import com.onlinestore.domain.UserShipping;
import com.onlinestore.domain.security.PasswordResetToken;
import com.onlinestore.domain.security.UserRole;


public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail (String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}