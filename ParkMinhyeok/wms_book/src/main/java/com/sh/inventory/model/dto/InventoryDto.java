package com.sh.inventory.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class InventoryDto {
    private int inventoryId;
    private int bookId;
    private int quantity;
    private String location;
    private LocalDateTime lastUpdated;
}
