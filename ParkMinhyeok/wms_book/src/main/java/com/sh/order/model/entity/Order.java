package com.sh.order.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Order {
    private int orderId;
    private int userId;
    private LocalDateTime orderDate;
    private Status status;
}
