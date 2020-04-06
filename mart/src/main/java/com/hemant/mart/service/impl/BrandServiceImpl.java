package com.hemant.mart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Brand;
import com.hemant.mart.repository.IBrandRepository;
import com.hemant.mart.service.IBrandService;

@Service
public class BrandServiceImpl implements IBrandService {
	@Autowired
	IBrandRepository brandRepo;

	@Override
	public Brand addBrand(Brand brand) {
		return brandRepo.save(brand);
	}

	@Override
	public Brand updateBrand(Brand brand) {
		return brandRepo.save(brand);
	}

	@Override
	public List<Brand> getAllBrand() {
		return brandRepo.findAll();
	}

	@Override
	public String deleteBrand(int brandId) {
		brandRepo.deleteById(brandId);
		return "Brand Remove Success!!!";
	}

}
