package com.hemant.mart.controller;

import java.util.List;

import com.hemant.mart.model.Brand;

public interface IBrandConntroller {
	Brand addBrand(Brand brand);
	Brand updateBrand(Brand brand);
	List<Brand> getAllBrand();
	String deleteBrand(int brandId);


}
