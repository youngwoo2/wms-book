package com.sh.inventory.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDto {
    private int inventoryId;
    private int bookId;
    private int quantity;
    private String location;
    private LocalDateTime lastUpdated;
}
