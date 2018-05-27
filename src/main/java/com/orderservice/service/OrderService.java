package com.orderservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.orderservice.model.Customer;
import com.orderservice.model.Order;

@Service
public class OrderService {

	public List<Order> getOrders() {
		Customer cust = new Customer("rohit","karnal");
		Order order1 = new Order(1L, new Date(), "Samsung mobile",cust);
		Order order2 = new Order(2L, new Date(), "T-shirt",cust);
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order1);
		orderList.add(order2);
		return orderList;
	}

}
