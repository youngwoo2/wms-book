package order.controller;


import order.model.entity.Order;
import order.model.service.OrderService;
import order.view.OrderResultView;

public class OrderController {
    OrderService orderService = new OrderService();

    public void createOrder(Order order) {

        int result = orderService.createOrder(order);
        OrderResultView.displayCreateOrder(result);

    }
}
