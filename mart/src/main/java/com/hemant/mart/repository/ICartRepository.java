package com.hemant.mart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Cart;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {
	
	@Query(value = "SELECT * FROM cart WHERE cart_cust_id_cust_id = :custId" , nativeQuery = true)
	List<Cart> findCartByCustomerId(int custId);

}
