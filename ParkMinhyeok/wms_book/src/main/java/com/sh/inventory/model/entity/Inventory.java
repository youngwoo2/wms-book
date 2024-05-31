package com.sh.inventory.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Inventory {
    private int inventoryId;
    private int bookId;
    private int quantity;
    private String location;
    private LocalDateTime lastUpdated;
}
