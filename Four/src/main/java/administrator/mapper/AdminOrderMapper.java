package administrator.mapper;

import java.util.List;

import pojo.Order;
import pojo.OrderItem;

public interface AdminOrderMapper {
public List<Order> findAllOrder();
public List<OrderItem> findAllOrderItem();
}
