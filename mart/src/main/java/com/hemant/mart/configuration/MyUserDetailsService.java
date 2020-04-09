package com.hemant.mart.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Customer;
import com.hemant.mart.repository.ICustomerRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	ICustomerRepository custRepo;

	@Override
	public UserDetails loadUserByUsername(String custEmail) throws UsernameNotFoundException {
		Customer customer = custRepo.findByCustEmail(custEmail);
		if(customer==null)
			throw new UsernameNotFoundException("username not found");
		
		return new MyUserDetails(customer);
	
	}

}
