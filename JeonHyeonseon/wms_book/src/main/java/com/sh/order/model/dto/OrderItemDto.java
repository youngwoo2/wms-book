package com.sh.order.model.dto;

import lombok.*;
@Data // @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private int orderItemId; // 주문항목 아이디
    private int orderId; // 주문 아이디
    private int bookId; // 도서 아이디
    private int quantity; // 수량

    private OrderDto order;
}
