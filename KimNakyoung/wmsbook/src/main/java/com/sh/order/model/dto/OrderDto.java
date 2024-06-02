package com.sh.order.model.dto;

// 1. 주문 생성 (고객 주문 생성 (주문 번호, 고객 정보, 주문 도서, 수량, 배송지 정보 등))
// 2. 주문 처리 ("주문 상태 관리 (주문 접수, 처리 중, 배송 중, 완료 등)")

import java.sql.Timestamp;

public class OrderDto {
    private int orderId; // 주문번호
    private String orderName; //고객 정보
    private String orderAddress; // 배송지 주소
    private Timestamp orderDate; // 주문 일자
    private Status status; // 주문 상태 관리 enum // 주문처리때 쓸듯
    // enum("주문확인중,"배송준비중","발송완료","배송중","배송완료","주문취소")
    private int orderItemId; // 주문 상품 번호 (주문 도서)

    private int bookId; // 도서코드
    private int quantity; // 주문량

    public OrderDto() {
    }

    public OrderDto(int orderId, String orderName, String orderAddress, Timestamp orderDate, Status status, int orderItemId, int bookId, int quantity) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.status = status;
        this.orderItemId = orderItemId;
        this.bookId = bookId;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderDate=" + orderDate +
                ", status=" + status +
                ", orderItemId=" + orderItemId +
                ", bookId=" + bookId +
                ", quantity=" + quantity +
                '}';
    }
}
