package com.hemant.mart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Customer;
import com.hemant.mart.repository.ICustomerRepository;
import com.hemant.mart.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository custRepo;
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
//	String result = encoder.encode("myPassword");
//	assertTrue(encoder.matches("myPassword", result));

	@Override
	public Customer signupCustomer(Customer customer) {
		
		String result = encoder.encode(customer.getCustPassword());
		customer.setCustPassword(result);
		
		custRepo.save(customer);
		return customer;
	}

	@Override
	public Customer loginCustomer(String custEmail, String custPassword) {
		
		String result = encoder.encode(custPassword);
		custPassword = result;
		
		Customer cust = custRepo.findByCustEmailAndCustPassword(custEmail, custPassword);
		if (cust!=null) {
			return cust;
		}
		return new Customer();
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer = custRepo.findById(id).get();
		 System.out.println(customer);
		return customer;
	}

	@Override
	public String deleteCustomer(int id) {
		custRepo.deleteById(id);
		return "deleated succesfully";
	}

	@Override
	public List<Customer> getAllCustomer() {
		return custRepo.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		String result = encoder.encode(customer.getCustPassword());
		customer.setCustPassword(result);
		return custRepo.save(customer);
	}

	@Override
	public Customer getCustomerByName(String custName) {
		return null;
	}

}
