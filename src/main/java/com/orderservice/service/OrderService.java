package com.orderservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.data.OrderRepository;
import com.orderservice.model.Customer;
import com.orderservice.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	public List<Order> getOrders() {
		//static implementation
		/*Customer cust = new Customer("rohit","karnal");
		Order order1 = new Order(1L, new Date(), "Samsung mobile",cust);
		Order order2 = new Order(2L, new Date(), "T-shirt",cust);
		orderList.add(order1);
		orderList.add(order2);*/
		
		List<Order> orderList = new ArrayList<Order>();
		orderList = orderRepository.findAll();
		return orderList;
	}

}
