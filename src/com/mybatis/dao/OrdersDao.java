package com.mybatis.dao;

import java.util.List;

import com.mybatis.entity.Orders;

public interface OrdersDao {
	
	public List<Orders> findOrderAndOrderInfo();
	
}
