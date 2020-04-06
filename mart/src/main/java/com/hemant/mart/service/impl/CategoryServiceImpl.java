package com.hemant.mart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Category;
import com.hemant.mart.repository.ICategoryRepository;
import com.hemant.mart.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	ICategoryRepository catRepo;

	@Override
	public Category addCategory(Category category) {

		return catRepo.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		
		return catRepo.save(category);
	}

	@Override
	public List<Category> getAllCategory() {
		return catRepo.findAll();
	}

	@Override
	public String deleteCategory(int catId) {
		catRepo.deleteById(catId);
		return "Category remove Sucess!!!";
	}

}
