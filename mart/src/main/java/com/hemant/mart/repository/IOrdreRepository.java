package com.hemant.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Orders;

@Repository
public interface IOrdreRepository extends JpaRepository<Orders, Integer> {

}
