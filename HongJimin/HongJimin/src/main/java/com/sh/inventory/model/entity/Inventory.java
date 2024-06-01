package com.sh.inventory.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Inventory {
    private int inventoryId;
    private int bookId;
    private int quantity;
    private String location;
    private LocalDateTime lastUpdated;
}
