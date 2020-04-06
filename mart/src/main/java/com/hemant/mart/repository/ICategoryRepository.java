package com.hemant.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
