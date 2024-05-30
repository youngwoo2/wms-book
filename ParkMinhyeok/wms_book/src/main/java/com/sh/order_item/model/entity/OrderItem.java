package com.sh.order_item.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class OrderItem {
    private int orderItemId;
    private int orderId;
    private int bookId;
    private int quantity;
}
