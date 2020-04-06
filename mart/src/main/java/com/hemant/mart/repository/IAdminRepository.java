package com.hemant.mart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hemant.mart.model.Admin;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>{

}
