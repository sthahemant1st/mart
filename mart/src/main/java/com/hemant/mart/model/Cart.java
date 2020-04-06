package com.hemant.mart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue
	private int cartId;
	@OneToOne
	private Product cartPrdId;
	@OneToOne
	private Customer cartCustId;
	private int CartQuantity;
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Product getCartPrdId() {
		return cartPrdId;
	}
	public void setCartPrdId(Product cartPrdId) {
		this.cartPrdId = cartPrdId;
	}
	public Customer getCartCustId() {
		return cartCustId;
	}
	public void setCartCustId(Customer cartCustId) {
		this.cartCustId = cartCustId;
	}
	public int getCartQuantity() {
		return CartQuantity;
	}
	public void setCartQuantity(int cartQuantity) {
		CartQuantity = cartQuantity;
	}
	

}
