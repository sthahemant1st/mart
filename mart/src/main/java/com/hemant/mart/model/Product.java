package com.hemant.mart.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int prdId;
	@Column(unique = true)
	private String prdName;
	private int prdPrice;
	private int prdQuantity;
	private Date prdDate;
	private String prdDescription;
	private String prdImage;
	private String prdStatus;
	@OneToOne
	private Category prdCatId;
	@OneToOne
	private Brand prdBrandId;
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	public int getPrdQuantity() {
		return prdQuantity;
	}
	public void setPrdQuantity(int prdQuantity) {
		this.prdQuantity = prdQuantity;
	}
	public Date getPrdDate() {
		return prdDate;
	}
	public void setPrdDate(Date prdDate) {
		this.prdDate = prdDate;
	}
	public String getPrdDescription() {
		return prdDescription;
	}
	public void setPrdDescription(String prdDescription) {
		this.prdDescription = prdDescription;
	}
	public String getPrdImage() {
		return prdImage;
	}
	public void setPrdImage(String prdImage) {
		this.prdImage = prdImage;
	}
	public String getPrdStatus() {
		return prdStatus;
	}
	public void setPrdStatus(String prdStatus) {
		this.prdStatus = prdStatus;
	}
	public Category getPrdCatId() {
		return prdCatId;
	}
	public void setPrdCatId(Category prdCatId) {
		this.prdCatId = prdCatId;
	}
	public Brand getPrdBrandId() {
		return prdBrandId;
	}
	public void setPrdBrandId(Brand prdBrandId) {
		this.prdBrandId = prdBrandId;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + ", prdQuantity="
				+ prdQuantity + ", prdDate=" + prdDate + ", prdDescription=" + prdDescription + ", prdImage=" + prdImage
				+ ", prdStatus=" + prdStatus + ", prdCatId=" + prdCatId + ", prdBrandId=" + prdBrandId + "]";
	}

	
}
