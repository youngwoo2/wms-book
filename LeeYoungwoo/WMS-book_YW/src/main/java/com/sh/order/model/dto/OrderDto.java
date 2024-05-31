package com.sh.order.model.dto;

import com.sh.common.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int orderId;
    private String ordererName;
    private String ordererAddress;
    private LocalDateTime orderDate;
    private OrderStatus status;
}
