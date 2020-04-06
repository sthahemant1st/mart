package com.hemant.mart.controller;

import java.util.List;

import com.hemant.mart.model.Cart;

public interface ICartController {
	List<Cart> getAllCart();
	Cart getCartsById(int cartId);
	List<Cart> getCartByCustomerId(int custId);
	Cart addCart(Cart cart);
	Cart updateCart(Cart cart);
	String deleteCart(int cartId);

}
