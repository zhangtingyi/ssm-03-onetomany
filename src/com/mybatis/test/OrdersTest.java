package com.mybatis.test;

import java.util.List;

import org.junit.Test;

import com.mybatis.dao.OrdersDao;
import com.mybatis.dao.impl.OrdersDaoImpl;
import com.mybatis.entity.Orders;

public class OrdersTest {
	
	@Test
	public void test() throws Exception {
		OrdersDao ordersdao = new OrdersDaoImpl();
		List<Orders> list = ordersdao.findOrderAndOrderInfo();
		System.out.println(list);
	}
}

