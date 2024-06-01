package com.sh.order.controller;

import com.sh.order.model.service.OrderService;

public class OrderController {
    OrderService orderService = new OrderService();
    public void insertOrder() {
        orderService.insertOrder();
    }

    public void fulfillOrder() {
        orderService.fulfillOrder();
    }
}
