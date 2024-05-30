package com.sh.order.view;
// 1. 주문 생성 (고객 주문 생성 (주문 번호, 고객 정보, 주문 도서, 수량, 배송지 정보 등))
// 2. 주문 처리 ("주문 상태 관리 (주문 접수, 처리 중, 배송 중, 완료 등)")


import com.sh.order.controller.OrderController;

import java.util.Scanner;

public class OrderView {
    private OrderController orderController = new OrderController();

    private Scanner sc = new Scanner(System.in);

    public void mainOrderMenu() {
        String orderMenu = """
                =====================
                1.주문 생성
                2.주문 처리
                0.종료
                =====================
                입력 : """;
        System.out.println("주문관리를 선택하셨습니다.");
        while (true) {
            System.out.print(orderMenu);
            String choice = sc.next();
            switch (choice) {
                case "1" :
                    System.out.println("주문 생성합니다.");
                    break;
                case "2" :
                    System.out.println("주문 처리합니다.");
                    break;
                case "0" :
                    return;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }
    }

}
