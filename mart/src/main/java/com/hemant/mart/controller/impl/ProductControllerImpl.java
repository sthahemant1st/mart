package com.hemant.mart.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.mart.controller.IProductController;
import com.hemant.mart.model.Product;
import com.hemant.mart.service.IProductService;

@RestController
@RequestMapping("product")
public class ProductControllerImpl implements IProductController {
	
	@Autowired
	IProductService prdServ;

	@Override
	@GetMapping
	public List<Product> getAllProduct() {
		return prdServ.getAllProduct();
	}

	@Override
	@GetMapping("{name}")
	public Product getProductByName(@PathVariable("name") String prdName) {
		return prdServ.getProductByName(prdName);
	}

	@Override
	@GetMapping("{id}")
	public Product getProductById(@PathVariable("id") int prdId) {
		return prdServ.getProductById(prdId);
	}

	@Override
	@PostMapping("add")
	public Product addNewProduct(Product product) {
		return prdServ.addNewProduct(product);
	}

	@Override
	@PutMapping("update")
	public Product updateProduct(Product product) {
		return prdServ.updateProduct(product);
	}

	@Override
	@DeleteMapping("delete")
	public String deleteProduct(int prdId) {
		return prdServ.deleteProduct(prdId);
	}

}
