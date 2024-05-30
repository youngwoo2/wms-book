package com.sh.account.model;

public enum Status {
    주문확인중("주문확인중"),
    배송준비중("배송준비중"),
    발송완료("발송완료"),
    배송중("배송중"),
    배송완료("배송완료"),
    주문취소("주문취소");

    private final String value;

    Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
