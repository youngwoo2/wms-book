package com.sh.order.controller;

import com.sh.order.service.OrderService;

public class OrderController {
    OrderService orderService = new OrderService();
    public void createOrder() {
        orderService.createOrder();
    }

    public void statusOrder() {
        orderService.statusOrder();
    }
}
