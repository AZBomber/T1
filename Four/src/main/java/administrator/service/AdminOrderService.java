package administrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import administrator.mapper.AdminOrderMapper;
import pojo.Order;
import pojo.OrderItem;

@Service
public class AdminOrderService {
@Autowired
AdminOrderMapper adminOrderMapper;
public List<Order> findAllOrder(){
	return adminOrderMapper.findAllOrder();
}
public List<OrderItem> findAllOrderItem(){
	return adminOrderMapper.findAllOrderItem();
}
}
