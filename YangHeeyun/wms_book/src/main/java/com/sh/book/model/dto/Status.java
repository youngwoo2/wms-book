package com.sh.book.model.dto;

public enum Status {
    checkOrder, // 주문확인중
    prepareDeliver, // 배송준비중
    sent, // 발송완료
    delieverd, // 배송완료
    orderCancel // 주문취소
}
