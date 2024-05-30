package com.sh.book.controller;

import com.sh.book.service.OrderService;

public class OrderController {
    OrderService orderService = new OrderService();
    public void createOrder() {
        orderService.createOrder();
    }

    public void statusOrder() {
        orderService.statusOrder();
    }
}
