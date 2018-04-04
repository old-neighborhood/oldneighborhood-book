package com.oldneighborhood.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oldneighborhood.demo.dao.OrderDao;
import com.oldneighborhood.demo.entity.Order;
import com.oldneighborhood.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void save(Order order) {
		orderDao.save(order);
	}
	
	@Override
	public List<Order> check(String u_ID){
		return orderDao.findByUid(u_ID);
		
	}
	@Override
	public void delete(String o_ID) {
		orderDao.delete(o_ID);
	}

}
