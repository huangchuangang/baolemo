package com.sie.full.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sie.full.model.OrderDetail;
import com.sie.full.service.OrderDetailService;

@RestController
public class OrderDetailController {
	@Autowired
	OrderDetailService orderDetailService;
	
	@GetMapping("orderDetail/{orderId}")
	public List<OrderDetail> getDetail(@PathVariable("orderId")int orderId){
		List<OrderDetail> orderDetailList = orderDetailService.selectByPrimaryKey(orderId);
		return orderDetailList;
	}
	
	@GetMapping("orderDetail/{orderId}/price")
	public double getTotalPrice(@PathVariable("orderId")int orderId){
		double totalPrice = orderDetailService.getOrderPrice(orderId);
		return totalPrice;
	}

}
