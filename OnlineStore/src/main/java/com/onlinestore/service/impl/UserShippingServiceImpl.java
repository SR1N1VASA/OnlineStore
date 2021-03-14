package com.onlinestore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinestore.domain.UserShipping;
import com.onlinestore.repository.UserShippingRepository;
import com.onlinestore.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findById(id).orElse(null);
	}
	
	public void removeById(Long id) {
		userShippingRepository.deleteById(id);
	}

}
