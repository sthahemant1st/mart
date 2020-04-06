package com.hemant.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Brand;

@Repository
public interface IBrandRepository extends JpaRepository<Brand, Integer> {

}
