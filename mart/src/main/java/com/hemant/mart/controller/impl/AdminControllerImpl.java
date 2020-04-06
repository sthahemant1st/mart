package com.hemant.mart.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.mart.controller.IAdminController;
import com.hemant.mart.model.Admin;
import com.hemant.mart.service.IAdminService;

@RestController
@RequestMapping("admin")
public class AdminControllerImpl implements IAdminController {
	@Autowired
	IAdminService adminServ;

	@Override
	@PostMapping("add")
	public Admin addAdmin(Admin admin) {
		return adminServ.addAdmin(admin);
	}

	@Override
	@PutMapping("update")
	public Admin updateAdmin(Admin admin) {
		return adminServ.updateAdmin(admin);
	}

	@Override
	@DeleteMapping("delete")
	public String deleteAdmin(int adminId) {
		return deleteAdmin(adminId);
	}

	@Override
	@GetMapping
	public List<Admin> getAllAdmin() {
		return adminServ.getAllAdmin();
	}

}
