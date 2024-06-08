package order.model.dao;

import order.model.entity.Order;
import order.model.entity.OrderItem;

public interface OrderMapper {
    int insertOrder(Order order);

    int insertOrderItem(OrderItem orderItem);
}
