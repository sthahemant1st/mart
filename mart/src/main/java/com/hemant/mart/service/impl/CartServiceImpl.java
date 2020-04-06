package com.hemant.mart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Cart;
import com.hemant.mart.repository.ICartRepository;
import com.hemant.mart.service.ICartService;

@Service
public class CartServiceImpl implements ICartService {
	@Autowired
	ICartRepository cartRepo;

	@Override
	public List<Cart> getAllCart() {
		return cartRepo.findAll();
	}

	@Override
	public Cart getCartsById(int cartId) {
		return cartRepo.findById(cartId).get();
	}

	@Override
	public List<Cart> getCartByCustomerId(int custId) {
		return cartRepo.findCartByCustomerId(custId);
	}

	@Override
	public Cart addCart(Cart cart) {
		return cartRepo.save(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return cartRepo.save(cart);
	}

	@Override
	public String deleteCart(int cartId) {
		cartRepo.deleteById(cartId);
		return "cart delete succesful";
	}

}
