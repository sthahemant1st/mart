package com.hemant.mart.service;

import java.util.List;

import com.hemant.mart.model.Customer;

public interface ICustomerService {
	Customer signupCustomer( Customer customer);
	Customer loginCustomer(String custEmail,String custPassword);
	Customer getCustomerById(int id);
	Customer getCustomerByName(String custName);
	String deleteCustomer(int id);
	List<Customer> getAllCustomer();
	Customer updateCustomer(Customer customer);

}
