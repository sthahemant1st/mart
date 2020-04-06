package com.hemant.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Cart;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Integer> {

}
