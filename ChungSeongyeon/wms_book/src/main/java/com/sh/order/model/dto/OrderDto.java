package com.sh.order.model.dto;

import com.sh.order.model.enums.OrderableStatus;
import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int orderId;
    private String ordererName;
    private String ordererAddress;
    private Timestamp orderDate;
    private OrderableStatus status;
}
