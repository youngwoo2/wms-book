package com.sh.book.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 모든 매개인자 생성자
@Getter
@Setter
@ToString

public class OrderDto {
    private int orderId;
    private String ordererName;
    private String orderrerAddress;
    private LocalDateTime order_date;
    private Status status;
}
