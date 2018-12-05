package mapper;

import java.util.List;

import pojo.MyOrder;
import pojo.Order;
import pojo.OrderItem;

public interface OrderMapper {
public void insertOrder(Order order);
public void insertOrderItem(OrderItem orderItem);
public void commitOrder(Order order);
public List<Order> findMyOrder(Integer uid);
}
