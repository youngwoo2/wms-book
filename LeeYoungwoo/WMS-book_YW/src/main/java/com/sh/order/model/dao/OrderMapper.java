package com.sh.order.model.dao;

import com.sh.order.model.OrderStatus;
import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.dto.OrderItemDto;

import java.util.List;

public interface OrderMapper {
    int insertOrder(OrderDto order);

    int insertOrderMenu(OrderItemDto orderItemDto);

    List<OrderDto> findByStatus(OrderStatus orderStatus);

    OrderDto findByOrderStatus(OrderStatus orderStatus);
}
