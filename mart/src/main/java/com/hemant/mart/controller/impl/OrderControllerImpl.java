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

import com.hemant.mart.controller.IOrderController;
import com.hemant.mart.model.Orders;
import com.hemant.mart.service.IOrderService;

@RestController
@RequestMapping("order")
public class OrderControllerImpl implements IOrderController {
	@Autowired
	IOrderService ordServ;

	@Override
	@GetMapping
	public List<Orders> getAllOrders() {
		return ordServ.getAllOrders();
	}

	@Override
	@GetMapping("{id}")
	public Orders getOrdersById(@PathVariable("id") int ordId) {
		return ordServ.getOrdersById(ordId);
	}

	@Override
	@GetMapping("bycustomer/{custId}")
	public List<Orders> getOrderByCustomerId(@PathVariable("custId") int custId) {
		return ordServ.getOrderByCustomerId(custId);
	}

	@Override
	@PostMapping("add")
	public Orders addOrder(Orders orders) {
		return ordServ.addOrder(orders);
	}

	@Override
	@PutMapping("update")
	public Orders updateOrder(Orders order) {
		return ordServ.updateOrder(order);
	}

	@Override
	@DeleteMapping("delete/{ordId}")
	public String deleteOrder(@PathVariable("ordId") int OrdId) {
		
		return ordServ.deleteOrder(OrdId);
	}

}
