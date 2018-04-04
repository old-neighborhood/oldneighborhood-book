package com.oldneighborhood.demo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oldneighborhood.demo.entity.Order;


public interface OrderDao extends JpaRepository<Order, String>{

	@Query(value="select o_name, o_ID, u_ID, g_ID,o_amount, o_price, "
			+ "o_fromDate, o_toDate, o_date"
			+ " from book where u_ID=? order by o_date desc limit 10" , nativeQuery=true)
	List<Order> findByUid(String u_ID);

}
