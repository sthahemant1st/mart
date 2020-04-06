package com.hemant.mart.service;

import java.util.List;

import com.hemant.mart.model.Product;

public interface IProductService {
	List<Product> getAllProduct();
	Product getProductByName(String prdName);
	Product getProductById(int prdId);
	Product addNewProduct(Product product);
	Product updateProduct(Product product);
	String deleteProduct(int prdId);
	List<Product> getProductByBrandId(int brandId);
	List<Product> getProductByCategoryId(int catId);
	
	

}
