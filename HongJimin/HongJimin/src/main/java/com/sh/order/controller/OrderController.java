package com.sh.order.controller;

import com.sh.common.ErrorView;
import com.sh.common.error.ErrorCode;
import com.sh.order.model.entity.Order;
import com.sh.order.model.service.OrderService;
import com.sh.order.model.exception.CreateOrderTransactionException;
import com.sh.order.view.OrderResultView;

public class OrderController {
    OrderService orderService = new OrderService();
//    public void insertOrder() {
//        orderService.insertOrder();
//    }

//    public void fulfillOrder() {
//        orderService.fulfillOrder();
//    }

    public void createOrder(Order order) {
        try {
            int result = orderService.createOrder(order);
            OrderResultView.displayResult("도서 주문서 등록 ", result);
        } catch (CreateOrderTransactionException e) {
            e.printStackTrace();
            ErrorView.displayError(e.getErrorCode());
        } catch (Exception e) {
            ErrorView.displayError(ErrorCode.CREATE_ORDER_ERROR);
        }
    }
}
