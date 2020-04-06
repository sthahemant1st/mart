package com.hemant.mart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Orders;

@Repository
public interface IOrdreRepository extends JpaRepository<Orders, Integer> {
	@Query(value = "SELECT * FROM orders WHERE odr_cust_id_cust_id=:custId " , nativeQuery = true)
	List<Orders> findOrdersByCustId(int custId);

}
