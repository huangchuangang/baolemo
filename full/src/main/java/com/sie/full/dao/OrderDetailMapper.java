package com.sie.full.dao;

import java.util.List;

import com.sie.full.model.Menu;
import com.sie.full.model.OrderDetail;

public interface OrderDetailMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);
    
    //查询订单详情
    List<OrderDetail> selectByPrimaryKey(Integer id);

    //更新订单详情
    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}