package com.sh.order.view;

import java.util.Scanner;

public class OrderView {
    Scanner sc = new Scanner(System.in);
    public void orderMenu() {
            String orderMenu = """
                    [주문 관리 메뉴 선택]
                     1. 주문 생성
                     2. 주문 처리
                     0. 뒤로 가기
                    """;
        while (true) {
            System.out.println(orderMenu);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("주문 생성");
                    break;
                case "2":
                    System.out.println("주문 처리");
                    break;
                case "0":
                    return;
                default:
                    System.out.println("❌잘못된 입력.. 다시 입력해주세요.❌");
            }
        }
    }
}