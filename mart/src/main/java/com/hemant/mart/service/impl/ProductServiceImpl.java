package com.hemant.mart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Product;
import com.hemant.mart.repository.IProductRepository;
import com.hemant.mart.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	IProductRepository prdRepo;

	@Override
	public List<Product> getAllProduct() {
		return prdRepo.findAll();
	}

	@Override
	public Product getProductByName(String prdName) {
		return prdRepo.findByPrdName(prdName);
	}

	@Override
	public Product getProductById(int prdId) {
		
		return prdRepo.findById(prdId).get();
	}

	@Override
	public Product addNewProduct(Product product) {
		return prdRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return prdRepo.save(product);
	}

	@Override
	public String deleteProduct(int prdId) {
		prdRepo.deleteById(prdId);
		return "Product Deleted";
	}

	@Override
	public List<Product> getProductByBrandId(int brandId) {
		return prdRepo.fintProductbyBrandId(brandId);
	}

	@Override
	public List<Product> getProductByCategoryId(int catId) {
		return prdRepo.findProductByCategoryId(catId);
	}

}
