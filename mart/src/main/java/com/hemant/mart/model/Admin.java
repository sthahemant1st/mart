package com.hemant.mart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue
	private int adminId;
	private String adminFname;
	private String adminLname;
	private String adminContact;
	private String adminEmail;
	private String adminPassword;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminFname() {
		return adminFname;
	}
	public void setAdminFname(String adminFname) {
		this.adminFname = adminFname;
	}
	public String getAdminLname() {
		return adminLname;
	}
	public void setAdminLname(String adminLname) {
		this.adminLname = adminLname;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	

}
