package com.mybatis.dao;

import java.io.IOException;
import java.util.List;

import com.mybatis.entity.OrderCustomer;

public interface OrdersCustomerDao {
	
	public List<OrderCustomer> findOrderCustomerList() throws IOException;
	
}
