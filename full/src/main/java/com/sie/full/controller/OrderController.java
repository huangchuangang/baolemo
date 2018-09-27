package com.sie.full.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sie.full.model.Order;
import com.sie.full.model.OrderDetail;
import com.sie.full.service.OrderDetailService;
import com.sie.full.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	@Autowired
	OrderDetailService orderDetailService;
	
	//订单总表
//	@GetMapping("/order")
	@RequestMapping(value = "/orderlist", method = RequestMethod.POST)
	public List<Order> getOrder(){
		List<Order> listorder = orderService.getAllOrder();
		return listorder;
	}
	
	//查询订单
//	@GetMapping("/selectorder/{orderId}")
	@RequestMapping(value = "/selectorder", method = RequestMethod.POST)
	public List<Order> selectOrder(Order order){
//		 int orderId = 1;
		System.out.println(order.getOrderId());
//		 Order order = orderService.selectByPrimaryKey(order.getOrderId());
		 return orderService.selectByPrimaryKey(order.getOrderId());
	}
	//订单详情
//	@GetMapping("orderDetail/{orderId}")
	@RequestMapping(value = "/orderDetail", method = RequestMethod.POST)
	public List<OrderDetail> getDetail(Order order){
		System.out.println(order.getOrderId());
		List<OrderDetail> orderDetailList = orderDetailService.selectByPrimaryKey(order.getOrderId());
		return orderDetailList;
	}
	
	@GetMapping("orderDetail_Price/{orderId}")
	public double getTotalPrice(@PathVariable("orderId")int orderId){
		double totalPrice = orderDetailService.getOrderPrice(orderId);
		return totalPrice;
	}

}
