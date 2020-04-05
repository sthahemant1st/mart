package com.hemant.mart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.mart.model.Customer;
import com.hemant.mart.service.CustomerService;

@RestController
public class CustomerControllerImpl implements CustomerController {
	
	@Autowired
	CustomerService custService;
	
	@PostMapping("customer/signup")
	public Customer signupCustomer(@RequestBody Customer customer) {
		
		custService.signupCustomer(customer);
		System.out.println(customer);
		return customer;		
	}
	
	@PostMapping("login")
	public Customer loginCustomer(String custEmail,String custPassword) {
		
		return custService.loginCustomer(custEmail, custPassword);
		
	}
	@GetMapping("customer/{id}")
	public Customer getCustomerById(@PathVariable(value = "id") int id) {
		
		 return custService.getCustomerById(id);	
	}
	
	@DeleteMapping("customer/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		 
		 return custService.deleteCustomer(id);	
	}
	
	@GetMapping("customer")
	public List<Customer> getAllCustomer(){
		return custService.getAllCustomer();		
	}
	@PutMapping("customer/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return custService.updateCustomer(customer);
		
	}

}
