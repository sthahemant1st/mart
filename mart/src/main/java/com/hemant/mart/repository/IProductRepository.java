package com.hemant.mart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
	
	Product findByPrdName(String prdName);
	
	@Query(value = "SELECT * FROM product WHERE prd_cat_id_cat_id = :catId" , nativeQuery = true)
	List<Product> findProductByCategoryId(int catId);
	
	@Query(value = "SELECT * FROM product WHERE prd_brand_id_brand_id = :brandId" , nativeQuery = true)
	List<Product> fintProductbyBrandId(int brandId);

}
