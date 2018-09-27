package com.sie.full.service;

import java.util.List;

import com.sie.full.model.OrderDetail;

public interface OrderDetailService {
	
	//查询订单详情表
	List<OrderDetail> selectByPrimaryKey(Integer id);
	
	//查询订单总额
	double getOrderPrice(int orderId);
}
