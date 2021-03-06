package com.hemant.mart.controller;

import java.util.List;

import com.hemant.mart.model.Orders;

public interface IOrderController {
	List<Orders> getAllOrders();
	Orders getOrdersById(int ordId);
	List<Orders> getOrderByCustomerId(int custId);
	Orders addOrder(Orders orders);
	Orders updateOrder(Orders order);
	String deleteOrder(int OrdId);

}
