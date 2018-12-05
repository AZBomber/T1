package service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.OrderMapper;
import pojo.Order;
import pojo.OrderItem;

@Service
public class OrderService {
	@Autowired
	OrderMapper orderMapper;
public void insertOrder(Order order){
	orderMapper.insertOrder(order);
}
public void insertOrderItem(OrderItem orderItem){
	orderMapper.insertOrderItem(orderItem);
}
public void commitOrder(Order order){
	orderMapper.commitOrder(order);
}
public List<Order> findMyOrder(Integer uid){
	List<Order> list=orderMapper.findMyOrder(uid);
	return list;
}
}
