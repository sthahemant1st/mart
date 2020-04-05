package com.hemant.mart.service;

import java.util.List;

import com.hemant.mart.model.Customer;

public interface CustomerService {
	public Customer signupCustomer( Customer customer);
	public Customer loginCustomer(String custEmail,String custPassword);
	public Customer getCustomerById(int id);
	public String deleteCustomer(int id);
	public List<Customer> getAllCustomer();
	public Customer updateCustomer(Customer customer);

}
