package com.sh.order.view;

import com.sh.order.controller.OrderController;

import java.util.Scanner;

public class OrderView {
    private OrderController orderController = new OrderController();
    private Scanner sc = new Scanner(System.in);

    public void orderMenu() {
        String menu = """
                    [주문 메뉴 선택]
                =====================
                     1. 주문 생성
                     2. 주문 상태
                     0. 돌아가기
                =====================
                입력 : """;
        System.out.println(menu);
        String choice = sc.next();
        switch (choice) {
            case "1" : break;
            case "2" : break;
            case "0" : return;
            default:
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
        }
    }
}
