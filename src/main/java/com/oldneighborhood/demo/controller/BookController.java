package com.oldneighborhood.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oldneighborhood.demo.entity.Order;
import com.oldneighborhood.demo.service.OrderService;

@Controller
public class BookController {
	
	@Autowired
	private OrderService orderService; 
	
	@RequestMapping(path= {"/order"} , method = {RequestMethod.POST})
	public String order(@RequestBody Order order) {
		
		orderService.save(order);
		return null;		
	}

	
	@RequestMapping(path= {"/checkOrder/{u_ID}"} , method = {RequestMethod.GET})
	public String checkOrder(@PathVariable(name="u_ID") String u_ID, Map<String ,Object> map) {
		List<Order> orders = orderService.check(u_ID);
		map.put("orders", orders) ;
		return "/list";		
	}
	
	@RequestMapping(path= {"/checkOrder/{u_ID}/{o_ID}"} , method = {RequestMethod.GET})
	public String del (@PathVariable("o_ID") String o_ID , @PathVariable("u_ID") String u_ID) {
		orderService.delete(o_ID);
		return "redirect:/checkOrder/" + u_ID;
	}
}
