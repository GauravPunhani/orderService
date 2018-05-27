package com.orderservice.model;

import java.util.Date;

public class Order {

	private Long orderId;
	private Date orderDate;
	private String orderItem;
	private Customer customer;
	public Order(Long orderId, Date orderDate, String orderItem,Customer customer) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderItem = orderItem;
		this.customer = customer;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Long getOrderId() {
		return orderId;
	}
}
