package com.sh.order.model.dto;

import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int orderId;
    private String ordererName;
    private String ordererAddress;
    private LocalDate orderDate;
    private OrderableStatus status;
}
