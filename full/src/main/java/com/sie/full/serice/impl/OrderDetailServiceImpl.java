package com.sie.full.serice.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sie.full.dao.OrderDetailMapper;
import com.sie.full.model.Order;
import com.sie.full.model.OrderDetail;
import com.sie.full.service.OrderDetailService;


@Service
public class OrderDetailServiceImpl implements OrderDetailService{
	@Autowired
	OrderDetailMapper orderDetailMapper;
	
	@Override
	public List<OrderDetail> selectByPrimaryKey(Integer orderId) {
		List<OrderDetail> orderDetailList = orderDetailMapper.selectByPrimaryKey(orderId);
		return orderDetailList;
	}

	@Override
	public double getOrderPrice(int orderId) {
		// TODO Auto-generated method stub
		double total = 0;
		List<OrderDetail> orderDetailList = orderDetailMapper.selectByPrimaryKey(orderId);
//		Iterator<OrderDetail> it = orderDetailList.iterator();
//		while(it.hasNext()){
//			total+=orderDetailList.getMenuTotal();
//		}
		for(int i=0;i<orderDetailList.size();i++){
			total +=orderDetailList.get(i).getMenuTotal();
		}
		return total;
	}

	

}
