package com.hemant.mart.controller;

import java.util.List;

import com.hemant.mart.model.Product;

public interface IProductController {
	List<Product> getAllProduct();
	Product getProductByName(String prdName);
	Product getProductById(int prdId);
	Product addNewProduct(Product product);
	Product updateProduct(Product product);
	String deleteProduct(int prdId);

}
