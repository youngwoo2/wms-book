package com.sh.inventory.model.dto;

import java.time.LocalDateTime;

public class InventoryDto {
    private int inventoryId; // 재고 아이디
    private int quantity; // 재고 수량
    private String location; // 재고 위치
    private LocalDateTime lastUpdated; // 마지막 업데이트 일시

    public InventoryDto() {
    }

    public InventoryDto(int inventoryId, int quantity, String location, LocalDateTime lastUpdated) {
        this.inventoryId = inventoryId;
        this.quantity = quantity;
        this.location = location;
        this.lastUpdated = lastUpdated;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "InventoryDto{" +
                "inventoryId=" + inventoryId +
                ", quantity=" + quantity +
                ", location='" + location + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
