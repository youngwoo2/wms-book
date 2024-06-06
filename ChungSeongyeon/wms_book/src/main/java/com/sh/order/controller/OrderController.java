package com.sh.order.controller;

import com.sh.order.model.dto.OrderDto;
import com.sh.order.model.service.OrderService;

public class OrderController {
    private OrderService orderService = new OrderService();

    public void registerOrder(OrderDto order) {
        orderService.registerOrder(order);
    }
}
