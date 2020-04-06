package com.hemant.mart.service;

import java.util.List;

import com.hemant.mart.model.Admin;

public interface IAdminService {
	Admin addAdmin(Admin admin);
	Admin updateAdmin(Admin admin);
	String deleteAdmin(int adminId);
	List<Admin> getAllAdmin();

}
