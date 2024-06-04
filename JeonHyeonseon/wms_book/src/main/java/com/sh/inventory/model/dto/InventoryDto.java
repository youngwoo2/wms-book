package com.sh.inventory.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class InventoryDto {
    private int inventoryId; // 재고 아이디
    private int quantity; // 재고 수량
    private String location; // 재고 위치
    private LocalDateTime lastUpdated; // 마지막 업데이트 일시

}
