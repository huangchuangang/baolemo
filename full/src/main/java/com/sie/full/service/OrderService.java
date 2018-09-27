package com.sie.full.service;

import java.util.List;

import com.sie.full.model.Order;

public interface OrderService {
	
	//查询订单
	Order selectByPrimaryKey(Integer orderId);
	
	
	//查询所有订单
	List<Order> getAllOrder();

}
