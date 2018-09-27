package com.sie.full.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sie.full.model.Order;
import com.sie.full.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	//订单总表
	@PostMapping("/order")
	public List<Order> getOrder(){
		List<Order> listorder = orderService.getAllOrder();
		return listorder;
	}
	
	//查询订单
	@PostMapping("/order_1/{orderId}")
	public Order getOrder_1(@PathVariable("orderId")int orderId){
		 Order order = orderService.selectByPrimaryKey(orderId);
		 return order;
	}
	

}
