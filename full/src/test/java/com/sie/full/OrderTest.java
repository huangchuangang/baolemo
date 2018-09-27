package com.sie.full;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sie.full.dao.KindMapper;
import com.sie.full.dao.OrderMapper;
import com.sie.full.model.Kind;
import com.sie.full.model.Order;
import com.sie.full.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {
	@Autowired
	DataSource dataSource;
//	@Autowired
//	KindMapper kindapper;
//	@Autowired
//	OrderMapper orderMapper;
	
	@Autowired
	OrderService orderService;
	
//	@Test	
//	public void testMydatis()  {
//		
//		Order order = orderMapper.selectByPrimaryKey(1);
//		System.out.println(order);
//
//	}
//	
//	@Test
//	public void testAll(){
//		List<Order> listorder = orderMapper.getAllOrder();
//		System.out.println(listorder);
//	}
//	
//	@Test
//	public void testService(){
//	Order order = orderService.selectByPrimaryKey(1);
//	}
//	
	@Test
	public void testService1(){
		System.out.println(orderService.getAllOrder());
	}

}
