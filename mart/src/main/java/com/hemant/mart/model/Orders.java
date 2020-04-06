package com.hemant.mart.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue
	private int ordId;
	@OneToOne
	private Customer odrCustId;
	private Date ordDate;
	private String ordStatus;
	@OneToOne
	private Product ordPrdId;
	private int ordQuantity;
	private int ordPrice;
	
	public Customer getOdrCustId() {
		return odrCustId;
	}
	public Date getOrdDate() {
		return ordDate;
	}
	
	public int getOrdId() {
		return ordId;
	}
	public Product getOrdPrdId() {
		return ordPrdId;
	}
	public int getOrdPrice() {
		return ordPrice;
	}
	public int getOrdQuantity() {
		return ordQuantity;
	}
	public String getOrdStatus() {
		return ordStatus;
	}
	public void setOdrCustId(Customer odrCustId) {
		this.odrCustId = odrCustId;
	}
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public void setOrdPrdId(Product ordPrdId) {
		this.ordPrdId = ordPrdId;
	}
	public void setOrdPrice(int ordPrice) {
		this.ordPrice = ordPrice;
	}
	public void setOrdQuantity(int ordQuantity) {
		this.ordQuantity = ordQuantity;
	}
	public void setOrdStatus(String ordStatus) {
		this.ordStatus = ordStatus;
	}
	

}
