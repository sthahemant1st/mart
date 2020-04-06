package com.hemant.mart.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemant.mart.controller.ICartController;
import com.hemant.mart.model.Cart;
import com.hemant.mart.service.ICartService;

@RestController
@RequestMapping("cart")
public class CartControllerImpl implements ICartController {
	@Autowired
	ICartService cartServ;

	@Override
	@GetMapping
	public List<Cart> getAllCart() {
		return cartServ.getAllCart();
	}

	@Override
	@GetMapping("{cartId}")
	public Cart getCartsById(@PathVariable("cartId") int cartId) {
		return cartServ.getCartsById(cartId);
	}

	@Override
	@GetMapping("bycustomer/{custId}")
	public List<Cart> getCartByCustomerId(@PathVariable("custId") int custId) {
		return cartServ.getCartByCustomerId(custId);
	}

	@Override
	@PostMapping("add")
	public Cart addCart(Cart cart) {
		return cartServ.addCart(cart);
	}

	@Override
	@PutMapping("update")
	public Cart updateCart(Cart cart) {
		return cartServ.updateCart(cart);
	}

	@Override
	@DeleteMapping("delete/{cartId}")
	public String deleteCart(@PathVariable("cartId") int cartId) {
		return cartServ.deleteCart(cartId);
	}

}
