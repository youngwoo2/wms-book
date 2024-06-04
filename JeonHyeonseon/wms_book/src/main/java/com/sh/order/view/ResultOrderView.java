package com.sh.order.view;

import com.sh.order.model.dto.OrderDto;

import java.util.List;

public class ResultOrderView {

    public static void displayOrdererList(List<OrderDto> orderList) {
        System.out.print("> ");
        for (int i = 0; i < orderList.size(); i++) {
            OrderDto orderDto = orderList.get(i);
            System.out.printf("%s.%s", orderDto.getOrdererName(), orderDto.getOrdererAddress());
        }
        System.out.println();
    }
}
