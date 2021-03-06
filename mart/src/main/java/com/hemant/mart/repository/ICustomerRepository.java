package com.hemant.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemant.mart.model.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{
	Customer findByCustEmailAndCustPassword(String custEmail,String custPassword);
	Customer findByCustEmail(String custEmail);

}
