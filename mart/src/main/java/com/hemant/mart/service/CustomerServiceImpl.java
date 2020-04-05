package com.hemant.mart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Customer;
import com.hemant.mart.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository custRepo;

	@Override
	public Customer signupCustomer(Customer customer) {
		custRepo.save(customer);
		return customer;
	}

	@Override
	public Customer loginCustomer(String custEmail, String custPassword) {
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
		return custRepo.save(customer);
	}

}
