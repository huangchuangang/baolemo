package com.sie.full.serice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sie.full.dao.OrderMapper;
import com.sie.full.model.Order;
import com.sie.full.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	
	@Autowired
	OrderMapper orderMapper;
	
	@Override
	//查询订单
	public Order selectByPrimaryKey(Integer orderId) {
		// TODO Auto-generated method stub
		orderMapper.selectByPrimaryKey(orderId);
		return orderMapper.selectByPrimaryKey(orderId);
	}

	@Override
	//查询所有订单
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		List<Order> orderlist = orderMapper.getAllOrder();
		return orderlist;
	}

	
	
	
}
