package com.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.model.Order;
import com.orderservice.service.OrderService;

@RestController
public class OrderServiceController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/orders")
	public List<Order> getOrders(){
		return orderService.getOrders();
	}
	@RequestMapping(value= "/orders", method = RequestMethod.POST)
	public String createOrder(@RequestBody Order order){
		return "Order created ";
	}
}
