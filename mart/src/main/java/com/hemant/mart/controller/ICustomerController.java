package com.hemant.mart.controller;

import java.util.List;

import com.hemant.mart.model.Customer;

public interface ICustomerController {
	public String addCustomer( Customer customer);
	public Customer loginCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public String deleteCustomer(int id);
	public List<Customer> getAllCustomer();
	public Customer updateCustomer(Customer customer);

}
