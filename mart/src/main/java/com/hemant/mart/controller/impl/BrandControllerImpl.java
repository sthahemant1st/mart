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

import com.hemant.mart.controller.IBrandConntroller;
import com.hemant.mart.model.Brand;
import com.hemant.mart.service.IBrandService;

@RestController
@RequestMapping("brand")
public class BrandControllerImpl implements IBrandConntroller {
	@Autowired
	IBrandService brandServ;

	@Override
	@PostMapping("add")
	public Brand addBrand(Brand brand) {
		return brandServ.addBrand(brand);
	}

	@Override
	@PutMapping("update")
	public Brand updateBrand(Brand brand) {
		return brandServ.updateBrand(brand);
	}

	@Override
	@GetMapping
	public List<Brand> getAllBrand() {
		return brandServ.getAllBrand();
	}

	@Override
	@DeleteMapping("delete/{id}")
	public String deleteBrand(@PathVariable("id")	int brandId) {
		return brandServ.deleteBrand(brandId);
	}

}
