package com.order.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.service.entity.MyOrder;

@Repository
public interface MyOrderRepo extends JpaRepository<MyOrder, Long>{

	public List<MyOrder> findByUserId(long id);

}
