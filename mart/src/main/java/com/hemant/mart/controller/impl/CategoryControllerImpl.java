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

import com.hemant.mart.controller.ICategorycontroller;
import com.hemant.mart.model.Category;
import com.hemant.mart.service.ICategoryService;

@RestController
@RequestMapping("category")
public class CategoryControllerImpl implements ICategorycontroller {
	@Autowired
	ICategoryService catServ;

	@Override
	@PostMapping("add")
	public Category addCategory(Category category) {
		return catServ.addCategory(category);
	}

	@Override
	@PutMapping("update")
	public Category updateCategory(Category category) {
		return catServ.updateCategory(category);
	}

	@Override
	@GetMapping
	public List<Category> getAllCategory() {
		return catServ.getAllCategory();
	}

	@Override
	@DeleteMapping("delete/{catId}")
	public String deleteCategory(@PathVariable("catId") int catId) {
		return catServ.deleteCategory(catId);
	}

}
