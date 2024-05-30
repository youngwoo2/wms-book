package com.sh.order.view;

import com.sh.order.controller.OrderController;

import java.util.Scanner;

public class OrderView {
    Scanner sc = new Scanner(System.in);
    OrderController orderController = new OrderController();

    public void orderMenu() {
        String orderMenu = """
                ==============================
                 📑주문 관리 메뉴를 선택해주세요📑
                        1. 주문 생성
                        2. 주문 처리
                        3. 뒤로 가기
                ==============================
                """;
        System.out.println(orderMenu);
        String choice = sc.next();
        switch (choice) {
            case "1" :
                // 1. 주문 생성
                orderController.insertOrder();
                break;
            case "2":
                // 2. 주문 처리
                orderController.fulfillOrder();
                break;
            case "3" :
                // 3. 뒤로 가기
                return;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요😥");
    }
}
}
