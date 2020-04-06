package com.hemant.mart.controller;

import java.util.List;

import com.hemant.mart.model.Category;

public interface ICategorycontroller {
	Category addCategory(Category category);
	Category updateCategory(Category category);
	List<Category> getAllCategory();
	String deleteCategory(int catId);

}
