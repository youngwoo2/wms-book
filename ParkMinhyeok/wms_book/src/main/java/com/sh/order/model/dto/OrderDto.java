package com.sh.order.model.dto;

import com.sh.order.model.entity.Status;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class OrderDto {
    private int orderId;
    private int userId;
    private LocalDateTime orderDate;
    private Status status;
}
