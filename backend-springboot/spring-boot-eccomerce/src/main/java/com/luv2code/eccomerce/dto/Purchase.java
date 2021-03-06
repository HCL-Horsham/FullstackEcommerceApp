package com.luv2code.eccomerce.dto;

import java.util.Set;

import com.luv2code.eccomerce.entity.Address;
import com.luv2code.eccomerce.entity.Customer;
import com.luv2code.eccomerce.entity.Order;
import com.luv2code.eccomerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
	
	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
	
	

}
