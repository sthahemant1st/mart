package com.hemant.mart.service;

import java.util.List;

import com.hemant.mart.model.Category;

public interface ICategoryService {
	Category addCategory(Category category);
	Category updateCategory(Category category);
	List<Category> getAllCategory();
	String deleteCategory(int catId);

}
