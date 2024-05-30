package com.sh.order.model.dto;

public enum Status {
    pending, // 주문 확인중
    preparing, // 배송 준비중
    shipped, // 발송 완료
    delivered, // 배송 완료
    cancelled // 주문 취소
}
