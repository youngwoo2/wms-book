package order.controller;

import order.model.entity.Order;
import order.model.service.OrderService;
import user.view.ResultView;

public class OrderController {
    OrderService orderService = new OrderService();
    public void createOrder(Order order) {

        int result = orderService.createOrder(order);
        ResultView.displayCreateOrder(result);
    }
}
