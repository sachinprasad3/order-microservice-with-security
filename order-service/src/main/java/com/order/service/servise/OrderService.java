package com.order.service.servise;

import java.util.List;

import com.order.service.entity.MyOrder;

public interface OrderService {
	
	public MyOrder create(MyOrder order);
	
	public MyOrder getByOrderId(long id);
	
	public List<MyOrder> getOrderByUserId(long id);
	
}
