package com.hemant.mart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Admin;
import com.hemant.mart.repository.IAdminRepository;
import com.hemant.mart.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	IAdminRepository adminRepo;

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return adminRepo.save(admin);
	}

	@Override
	public String deleteAdmin(int adminId) {
		adminRepo.deleteById(adminId);
		return "admin deleted";
	}

	@Override
	public List<Admin> getAllAdmin() {
		return adminRepo.findAll();
	}

}
