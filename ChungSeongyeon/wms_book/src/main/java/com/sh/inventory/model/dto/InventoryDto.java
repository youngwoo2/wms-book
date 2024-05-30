package com.sh.inventory.model.dto;

import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDto {
    private int inventoryId;
    private int bookId;
    private int quantity;
    private String location;
    private Timestamp lastUpdated;
}
