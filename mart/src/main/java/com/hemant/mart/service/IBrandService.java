package com.hemant.mart.service;

import java.util.List;

import com.hemant.mart.model.Brand;

public interface IBrandService {
	Brand addBrand(Brand brand);
	Brand updateBrand(Brand brand);
	List<Brand> getAllBrand();
	String deleteBrand(int brandId);

}
