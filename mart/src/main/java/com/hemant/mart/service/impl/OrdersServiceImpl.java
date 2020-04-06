package com.hemant.mart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemant.mart.model.Orders;
import com.hemant.mart.repository.IOrdreRepository;
import com.hemant.mart.service.IOrderService;

@Service
public class OrdersServiceImpl implements IOrderService {
	@Autowired
	IOrdreRepository ordRepo;

	@Override
	public List<Orders> getAllOrders() {
		return ordRepo.findAll();
	}

	@Override
	public Orders getOrdersById(int ordId) {
		return ordRepo.findById(ordId).get();
	}

	@Override
	public List<Orders> getOrderByCustomerId(int custId) {
		return ordRepo.findOrdersByCustId(custId);
	}

	@Override
	public Orders addOrder(Orders orders) {
		return ordRepo.save(orders);
	}

	@Override
	public Orders updateOrder(Orders orders) {
		return ordRepo.save(orders);
	}

	@Override
	public String deleteOrder(int ordId) {
		ordRepo.deleteById(ordId);
		return "order delete successfull";
	}

}
