package com.orderservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="orders")
public class Order {

	@Id
	private String orderId;
	private Date orderDate;
	private String orderItem;
	private Customer customer;
	public Order() {
		
	}
	public Order(String orderId, Date orderDate, String orderItem,Customer customer) {
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
	public String getOrderId() {
		return orderId;
	}
}
