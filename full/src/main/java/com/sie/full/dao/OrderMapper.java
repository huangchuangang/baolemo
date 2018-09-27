package com.sie.full.dao;

import java.util.List;

import com.sie.full.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);


    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    //查询订单
    List<Order> selectByPrimaryKey(Integer orderId);
    
    //查询所有订单
    List<Order> getAllOrder();
}