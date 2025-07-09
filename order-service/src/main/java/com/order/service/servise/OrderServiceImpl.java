package com.order.service.servise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.service.entity.MyOrder;
import com.order.service.repo.MyOrderRepo;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private MyOrderRepo orderRepo;
	
	@Override
	public MyOrder create(MyOrder order) {
		return orderRepo.save(order);
	}

	@Override
	public MyOrder getByOrderId(long id) {
		return orderRepo.findById(id).orElseThrow(()->new RuntimeException("Order not found with order id : "+id));
	}

	@Override
	public List<MyOrder> getOrderByUserId(long id) {
		return orderRepo.findByUserId(id);
	}

}
