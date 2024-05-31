package com.sh.Inventory.model.dto;

// 1. 재고 조회 실시간 재고 현황 조회 (도서별, 창고별 재고량)
// 2. 재고 입고 (새로운 도서 입고 처리 (입고량, 입고 날짜, 공급업체 등 정보 입력))
// 3. 재고 출고 (출고 처리 (출고량, 출고 날짜, 출고 목적 등 정보 입력))
// 4. 재고 이동 (창고 간 재고 이동 처리 (이동량, 이동 날짜 등 정보 입력))

import java.sql.Timestamp;

public class InventoryDto {

    private int inventoryId; // 재고아이디
    private int bookId; // 도서코드
    private int quantity; // 수량
    private String location; // 창고위치
    private Timestamp lastUpdated; // 처리날짜

    public InventoryDto() {
    }

    public InventoryDto(int inventoryId, int bookId, int quantity, String location, Timestamp lastUpdated) {
        this.inventoryId = inventoryId;
        this.bookId = bookId;
        this.quantity = quantity;
        this.location = location;
        this.lastUpdated = lastUpdated;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getLocation() {
        return location;
    }

    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "InventoryDto{" +
                "inventoryId=" + inventoryId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                ", location='" + location + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
