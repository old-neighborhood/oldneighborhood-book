package com.oldneighborhood.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.oldneighborhood.demo.entity.Order;


public interface OrderService {
	
	public void save(Order order);
	
	public List<Order> check(String u_ID);

	public void delete(String o_ID);

}
