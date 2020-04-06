package com.hemant.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
	Product findByPrdName(String prdName);

}
