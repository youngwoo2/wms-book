package com.sh.order.model.dto;

import java.time.LocalDateTime;

public class OrderDto {
    private int orderId; // 주문 아이디
    private String ordererName; // 주문자 이름
    private String ordererAddress; // 주문자 주소
    private LocalDateTime orderDate; // 주문 날짜
    private Status status; // 주문상태
    public OrderDto() {
    }

    public OrderDto(int orderId, String ordererName, String ordererAddress, LocalDateTime orderDate, Status status) {
        this.orderId = orderId;
        this.ordererName = ordererName;
        this.ordererAddress = ordererAddress;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrdererName() {
        return ordererName;
    }

    public void setOrdererName(String ordererName) {
        this.ordererName = ordererName;
    }

    public String getOrdererAddress() {
        return ordererAddress;
    }

    public void setOrdererAddress(String ordererAddress) {
        this.ordererAddress = ordererAddress;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderId=" + orderId +
                ", ordererName='" + ordererName + '\'' +
                ", ordererAddress='" + ordererAddress + '\'' +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
    }
}
