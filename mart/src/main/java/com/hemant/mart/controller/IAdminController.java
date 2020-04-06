package com.hemant.mart.controller;

import java.util.List;

import com.hemant.mart.model.Admin;

public interface IAdminController {
	Admin addAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	String deleteAdmin(int adminId);
	List<Admin> getAllAdmin();

}
