package com.sh.order.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderDto {
    private int orderId; // 주문 아이디
    private String ordererName; // 주문자 이름
    private String ordererAddress; // 주문자 주소
    private LocalDateTime orderDate; // 주문 날짜
    private Status status; // 주문상태
}
