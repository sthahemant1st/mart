package com.hemant.mart.service;

import java.util.List;

import com.hemant.mart.model.Cart;

public interface ICartService {
	List<Cart> getAllCart();
	Cart getCartsById(int cartId);
	List<Cart> getCartByCustomerId(int custId);
	Cart addCart(Cart cart);
	Cart updateCart(Cart cart);
	String deleteCart(int cartId);

}
