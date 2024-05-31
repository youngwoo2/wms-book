package com.sh.order_item.model.dto;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class OrderItemDto {
    private int orderItemId;
    private int orderId;
    private int bookId;
    private int quantity;
}
